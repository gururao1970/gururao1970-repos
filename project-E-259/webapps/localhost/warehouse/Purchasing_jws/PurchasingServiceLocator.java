/**
 * PurchasingServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.warehouse.Purchasing_jws;

public class PurchasingServiceLocator extends org.apache.axis.client.Service implements localhost.warehouse.Purchasing_jws.PurchasingService {

    public PurchasingServiceLocator() {
    }


    public PurchasingServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PurchasingServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Purchasing
    private java.lang.String Purchasing_address = "http://localhost:8080/warehouse/Purchasing";

    public java.lang.String getPurchasingAddress() {
        return Purchasing_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PurchasingWSDDServiceName = "Purchasing";

    public java.lang.String getPurchasingWSDDServiceName() {
        return PurchasingWSDDServiceName;
    }

    public void setPurchasingWSDDServiceName(java.lang.String name) {
        PurchasingWSDDServiceName = name;
    }

    public localhost.warehouse.Purchasing_jws.Purchasing getPurchasing() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Purchasing_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPurchasing(endpoint);
    }

    public localhost.warehouse.Purchasing_jws.Purchasing getPurchasing(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.warehouse.Purchasing_jws.PurchasingSoapBindingStub _stub = new localhost.warehouse.Purchasing_jws.PurchasingSoapBindingStub(portAddress, this);
            _stub.setPortName(getPurchasingWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPurchasingEndpointAddress(java.lang.String address) {
        Purchasing_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.warehouse.Purchasing_jws.Purchasing.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.warehouse.Purchasing_jws.PurchasingSoapBindingStub _stub = new localhost.warehouse.Purchasing_jws.PurchasingSoapBindingStub(new java.net.URL(Purchasing_address), this);
                _stub.setPortName(getPurchasingWSDDServiceName());
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
        if ("Purchasing".equals(inputPortName)) {
            return getPurchasing();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost:8080/warehouse/Purchasing.jws", "PurchasingService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost:8080/warehouse/Purchasing.jws", "Purchasing"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Purchasing".equals(portName)) {
            setPurchasingEndpointAddress(address);
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
