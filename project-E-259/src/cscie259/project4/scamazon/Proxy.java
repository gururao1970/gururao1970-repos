package cscie259.project4.scamazon;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.xml.transform.ErrorListener;
import javax.xml.transform.TransformerException;

import org.apache.axis.client.Call;
import org.apache.axis.client.Service;


/**
 * Helper methods for Scamazon.com.
 * <p/>
 * You MAY modify this file.
 *
 * @author  Computer Science E-259
 * @version 8.0
 *
 * @author  YOUR NAME GOES HERE
 **/

public final class Proxy
{
    /**
     * Default constructor is private so that this utility
     * class cannot be instantiated.
     */
    private Proxy() {}


    /**
     * A proxy for the web service.  Takes as input a PO element in the
     * form of a String (as well as the warehouse's current host and port); 
     * returns as a String a PO-ACK element.
     *
     * @param poXmlString  PO element
     * @param host         warehouse's host (e.g., "ice1.fas.harvard.edu")
     * @param port         warehouse's (i.e., servlet container's) current port
     *
     * @throws ServletException if a servlet-related error occurs
     *
     * @return PO-ACK element
     **/
    public static String processPO(String poXmlString, String host, int port)
    throws ServletException
    {
        // attemp to invoke web service
        try 
        {
            // warehouse's location
            String endpoint = "http://" + host + ":" + port + 
                              "/warehouse/services/Purchasing";
     
            // prepare to invoke the web service
            Service service = new Service();
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(new java.net.URL(endpoint));
            call.setOperationName("processPO");

            // invoke the service and return the (PO-ACK) response
            return (String) call.invoke(new Object [] { poXmlString });
        } 
        catch (Exception e) 
        {
            throw new ServletException("Error running SOAP: " + 
                                       e.getMessage());
        }
    }
}
