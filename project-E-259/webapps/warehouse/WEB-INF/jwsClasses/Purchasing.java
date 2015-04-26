//package cscie259.project4.warehouse;

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

        // attempt to process PO
        try 
        {
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

            // transform!
            transformer.transform(saxSource, new StreamResult(writer));
        } 
        catch (Exception e) 
        {
	        e.printStackTrace();
        	throw new RuntimeException("Can't process XSLT: " + e.getMessage());
        }

        // return PO-ACK
        return writer.toString();
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
