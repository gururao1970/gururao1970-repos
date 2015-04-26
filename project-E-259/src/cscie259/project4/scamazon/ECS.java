package cscie259.project4.scamazon;

import java.io.IOException;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.amazon.soap.AWSECommerceService.*;


/**
 * This servlet implements a demonstration of Amazon's
 * E-Commerce Service (ECS).
 *
 * Be sure to assign ECS.ACCESS_KEY_ID the value of your
 * own Access Key ID.
 *
 * You MAY modify this file.
 *
 * @author  Computer Science E-259
 * @version 8.0
 **/

public class ECS extends ScamazonServlet 
{
    /* your Access Key ID */
    private static final String ACCESS_KEY_ID = "";

    /* ISBNs of course's recommended books */
    private static final String ISBNS 
     = "0130092290 | 0201740958 | 0735611831 | 0764543814";

    /* response groups to request of ECS */
    private static final String [] RESPONSE_GROUPS = new String[]{"Large"};


    /**
     * Demonstrates ECS.
     *
     * @throws IOException if an IO-related error occurs
     * @throws ServletException if a servlet-related error occurs
     **/
    protected void doWork(HttpServletRequest request,
                          HttpServletResponse response)
    throws ServletException, IOException
    {
        // check for Access Key ID
        if (ACCESS_KEY_ID.equals(""))
            throw new ServletException("Access Key ID was not provided.");

        // prepare connection to ECS
        AWSECommerceService service = new AWSECommerceServiceLocator();
        AWSECommerceServicePortType port = null;
        try 
        { 
            port = service.getAWSECommerceServicePort(); 
        }
        catch (javax.xml.rpc.ServiceException e) 
        {
            throw new ServletException("AWS Service failure", e);
        }

        // prepare ItemSearchRequest for ECS
        ItemSearchRequest itemSearchRequest = new ItemSearchRequest();
        itemSearchRequest.setResponseGroup(RESPONSE_GROUPS);
        itemSearchRequest.setSearchIndex("Books");
        itemSearchRequest.setKeywords(ISBNS);

        // prepare ItemSearch for ECS
        ItemSearch itemSearch = new ItemSearch();
        itemSearch.setSubscriptionId(ACCESS_KEY_ID);
        itemSearch.setRequest(new ItemSearchRequest[]{itemSearchRequest});
        ItemSearchResponse itemSearchResponse = port.itemSearch(itemSearch);

        // retrieve items returned
        Item items[] = itemSearchResponse.getItems()[0].getItem();

        // throw exception upon error 
        ErrorsError errors[]
         = itemSearchResponse.getItems()[0].getRequest().getErrors();
        if (errors != null)
            throw new ServletException(errors[0].getMessage());
        
        // set attributes for JSP
        request.setAttribute("items", items);
        
        // pass control off to JSP
        getServletContext().getRequestDispatcher("/ecs.jsp").forward(request, 
                                                                     response);
    }
}
