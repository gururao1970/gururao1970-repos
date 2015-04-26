import localhost.warehouse.Purchasing_jws.*;
import org.apache.axis.AxisFault;


/**
 * Lecture 11's demo of a client that accesses Project 4's
 * warehouse.
 *
 * @author  Computer Science E-259
 **/

public class PurchasingClient
{
    /**
     * Main driver.
     */
    public static void main(String [] argv)
    {
        // attempt to connect to warehouse
        try
        {
            PurchasingService service = new PurchasingServiceLocator();
            Purchasing port = service.getPurchasing();

            // eh, we've got nothing to say tonight
            System.out.println(port.processPO("<PO/>"));
        }
        catch (AxisFault af)
        {
            System.err.println("An Axis Fault occurred: " + af);
            System.err.println();
            System.err.println(af.dumpToString());
        }
        catch (Exception e)
        {
            System.err.println("Exception caught: " + e);
        }
    }
}
