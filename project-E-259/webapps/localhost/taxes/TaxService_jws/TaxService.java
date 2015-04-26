/**
 * TaxService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.taxes.TaxService_jws;

public interface TaxService extends java.rmi.Remote {
    public double calcTaxRate(double subtotal, double total) throws java.rmi.RemoteException;
    public double calcSubTotal(double total, double taxpercent) throws java.rmi.RemoteException;
    public double calcTotal(double subtotal, double taxpercent) throws java.rmi.RemoteException;
}
