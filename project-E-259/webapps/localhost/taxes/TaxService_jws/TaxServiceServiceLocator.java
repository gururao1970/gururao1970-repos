/**
 * TaxServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.taxes.TaxService_jws;

public class TaxServiceServiceLocator extends org.apache.axis.client.Service implements localhost.taxes.TaxService_jws.TaxServiceService {

    public TaxServiceServiceLocator() {
    }


    public TaxServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TaxServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TaxService
    private java.lang.String TaxService_address = "http://localhost:8080/taxes/TaxService.jws";

    public java.lang.String getTaxServiceAddress() {
        return TaxService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TaxServiceWSDDServiceName = "TaxService";

    public java.lang.String getTaxServiceWSDDServiceName() {
        return TaxServiceWSDDServiceName;
    }

    public void setTaxServiceWSDDServiceName(java.lang.String name) {
        TaxServiceWSDDServiceName = name;
    }

    public localhost.taxes.TaxService_jws.TaxService getTaxService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TaxService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTaxService(endpoint);
    }

    public localhost.taxes.TaxService_jws.TaxService getTaxService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.taxes.TaxService_jws.TaxServiceSoapBindingStub _stub = new localhost.taxes.TaxService_jws.TaxServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTaxServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTaxServiceEndpointAddress(java.lang.String address) {
        TaxService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.taxes.TaxService_jws.TaxService.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.taxes.TaxService_jws.TaxServiceSoapBindingStub _stub = new localhost.taxes.TaxService_jws.TaxServiceSoapBindingStub(new java.net.URL(TaxService_address), this);
                _stub.setPortName(getTaxServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("TaxService".equals(inputPortName)) {
            return getTaxService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost:8080/taxes/TaxService.jws", "TaxServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost:8080/taxes/TaxService.jws", "TaxService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TaxService".equals(portName)) {
            setTaxServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
