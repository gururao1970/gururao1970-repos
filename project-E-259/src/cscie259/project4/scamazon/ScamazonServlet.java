package cscie259.project4.scamazon;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.xml.transform.ErrorListener;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.URIResolver;

import javax.xml.transform.stream.StreamSource;


/**
 * Base class for Scamazon's servlets; defines as an inner class an ErrorListener.
 *
 * You MAY modify this file.
 *
 * @author  Computer Science E-259
 * @version 8.0
 *
 * @author  YOUR NAME GOES HERE
 **/

public abstract class ScamazonServlet extends HttpServlet
{
    /**
     * Responds to GETs in the same manner as POSTs.
     *
     * @param request HTTP request object
     * @param response HTTP response object
     *
     * @throws IOException      on network failure
     * @throws ServletException on generic failure
     **/
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
    throws IOException, ServletException
    {
        doWork(request, response);
    }


    /**
     * Responds to POSTs in the same manner as GETs.
     *
     * @param request HTTP request object
     * @param response HTTP response object
     *
     * @throws IOException if an IO-related error occurs
     * @throws ServletException if a servlet-related error occurs
     **/
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
    throws IOException, ServletException
    {
        doWork(request, response);
    }


    /**
     * To be implemented by descendants, handles GETs and POSTs identically.
     *
     * @param request HTTP request object
     * @param response HTTP response object
     *
     * @throws IOException if an IO-related error occurs
     * @throws ServletException if a servlet-related error occurs
     **/
    protected abstract void doWork(HttpServletRequest request,
                                   HttpServletResponse response)
    throws IOException, ServletException;


    /**
     * Used to forward the request and response objects to another servlet
     * (whose path is of the form "/servlet/foo") for processing.
     *
     * @param request   HTTP request object
     * @param response  HTTP response object
     * @param path      the path to the servlet being forwarded to
     *
     * @throws IOException if an IO-related error occurs
     * @throws ServletException if a servlet-related error occurs
     **/
    public void forward(HttpServletRequest request,
                               HttpServletResponse response,
                               String path)
    throws IOException, ServletException
    {
        RequestDispatcher dispatch =
         request.getRequestDispatcher(path);
        dispatch.forward(request, response);
    }


    /**
     * Used to redirect the user to another url (or servlet in the
     * same container), without preserving the current
     * HttpServletRequest object.
     *
     * @param response  HTTP response object
     * @param url      the url to which the user's being redirected
     *
     * @throws IOException if an IO-related error occurs
     **/
    public void redirect(HttpServletResponse response, String url)
    throws IOException
    {
        response.sendRedirect(url);
    }


    /**
     * Handles processing errors.
     **/

    protected static class AnErrorListener implements ErrorListener
    {
        /**
         * Receive notification of a parser warning.
         *
         * @param e  the exception thrown
         *
         * @throws TransformerException if a transformation-related error occurs
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
         * @throws TransformerException if a transformation-related error occurs
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
         * @throws TransformerException if a transformation-related error occurs
         */
        public void fatalError(TransformerException e)
        throws TransformerException
        {
            System.out.println("Fatal parsing error:  " + e.getMessage());
        }
    }


    /**
     * Resolves references to files.
     **/
    protected class myURIResolver implements URIResolver
    {
        /**
         * Resolves references to files with respect to
         * project4-7.0/webapps/scamazon/.
         *
         * @param href  path to file
         * @param base  current base
         *
         * @throws TransformerException if a transformation-related error occurs
         *
         * @return Source for resolution of references to files
         **/
        public Source resolve(String href, String base)
        throws TransformerException
        {
            return (new StreamSource(getServletContext().
                                     getResourceAsStream("/" + href)));
        }
    }
}
