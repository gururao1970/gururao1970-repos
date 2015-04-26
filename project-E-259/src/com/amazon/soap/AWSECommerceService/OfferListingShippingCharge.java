/**
 * OfferListingShippingCharge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class OfferListingShippingCharge  implements java.io.Serializable {
    private java.lang.String shippingType;

    private com.amazon.soap.AWSECommerceService.Price shippingPrice;

    public OfferListingShippingCharge() {
    }

    public OfferListingShippingCharge(
           java.lang.String shippingType,
           com.amazon.soap.AWSECommerceService.Price shippingPrice) {
           this.shippingType = shippingType;
           this.shippingPrice = shippingPrice;
    }


    /**
     * Gets the shippingType value for this OfferListingShippingCharge.
     * 
     * @return shippingType
     */
    public java.lang.String getShippingType() {
        return shippingType;
    }


    /**
     * Sets the shippingType value for this OfferListingShippingCharge.
     * 
     * @param shippingType
     */
    public void setShippingType(java.lang.String shippingType) {
        this.shippingType = shippingType;
    }


    /**
     * Gets the shippingPrice value for this OfferListingShippingCharge.
     * 
     * @return shippingPrice
     */
    public com.amazon.soap.AWSECommerceService.Price getShippingPrice() {
        return shippingPrice;
    }


    /**
     * Sets the shippingPrice value for this OfferListingShippingCharge.
     * 
     * @param shippingPrice
     */
    public void setShippingPrice(com.amazon.soap.AWSECommerceService.Price shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfferListingShippingCharge)) return false;
        OfferListingShippingCharge other = (OfferListingShippingCharge) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shippingType==null && other.getShippingType()==null) || 
             (this.shippingType!=null &&
              this.shippingType.equals(other.getShippingType()))) &&
            ((this.shippingPrice==null && other.getShippingPrice()==null) || 
             (this.shippingPrice!=null &&
              this.shippingPrice.equals(other.getShippingPrice())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getShippingType() != null) {
            _hashCode += getShippingType().hashCode();
        }
        if (getShippingPrice() != null) {
            _hashCode += getShippingPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfferListingShippingCharge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>OfferListing>ShippingCharge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ShippingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ShippingPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Price"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
