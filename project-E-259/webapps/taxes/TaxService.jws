/**
 * Lecture 11's demo of a web service that performs
 * various tax calculations.
 *
 * Excerpted from
 * http://www.ammai.com/modules.php?op=modload&name=Sections&file=index&req=viewarticle&artid=4&page=4.
 * 
 * @author  Ammai.com
 * @author  Computer Science E-259
 **/

public class TaxService
{
    /**
     * Determines tax rate based on given subtotal and total.
     */
    public double calcTaxRate(double subtotal, double total)
    {
        double rate =  (total - subtotal) / subtotal;
        return rate;
    }
    

    /**
     * Determines pre-tax subtotal based on given total and
     * tax rate.
     */
    public double calcSubTotal(double total, double taxpercent)
    {
        double subtotal = total / (1 + taxpercent);
        return subtotal;
    }
    

    /**
     * Determines total based on given subtotal and
     * tax rate.
     */
    public double calcTotal(double subtotal, double taxpercent)
    {
        double total = subtotal * (1 + taxpercent);
        return total;
    }
}
