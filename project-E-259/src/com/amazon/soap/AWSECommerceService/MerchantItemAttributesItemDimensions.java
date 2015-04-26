/**
 * MerchantItemAttributesItemDimensions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class MerchantItemAttributesItemDimensions  implements java.io.Serializable {
    private com.amazon.soap.AWSECommerceService.DecimalWithUnits height;

    private com.amazon.soap.AWSECommerceService.DecimalWithUnits length;

    private com.amazon.soap.AWSECommerceService.DecimalWithUnits weight;

    private com.amazon.soap.AWSECommerceService.DecimalWithUnits width;

    public MerchantItemAttributesItemDimensions() {
    }

    public MerchantItemAttributesItemDimensions(
           com.amazon.soap.AWSECommerceService.DecimalWithUnits height,
           com.amazon.soap.AWSECommerceService.DecimalWithUnits length,
           com.amazon.soap.AWSECommerceService.DecimalWithUnits weight,
           com.amazon.soap.AWSECommerceService.DecimalWithUnits width) {
           this.height = height;
           this.length = length;
           this.weight = weight;
           this.width = width;
    }


    /**
     * Gets the height value for this MerchantItemAttributesItemDimensions.
     * 
     * @return height
     */
    public com.amazon.soap.AWSECommerceService.DecimalWithUnits getHeight() {
        return height;
    }


    /**
     * Sets the height value for this MerchantItemAttributesItemDimensions.
     * 
     * @param height
     */
    public void setHeight(com.amazon.soap.AWSECommerceService.DecimalWithUnits height) {
        this.height = height;
    }


    /**
     * Gets the length value for this MerchantItemAttributesItemDimensions.
     * 
     * @return length
     */
    public com.amazon.soap.AWSECommerceService.DecimalWithUnits getLength() {
        return length;
    }


    /**
     * Sets the length value for this MerchantItemAttributesItemDimensions.
     * 
     * @param length
     */
    public void setLength(com.amazon.soap.AWSECommerceService.DecimalWithUnits length) {
        this.length = length;
    }


    /**
     * Gets the weight value for this MerchantItemAttributesItemDimensions.
     * 
     * @return weight
     */
    public com.amazon.soap.AWSECommerceService.DecimalWithUnits getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this MerchantItemAttributesItemDimensions.
     * 
     * @param weight
     */
    public void setWeight(com.amazon.soap.AWSECommerceService.DecimalWithUnits weight) {
        this.weight = weight;
    }


    /**
     * Gets the width value for this MerchantItemAttributesItemDimensions.
     * 
     * @return width
     */
    public com.amazon.soap.AWSECommerceService.DecimalWithUnits getWidth() {
        return width;
    }


    /**
     * Sets the width value for this MerchantItemAttributesItemDimensions.
     * 
     * @param width
     */
    public void setWidth(com.amazon.soap.AWSECommerceService.DecimalWithUnits width) {
        this.width = width;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MerchantItemAttributesItemDimensions)) return false;
        MerchantItemAttributesItemDimensions other = (MerchantItemAttributesItemDimensions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.height==null && other.getHeight()==null) || 
             (this.height!=null &&
              this.height.equals(other.getHeight()))) &&
            ((this.length==null && other.getLength()==null) || 
             (this.length!=null &&
              this.length.equals(other.getLength()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.width==null && other.getWidth()==null) || 
             (this.width!=null &&
              this.width.equals(other.getWidth())));
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
        if (getHeight() != null) {
            _hashCode += getHeight().hashCode();
        }
        if (getLength() != null) {
            _hashCode += getLength().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getWidth() != null) {
            _hashCode += getWidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MerchantItemAttributesItemDimensions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>MerchantItemAttributes>ItemDimensions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("height");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "DecimalWithUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "DecimalWithUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "DecimalWithUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("width");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "DecimalWithUnits"));
        elemField.setMinOccurs(0);
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
