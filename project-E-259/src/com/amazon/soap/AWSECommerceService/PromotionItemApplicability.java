/**
 * PromotionItemApplicability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class PromotionItemApplicability  implements java.io.Serializable {
    private java.lang.String ASIN;

    private boolean isInBenefitSet;

    private boolean isInEligibilityRequirementSet;

    public PromotionItemApplicability() {
    }

    public PromotionItemApplicability(
           java.lang.String ASIN,
           boolean isInBenefitSet,
           boolean isInEligibilityRequirementSet) {
           this.ASIN = ASIN;
           this.isInBenefitSet = isInBenefitSet;
           this.isInEligibilityRequirementSet = isInEligibilityRequirementSet;
    }


    /**
     * Gets the ASIN value for this PromotionItemApplicability.
     * 
     * @return ASIN
     */
    public java.lang.String getASIN() {
        return ASIN;
    }


    /**
     * Sets the ASIN value for this PromotionItemApplicability.
     * 
     * @param ASIN
     */
    public void setASIN(java.lang.String ASIN) {
        this.ASIN = ASIN;
    }


    /**
     * Gets the isInBenefitSet value for this PromotionItemApplicability.
     * 
     * @return isInBenefitSet
     */
    public boolean isIsInBenefitSet() {
        return isInBenefitSet;
    }


    /**
     * Sets the isInBenefitSet value for this PromotionItemApplicability.
     * 
     * @param isInBenefitSet
     */
    public void setIsInBenefitSet(boolean isInBenefitSet) {
        this.isInBenefitSet = isInBenefitSet;
    }


    /**
     * Gets the isInEligibilityRequirementSet value for this PromotionItemApplicability.
     * 
     * @return isInEligibilityRequirementSet
     */
    public boolean isIsInEligibilityRequirementSet() {
        return isInEligibilityRequirementSet;
    }


    /**
     * Sets the isInEligibilityRequirementSet value for this PromotionItemApplicability.
     * 
     * @param isInEligibilityRequirementSet
     */
    public void setIsInEligibilityRequirementSet(boolean isInEligibilityRequirementSet) {
        this.isInEligibilityRequirementSet = isInEligibilityRequirementSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromotionItemApplicability)) return false;
        PromotionItemApplicability other = (PromotionItemApplicability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ASIN==null && other.getASIN()==null) || 
             (this.ASIN!=null &&
              this.ASIN.equals(other.getASIN()))) &&
            this.isInBenefitSet == other.isIsInBenefitSet() &&
            this.isInEligibilityRequirementSet == other.isIsInEligibilityRequirementSet();
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
        if (getASIN() != null) {
            _hashCode += getASIN().hashCode();
        }
        _hashCode += (isIsInBenefitSet() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsInEligibilityRequirementSet() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromotionItemApplicability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PromotionItemApplicability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ASIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInBenefitSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "IsInBenefitSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInEligibilityRequirementSet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "IsInEligibilityRequirementSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
