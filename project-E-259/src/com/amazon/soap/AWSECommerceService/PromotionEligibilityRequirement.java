/**
 * PromotionEligibilityRequirement.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class PromotionEligibilityRequirement  implements java.io.Serializable {
    private java.lang.String eligibilityRequirementType;

    private java.lang.Integer quantity;

    private com.amazon.soap.AWSECommerceService.Price currencyAmount;

    public PromotionEligibilityRequirement() {
    }

    public PromotionEligibilityRequirement(
           java.lang.String eligibilityRequirementType,
           java.lang.Integer quantity,
           com.amazon.soap.AWSECommerceService.Price currencyAmount) {
           this.eligibilityRequirementType = eligibilityRequirementType;
           this.quantity = quantity;
           this.currencyAmount = currencyAmount;
    }


    /**
     * Gets the eligibilityRequirementType value for this PromotionEligibilityRequirement.
     * 
     * @return eligibilityRequirementType
     */
    public java.lang.String getEligibilityRequirementType() {
        return eligibilityRequirementType;
    }


    /**
     * Sets the eligibilityRequirementType value for this PromotionEligibilityRequirement.
     * 
     * @param eligibilityRequirementType
     */
    public void setEligibilityRequirementType(java.lang.String eligibilityRequirementType) {
        this.eligibilityRequirementType = eligibilityRequirementType;
    }


    /**
     * Gets the quantity value for this PromotionEligibilityRequirement.
     * 
     * @return quantity
     */
    public java.lang.Integer getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this PromotionEligibilityRequirement.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the currencyAmount value for this PromotionEligibilityRequirement.
     * 
     * @return currencyAmount
     */
    public com.amazon.soap.AWSECommerceService.Price getCurrencyAmount() {
        return currencyAmount;
    }


    /**
     * Sets the currencyAmount value for this PromotionEligibilityRequirement.
     * 
     * @param currencyAmount
     */
    public void setCurrencyAmount(com.amazon.soap.AWSECommerceService.Price currencyAmount) {
        this.currencyAmount = currencyAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromotionEligibilityRequirement)) return false;
        PromotionEligibilityRequirement other = (PromotionEligibilityRequirement) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eligibilityRequirementType==null && other.getEligibilityRequirementType()==null) || 
             (this.eligibilityRequirementType!=null &&
              this.eligibilityRequirementType.equals(other.getEligibilityRequirementType()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.currencyAmount==null && other.getCurrencyAmount()==null) || 
             (this.currencyAmount!=null &&
              this.currencyAmount.equals(other.getCurrencyAmount())));
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
        if (getEligibilityRequirementType() != null) {
            _hashCode += getEligibilityRequirementType().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getCurrencyAmount() != null) {
            _hashCode += getCurrencyAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromotionEligibilityRequirement.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PromotionEligibilityRequirement"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eligibilityRequirementType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "EligibilityRequirementType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CurrencyAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Price"));
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
