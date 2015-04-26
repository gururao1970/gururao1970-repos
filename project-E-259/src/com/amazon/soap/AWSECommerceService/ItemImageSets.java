/**
 * ItemImageSets.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class ItemImageSets  implements java.io.Serializable {
    private java.lang.String merchantId;

    private com.amazon.soap.AWSECommerceService.ImageSet[] imageSet;

    public ItemImageSets() {
    }

    public ItemImageSets(
           java.lang.String merchantId,
           com.amazon.soap.AWSECommerceService.ImageSet[] imageSet) {
           this.merchantId = merchantId;
           this.imageSet = imageSet;
    }


    /**
     * Gets the merchantId value for this ItemImageSets.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this ItemImageSets.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the imageSet value for this ItemImageSets.
     * 
     * @return imageSet
     */
    public com.amazon.soap.AWSECommerceService.ImageSet[] getImageSet() {
        return imageSet;
    }


    /**
     * Sets the imageSet value for this ItemImageSets.
     * 
     * @param imageSet
     */
    public void setImageSet(com.amazon.soap.AWSECommerceService.ImageSet[] imageSet) {
        this.imageSet = imageSet;
    }

    public com.amazon.soap.AWSECommerceService.ImageSet getImageSet(int i) {
        return this.imageSet[i];
    }

    public void setImageSet(int i, com.amazon.soap.AWSECommerceService.ImageSet _value) {
        this.imageSet[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemImageSets)) return false;
        ItemImageSets other = (ItemImageSets) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.imageSet==null && other.getImageSet()==null) || 
             (this.imageSet!=null &&
              java.util.Arrays.equals(this.imageSet, other.getImageSet())));
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
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getImageSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImageSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemImageSets.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Item>ImageSets"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "MerchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ImageSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ImageSet"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
