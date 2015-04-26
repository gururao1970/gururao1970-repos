package cscie259.project4.scamazon;

import java.io.*;
import java.util.*;
import java.util.Enumeration;
import java.util.LinkedList;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.xml.transform.ErrorListener;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.URIResolver;

import javax.xml.transform.sax.SAXSource;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.dom.DOMSource;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.*;
import org.w3c.dom.Node;
import org.apache.xml.serialize.*;
import javax.xml.parsers.ParserConfigurationException;




import cscie259.project4.scamazon.CartCheckOutItems;



/**
 * This servlet implements Scamazon.com's shopping cart.
 *
 * Any references to the local file system are resolved
 * with respect to project4-7.0/webapps/scamazon/, per
 * ScamazonServlet's implementation of javax.xml.transform.URIResolver.
 * <p/>
 * You MUST modify this file.
 *
 * @author  Computer Science E-259
 * @version 8.0
 *
 * @author  YOUR NAME GOES HERE
 **/

public class Cart extends ScamazonServlet 
{
 
   
   private LinkedList <CartCheckOutItems> cartLists = null;
   private static final int MAX_NUM_PARAM = 7;
   
   private CartCheckOutItems cartItem = null;
   
   private String[] allParamNames = new String[] {"labelKey", "itemDes", "LabelDes", "description", "price", "quantity" };
   private String[] allParamValues = new String[MAX_NUM_PARAM];
   private int amount = 0;
   private boolean header = true;
   private String styleSheetFile = new String();
   private int CheckoutCount = 0;
   private boolean sendToPurchse = false;
   private boolean buildDom = false;
   
   private String[] CheckOutItems;

   private DocumentBuilderFactory dbf;
   private DocumentBuilder db;
   private Document dom;
   private Element rootEle;
   private String ProcessAck;

	/**
     * Handles operations involving the shopping cart.
     *
     * @param request HTTP request object
     * @param response HTTP response object
     *
     * @throws IOException if an IO-related error occurs
     * @throws ServletException if a servlet-related error occurs
     **/

    public void doWork(HttpServletRequest request, 
                          HttpServletResponse response)
    throws IOException, ServletException
    {
      // output text/html MIME type
	  response.setContentType("text/html");			
	  System.out.println("### Servlet:Cart#######");
	  // retrieve PrintWriter
	  PrintWriter out = response.getWriter();			
	  HttpSession session = request.getSession(true);
	  cartLists = (LinkedList <CartCheckOutItems>) session.getValue (session.getId());
	  System.out.println ("Cart:doWork############# size:" + cartLists.size() );
	  if (cartLists.size() == 0)
	  {
        System.out.println ("No items in cartLists:" );
		//return;
	  }			
	  try{				
        // pass HTTP parameters to stylesheet		    
        Enumeration names = request.getParameterNames();
		System.out.println("HTTP parameters" + names);
		while (names.hasMoreElements())
		{
		  String name = (String)names.nextElement(); // read the first name and value
		  String value = request.getParameter(name);
		  System.out.println ("name:" + name + "value" + value);
		  if (name.equals("Remove")){
		     for (int i=0; i<cartLists.size(); i++){
			  cartItem = cartLists.get(i);
			  if (value.equals(cartItem.getTypekey())){
			    cartLists.remove( cartItem); 
				break;
			  }  
			}
		  }
		  else if (name.equals("CheckOut")){
			createDocument(); // create once
			int count = cartLists.size();	
			for (int i = 0; i< count; i++)
			{
			  cartItem = cartLists.get(i);
              rootEle.appendChild(createItemElement(cartItem));
			}  
			//Serialize DOM
  		    OutputFormat format    = new OutputFormat(dom); 
			format.setIndenting(true);
  			// as a String
  			StringWriter stringOut = new StringWriter ();    
            XMLSerializer serial   = new XMLSerializer (stringOut, 
                                              format);
  			serial.serialize(dom);
  			// Display the XML
  			System.out.println("Sending DOM tree to Web service..........");
            
			//Proxy.processPO(stringOut.toString(),"localhost",8080);

		   //	System.out.println(Proxy.processPO(stringOut.toString(),"localhost",8080));

			
			
		   // set content-type header before accessing the Writer
		  // response.setContentType("text/html");
		    out = response.getWriter();

		   out.println(Proxy.processPO(stringOut.toString(),"localhost",8080));
			
			return;
          }
		  													 	
		  else if (!(value.equals("show"))) // to Show the updated quantity set the Quantitiy
		  {
		    System.out.println ("name:" + name + "value" + value);	
			for (int i = 0; i<cartLists.size(); i++)
			{
              cartItem = cartLists.get(i);
			  if (name.equals(cartItem.getTypekey())){
			    cartItem.setQuantity(Integer.valueOf(value));
				break;						
			  }					
			}
		  }
		  
		  //transformer.setParameter(name, value);
		  System.out.println ("name:" + name + "value" + value);
		}

		int count = cartLists.size();	
		int i = 0;
		header = true;
	    amount = 0;
		System.out.println ("count:" + count);
		if (count != 0){
		  CheckOutItems = new String[count];
		}	
	    do 
		{
		  System.out.println ("count:" + count);
		  // instantiate a transformer factory
                  TransformerFactory tFactory = TransformerFactory.newInstance();
		  // instantiate AnErrorListener
                  AnErrorListener errorListener = new AnErrorListener();
		  // handle errors during processing of transformation instructions
		  tFactory.setErrorListener(errorListener);
                  // configure URI resolving
		  tFactory.setURIResolver(new myURIResolver());
		  // load stylesheet
		  if (header){
                    styleSheetFile = "/xsl/head.xsl";
		    header = false;			
                  }
		  else if (header == false && count !=0){
                    styleSheetFile = "/xsl/cart.xsl";				 
		  } 
		  else if (count == 0){
		    styleSheetFile = "/xsl/amount.xsl";	
		  }  	
		  System.out.println ("styleSheetFile:" + styleSheetFile);
		  StreamSource xslSource = new StreamSource(getServletContext().
		  getResourceAsStream(styleSheetFile));
		  // instantiate transformer
		  Transformer transformer = tFactory.newTransformer(xslSource);
		  // handle errors during the transformation
		  transformer.setErrorListener(errorListener);
		  if ((styleSheetFile.equals("/xsl/cart.xsl")) && (count != 0)){
                    cartItem = cartLists.get(i);
		    amount += cartItem.getQuantity()*cartItem.getPrice();
		    System.out.println ("Cart:show#############" );
		    allParamValues[0] = cartItem.getTypekey();
		    allParamValues[1] = cartItem.getItemDes();
		    allParamValues[2] = cartItem.getLabelType();
		    allParamValues[3] = cartItem.getLabelDes();
		    allParamValues[4] = "" + (cartItem.getPrice());
		    allParamValues[5] = "" + (cartItem.getQuantity());
		    for (int j =0; j< 6; j++)
		    {
	              transformer.setParameter(allParamNames[j], allParamValues[j]);
		      System.out.println ("ParameterValue[j]:" + allParamNames[j] + "ParameterValue[j]:" + allParamValues[j]);
		    }
		    if (CheckOutItems!= null)
		    {
		      CheckOutItems[i] = cartItem.getTypekey();
		      System.out.println(" CheckOutItems[i]:" + CheckOutItems[i]);
		    }
		    
		  }
		   if (count == 0){
		    transformer.setParameter("Amount", amount);
		    System.out.println ("Amount:" + amount);
		  
		  }
		   if ( (styleSheetFile.equals("/xsl/cart.xsl")) || (styleSheetFile.equals("/xsl/amount.xsl"))){
		     --count;    
		     i++;
		   }	 
		  System.out.println(" CheckOutItems:" + CheckOutItems);
		  // create an XMLReader
		  XMLReader reader
				     = XMLReaderFactory.createXMLReader();
		  // e  nable validation as appropriate
		  reader.setFeature("http://xml.org/sax/features/validation",
									  false);
		  System.out.println(" Validation none");		
		  // load XML
		  SAXSource saxSource = new SAXSource(reader,
		  new InputSource(getServletContext().
		  getResourceAsStream("/xml/cart.xml")));
	 	  // transform!
		  transformer.transform(saxSource, new StreamResult(out));
		  
		}while (count >= 0);  
		/*
              for (i = 0; i < CheckOutItems.length; i++)
             {
                System.out.println("CheckOutItems[i]"+ CheckOutItems[i]);
	       }
	      */
	    CheckOutItems = null;
	  }
	  catch (Exception e)
	  {
        e.printStackTrace();
		throw new ServletException("Can't process XSLT: " + e.getMessage());
	   }
  }

  private void createDocument (){
	  /* Get an instance of Document object using document builder factory */
	 // get Instance of Factory
	 System.out.println ("createDocument:" );
	  dbf = DocumentBuilderFactory.newInstance();
	  try{
		 // get an instance of builder
		 // get an instance of Document builder using instance of Factory
		 db = dbf.newDocumentBuilder(); 
		 // create instance of DOM
		 // create instance of DOM from Document builder
		 dom = db.newDocument();
	  	} 
	    catch (ParserConfigurationException pce){
			System.out.println("Error while trying to instantiate DocumentBuilder " + pce);
			System.exit(1);
		}		 
		// Create the root element items
		/* Add the root element to document object first element in the document object */
		rootEle = dom.createElement("items");
		dom.appendChild(rootEle);
		 
   }


  private Element createItemElement (CartCheckOutItems cartItem){
   /* create item node */
	Element itemEle = dom.createElement("item");
  /* create nodes under item node */

  /* create and append typekey element and attach to item node */ 
	Element typeKeyEle = dom.createElement("typeKey");
	Text typeKeyText = dom.createTextNode(cartItem.getTypekey());
	typeKeyEle.appendChild(typeKeyText);
	itemEle.appendChild(typeKeyEle);

	/* create and append itemDes element and attach to item node */ 
	Element itemDesEle = dom.createElement("itemDes");
	Text itemDesText = dom.createTextNode(cartItem.getItemDes());
	itemDesEle.appendChild(itemDesText);
	itemEle.appendChild(itemDesEle);

	
  /* create and append iteLabelDes element and attach to item node */ 
	  Element itemLabelType = dom.createElement("LabelType");
	  Text LabelTypeText = dom.createTextNode(cartItem.getLabelType());
	  itemLabelType.appendChild(LabelTypeText);
	  itemEle.appendChild(itemLabelType);

	  
  /* create and append description element and attach to item node */ 
		Element itemdescription = dom.createElement("description");
		Text descriptionText = dom.createTextNode(cartItem.getLabelDes());
		itemdescription.appendChild(descriptionText);
		itemEle.appendChild(itemdescription);

		  
  /* create and append price element and attach to item node */ 
		Element itemPrice = dom.createElement("Price");
		Text PriceText = dom.createTextNode(String.valueOf(cartItem.getPrice()));
		itemPrice.appendChild(PriceText);
		itemEle.appendChild(itemPrice);	

  /* create and append qunatity element and attach to item node */ 
		Element itemQuantity = dom.createElement("Quantity");
		Text QuantityText = dom.createTextNode(String.valueOf(cartItem.getQuantity()));
		itemQuantity.appendChild(QuantityText);
		itemEle.appendChild(itemQuantity);	
	return itemEle;
	
  }	

}	

