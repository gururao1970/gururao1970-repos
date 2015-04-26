package cscie259.project4.warehouse;


import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import javax.xml.transform.ErrorListener;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource; 
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import java.io.IOException;


import java.util.List;
 
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
 
import org.xml.sax.SAXException;

import cscie259.project4.warehouse.PurchaseObject;
import cscie259.project4.warehouse.PurchasingHandler;


/**
 * This class is treated by Tomcat (or, more specifically,
 * by Axis) as a web service; it processes purchase orders.
 * <p/>
 * Any references to the local file system are resolved
 * with respect to project4-7.0/.
 * <p/>
 * The class does not utilize a javax.xml.transform.URIResolver, 
 * since it's not technically a servlet (i.e., it doesn't extend 
 * javax.servlet.http.HttpServlet).
 * <p/>
 * You MAY modify this file.
 *
 * @author  Computer Science E-259
 * @version 8.0
 *
 * @author  YOUR NAME GOES HERE
 **/

public class Purchasing
{
    /* path to the warehouse's base directory */
    private static final String warehouseDir = "webapps/warehouse";
	PurchaseObject PO;
	

  
    /**
     * Processes the given PO element, provided in the form of a String.
     *
     * @param poXmlString String containing PO element
     * 
     * @return String containing PO-ACK element
     */
    public String processPO(String poXmlString) 
    {
        // storage for PO-ACK output
        StringWriter writer = new StringWriter();
		System.out.println("Printing processPO ..........");
		System.out.println("poXmlString" + poXmlString);

        PurchasingHandler handler = new PurchasingHandler();
        List<PurchaseObject> purchaseLists = handler.getPurchaseList();
        System.out.println("PO:purchaseListsSize" + purchaseLists.size());
        try{
          SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
          SAXParser saxParser = saxParserFactory.newSAXParser();
          System.out.println("Calling PurchasingHandler Constructor.....");
          saxParser.parse((new InputSource(new ByteArrayInputStream(poXmlString.getBytes()))), handler);			
        }
        catch (Exception e) 
        {
	  e.printStackTrace();
          throw new RuntimeException("Can't process XSLT: " + e.getMessage());
        }

        // attempt to process PO
        try 
        {
          for (int i = 0; i<purchaseLists.size(); i++){
            PO = purchaseLists.get(i);
            System.out.println("Processing iterator: " + i);
            // instantiate a transformer factory
            TransformerFactory tFactory = TransformerFactory.newInstance();

            // instantiate ErrorListener
            AnErrorListener errorListener = new AnErrorListener();

            // handle errors during processing of transformation instructions
            tFactory.setErrorListener(errorListener);
             
            // load stylesheet
            StreamSource xslSource = 
	         new StreamSource(warehouseDir + "/xsl/po-ack.xsl");

            // instantiate transformer
            Transformer transformer = tFactory.newTransformer(xslSource);

            // handle errors during the transformation 
            transformer.setErrorListener(errorListener);

            // create an XMLReader
            XMLReader reader = XMLReaderFactory.createXMLReader();

            // enable validation as appropriate
            String validation = System.getProperty("enable.validation");
            if (validation != null && validation.equals("dtd"))
                reader.setFeature("http://xml.org/sax/features/validation", true);
            else if (validation != null && validation.equals("xsd"))
            {
                reader.setFeature("http://xml.org/sax/features/validation", true);
                reader.setFeature("http://apache.org/xml/features/validation/schema", true);
            }
            else
                reader.setFeature("http://xml.org/sax/features/validation", false);

            // load XML
            SAXSource saxSource = new SAXSource(reader,
            new InputSource(new ByteArrayInputStream(poXmlString.getBytes())));
            System.out.println("PO:typeKey" + PO.getTypeKey());
            System.out.println("PO:itemDes" + PO.getItemDes());
            System.out.println("PO:LabelType" + PO.getLabelType());
            System.out.println("PO:description" + PO.getDescription());
            System.out.println("PO:Price" + PO.getPrice());
            System.out.println("PO:Quantity" + PO.getQuantity());            
            System.out.println("PO:" + PO);
	    transformer.setParameter("typeKey", PO.getTypeKey());
	    transformer.setParameter("itemDes", PO.getItemDes());
	    transformer.setParameter("LabelType", PO.getLabelType());
	    transformer.setParameter("description", PO.getDescription());
	    transformer.setParameter("Price", PO.getPrice());
	    transformer.setParameter("Quantity", PO.getQuantity());                
            // transform!
            transformer.transform(saxSource, new StreamResult(writer));
            
          }
        } 
        catch (Exception e) 
        {
	  e.printStackTrace();
          throw new RuntimeException("Can't process XSLT: " + e.getMessage());
        }

        // return PO-ACK
        //return writer.toString();
    }


    /**
     * Handle processing errors.
     **/
    private class AnErrorListener implements ErrorListener
    {
        /** 
         * Receive notification of a parser warning.
         *                           
         * @param e  the exception thrown
         *  
         * @throws TransformerException
         */
        public void warning(TransformerException e)
        throws TransformerException
        {
            System.out.println("Parsing warning:  " + e.getMessage());
        }   
            
            
        /**
         * Receive notification of a recoverable parser error. 
         *  
         * @param e  the exception thrown 
         *
         * @throws TransformerException
         */ 
        public void error(TransformerException e)
        throws TransformerException
        {   
            System.out.println("Parsing error:  " + e.getMessage());
        }   
            

        /**     
         * Report a fatal XML parsing error. 
         *      
         * @param e  the exception thrown
         *
         * @throws TransformerException
         */ 
        public void fatalError(TransformerException e)
        throws TransformerException
        {   
            System.out.println("Fatal parsing error:  " + e.getMessage());
        }
    }
}
