import localhost.taxes.TaxService_jws.*;
import org.apache.axis.AxisFault;


/**
 * Lecture 11's demo of a client that accesses a web service
 * that performs various tax calculations.
 *
 * Excerpted from
 * http://www.ammai.com/modules.php?op=modload&name=Sections&file=index&req=viewarticle&artid=4&page=5
 *
 * @author  Ammai.com
 * @author  Computer Science E-259
 **/

public class TaxClient
{
    /**
     * Main driver.
     */
    public static void main(String[] args)
    {
        try
        {
            // Make a service
            TaxServiceService service = new TaxServiceServiceLocator();
            TaxService port = service.getTaxService();

            // Make the actual calls to the three methods
            double taxpercent = port.calcTaxRate(21.00, 23.10);
            double total = port.calcTotal(21.00, 0.10);
            double subtotal = port.calcSubTotal(23.10, 0.10);

            // Output the results
            System.out.println(
             "Subtotal: 21.00, Total: 23.10, Tax: " + taxpercent
             );
            System.out.println(
            "Subtotal: 21.00, Tax: 0.10, Total: " + total
            );
            System.out.println(
            "Total: 23.10, Tax: 0.10, Subtotal: " + subtotal
            );
        }
        catch (AxisFault af)
        {
            System.err.println("An Axis Fault occurred: " + af);
        }
        catch (Exception e)
        {
            System.err.println("Exception caught: " + e);
        }
    }
}
