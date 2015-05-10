/*
Copyright (c) 1998 Sun Microsystems, Inc. All Rights Reserved.

This software is the confidential and proprietary information of Sun
Microsystems, Inc. ("Confidential Information").  You shall not
disclose such Confidential Information and shall use it only in
accordance with the terms of the license agreement you entered into
with Sun.

SUN MAKES NO REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE
SOFTWARE, EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
PURPOSE, OR NON-INFRINGEMENT. SUN SHALL NOT BE LIABLE FOR ANY DAMAGES
SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING OR DISTRIBUTING
THIS SOFTWARE OR ITS DERIVATIVES.

CopyrightVersion 1.0
*/

package database;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



/**
 * This is a simple example of a Generic Servlet.  Other servlets
 * call its public methods; it does not accept calls from clients.
 */



public class BookDBServlet extends HttpServlet {

    private BookstoreDB books;
	int count;
/*
    public void init(ServletConfig config) throws ServletException {
        // Store the ServletConfig object and log the initialization
        super.init(config);
		System.out.println("Init BookDBServlet....");

        // Load the database to prepare for requests
        books = new BookstoreDB();
		System.out.println("BookDBServlet:init Stub" + books);
    }

  */
	public void init(ServletConfig config) throws ServletException 
	{     
	   // Always call super.init(config) first	(servlet mantra #1)
	   	super.init(config);
	   	String initial = config.getInitParameter("initial");
	   	try 
		{
		    /* count = Integer.parseInt(initial); */
			books = new BookstoreDB();
			System.out.println("BookDBServlet######books" + books);
	   	} 
		catch (  Throwable t) {
				count = 0; t.printStackTrace();
				throw new ServletException(t);
 		}
	}

  
   public void destroy() {
        // Allow the database to be garbage collected
		System.out.println("BookDBServlet:destroy#############"+ books);
		books = null;
    }

    public void service(ServletRequest req, ServletResponse res)
	throws ServletException, IOException {
            throw new UnavailableException(
                this,
                "This servlet does not accept client requests.");
    }

    public BookDetails getBookDetails(String bookId) {
        return books.getBookDetails(bookId);
    }

    public BookDetails[] getBooksSortedByTitle() {
        return books.getBooksSortedByTitle();
    }

    public int getNumberOfBooks() {
        return books.getNumberOfBooks();
    }

    public String getServletInfo() {
        return "The BookDB servlet manages the bookstore database.  " +
               "It is called by other servlets, not directly by a user.";
    }

	public void doGet (HttpServletRequest req,
                       HttpServletResponse response)
	throws ServletException, IOException
    {
        Enumeration e = req.getParameterNames();
        String parmName;
        String parmValue;
		System.out.println("BookDBServlet######doGet");
       while (e.hasMoreElements() )
       {
         parmName = (String)e.nextElement();
         parmValue = req.getParameter(parmName);
		 System.out.println("BookDBServlet:doGet" + parmName + parmValue);
		 
        
      }
	}
}



