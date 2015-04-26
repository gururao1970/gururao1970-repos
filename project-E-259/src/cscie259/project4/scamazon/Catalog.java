package cscie259.project4.scamazon;

import java.io.IOException;
import java.io.PrintWriter;

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

import cscie259.project4.scamazon.CartCheckOutItems;









/**
 * This servlet implements Scamazon.com's catalog.
 * <p/>
 * Any references to the local file system are resolved
 * with respect to project4-7.0/webapps/scamazon/, per
 * ScamazonServlet's implementation of javax.xml.transform.URIResolver.
 * <p/>
 * You MAY modify this file.
 *
 * @author  Computer Science E-259
 * @version 8.0
 *
 * @author  YOUR NAME GOES HERE
 **/


  
public class Catalog extends ScamazonServlet
{

	private LinkedList <CartCheckOutItems> cartLists = null;
	private static final int MAX_NUM_PARAM = 6;
	private  enum addRemoveRequest {
		  Unkown, Buy, Remove
		}

	/**
     * Handles operations involving the catalog.
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

		CartCheckOutItems cartItem;
		addRemoveRequest addRemoveStatus = addRemoveRequest.Unkown;
			String[] allParamNames = new String[] {"Buy", "itemDes", "LabelDes", "description", "price", "itemkey" };
		String[] allParamValues = new String[MAX_NUM_PARAM];
		String paramtypeKey = null;
		String paramitemDescription  = null;
		String paramtypeLabel  = null;
		String paramtypeDescription  = null;
		String paramtypePrice  = null; 
		String paramitemKey = null;
		
		// output text/html MIME type
        response.setContentType("text/html");

		System.out.println("### Servlet:Catalog#######");
		
		
		HttpSession session = request.getSession(true);
        cartLists = (LinkedList <CartCheckOutItems>) session.getValue (session.getId());
		Enumeration paramNames = request.getParameterNames();

		if (cartLists == null)
		{
		   cartLists = new LinkedList<CartCheckOutItems>() ;
		   session.putValue(session.getId(), cartLists);
		   System.out.println ("New cartLists:" );
		}
		

		// retrieve PrintWriter
        PrintWriter out = response.getWriter();

        // attempt to process catalog operation, passing any parameters
        // to stylesheet
        try
        {
            // instantiate a transformer factory
            TransformerFactory tFactory = TransformerFactory.newInstance();

            // instantiate AnErrorListener
            AnErrorListener errorListener = new AnErrorListener();

            // handle errors during processing of transformation instructions
            tFactory.setErrorListener(errorListener);

            // configure URI resolving
            tFactory.setURIResolver(new myURIResolver());

            // load stylesheet
            StreamSource xslSource = new StreamSource(getServletContext().
                                     getResourceAsStream("/xsl/catalog.xsl"));

            // instantiate transformer
            Transformer transformer = tFactory.newTransformer(xslSource);

            // handle errors during the transformation
            transformer.setErrorListener(errorListener);

            // pass HTTP parameters to stylesheet
       /*  
            Enumeration names = request.getParameterNames();
			System.out.println("HTTP parameters" + names);
            while (names.hasMoreElements())
            {
                String name = (String)names.nextElement();
                String value = request.getParameter(name);
                transformer.setParameter(name, value);
            }
          */  
        int i = 0;
		while (paramNames.hasMoreElements())
		{

			String parameter = (String) paramNames.nextElement();
			System.out.println ("i:" + i + "parameter:" + parameter ); 
			if (parameter.equals("Buy"))
			{
			  addRemoveStatus = addRemoveRequest.Buy;
			} 
			else if  (parameter.equals("Remove"))
			{
				addRemoveStatus = addRemoveRequest.Remove;
			}


			  allParamValues[i] = request.getParameter(parameter);
			  System.out.println ("i:" + i + "parameter:" + parameter + "allParamValues[i]" + allParamValues[i]); 
			   i++;
			  
		}
		if (addRemoveStatus == addRemoveRequest.Buy)
		{
		  System.out.println ("ParameterValue[0]:" + allParamValues[0] + "ParameterValue[1]:" + allParamValues[1] + 
		  		"ParameterValue[2]:" + allParamValues[2] + "allParamNames[3]: " + allParamValues[3] + "allParamNames[4]:" + allParamValues[4] +
		  		 "allParamNames[5]:" + allParamValues[5]);
		    cartItem = new CartCheckOutItems(allParamValues[0],allParamValues[1], allParamValues[2], allParamValues[3], 
		  									 (Double.valueOf(allParamValues[4])).intValue(), allParamValues[5]);
			cartItem.setQuantity(1);
			System.out.println ("Add CartItemt to LinedList:" );
			cartLists.add( cartItem); /* add it to linklist */
			
		  
		}
		else if (addRemoveStatus == addRemoveRequest.Remove)
		{
		
		}
            // create an XMLReader
            XMLReader reader
             = XMLReaderFactory.createXMLReader();

            // enable validation as appropriate
            String validation = System.getProperty("enable.validation");
            if (validation != null && validation.equals("dtd"))
            {
                reader.setFeature("http://xml.org/sax/features/validation",
                                  true);
				System.out.println("DTD Validation");
			}
            else if (validation != null && validation.equals("xsd"))
            {
                reader.setFeature("http://xml.org/sax/features/validation",
                                  true);
                reader.setFeature("http://apache.org/xml/features/validation/schema",
                                  true);
				System.out.println("XSD Validation");
            }
            else
            {
                reader.setFeature("http://xml.org/sax/features/validation",
                                  false);
				System.out.println(" Validation none");
			}

            // load XML
            SAXSource saxSource = new SAXSource(reader,
              new InputSource(getServletContext().
               getResourceAsStream("/xml/catalog.xml")));

            // transform!
            transformer.transform(saxSource, new StreamResult(out));

        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new ServletException("Can't process XSLT: " + e.getMessage());
        }
    }
}
