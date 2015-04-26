/**
 * PromotionBenefit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class PromotionBenefit  implements java.io.Serializable {
    private java.lang.String benefitType;

    private java.lang.String componentType;

    private java.lang.Integer quantity;

    private java.lang.Double percentOff;

    private com.amazon.soap.AWSECommerceService.Price fixedAmount;

    private com.amazon.soap.AWSECommerceService.Price ceiling;

    public PromotionBenefit() {
    }

    public PromotionBenefit(
           java.lang.String benefitType,
           java.lang.String componentType,
           java.lang.Integer quantity,
           java.lang.Double percentOff,
           com.amazon.soap.AWSECommerceService.Price fixedAmount,
           com.amazon.soap.AWSECommerceService.Price ceiling) {
           this.benefitType = benefitType;
           this.componentType = componentType;
           this.quantity = quantity;
           this.percentOff = percentOff;
           this.fixedAmount = fixedAmount;
           this.ceiling = ceiling;
    }


    /**
     * Gets the benefitType value for this PromotionBenefit.
     * 
     * @return benefitType
     */
    public java.lang.String getBenefitType() {
        return benefitType;
    }


    /**
     * Sets the benefitType value for this PromotionBenefit.
     * 
     * @param benefitType
     */
    public void setBenefitType(java.lang.String benefitType) {
        this.benefitType = benefitType;
    }


    /**
     * Gets the componentType value for this PromotionBenefit.
     * 
     * @return componentType
     */
    public java.lang.String getComponentType() {
        return componentType;
    }


    /**
     * Sets the componentType value for this PromotionBenefit.
     * 
     * @param componentType
     */
    public void setComponentType(java.lang.String componentType) {
        this.componentType = componentType;
    }


    /**
     * Gets the quantity value for this PromotionBenefit.
     * 
     * @return quantity
     */
    public java.lang.Integer getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this PromotionBenefit.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the percentOff value for this PromotionBenefit.
     * 
     * @return percentOff
     */
    public java.lang.Double getPercentOff() {
        return percentOff;
    }


    /**
     * Sets the percentOff value for this PromotionBenefit.
     * 
     * @param percentOff
     */
    public void setPercentOff(java.lang.Double percentOff) {
        this.percentOff = percentOff;
    }


    /**
     * Gets the fixedAmount value for this PromotionBenefit.
     * 
     * @return fixedAmount
     */
    public com.amazon.soap.AWSECommerceService.Price getFixedAmount() {
        return fixedAmount;
    }


    /**
     * Sets the fixedAmount value for this PromotionBenefit.
     * 
     * @param fixedAmount
     */
    public void setFixedAmount(com.amazon.soap.AWSECommerceService.Price fixedAmount) {
        this.fixedAmount = fixedAmount;
    }


    /**
     * Gets the ceiling value for this PromotionBenefit.
     * 
     * @return ceiling
     */
    public com.amazon.soap.AWSECommerceService.Price getCeiling() {
        return ceiling;
    }


    /**
     * Sets the ceiling value for this PromotionBenefit.
     * 
     * @param ceiling
     */
    public void setCeiling(com.amazon.soap.AWSECommerceService.Price ceiling) {
        this.ceiling = ceiling;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromotionBenefit)) return false;
        PromotionBenefit other = (PromotionBenefit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.benefitType==null && other.getBenefitType()==null) || 
             (this.benefitType!=null &&
              this.benefitType.equals(other.getBenefitType()))) &&
            ((this.componentType==null && other.getComponentType()==null) || 
             (this.componentType!=null &&
              this.componentType.equals(other.getComponentType()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.percentOff==null && other.getPercentOff()==null) || 
             (this.percentOff!=null &&
              this.percentOff.equals(other.getPercentOff()))) &&
            ((this.fixedAmount==null && other.getFixedAmount()==null) || 
             (this.fixedAmount!=null &&
              this.fixedAmount.equals(other.getFixedAmount()))) &&
            ((this.ceiling==null && other.getCeiling()==null) || 
             (this.ceiling!=null &&
              this.ceiling.equals(other.getCeiling())));
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
        if (getBenefitType() != null) {
            _hashCode += getBenefitType().hashCode();
        }
        if (getComponentType() != null) {
            _hashCode += getComponentType().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getPercentOff() != null) {
            _hashCode += getPercentOff().hashCode();
        }
        if (getFixedAmount() != null) {
            _hashCode += getFixedAmount().hashCode();
        }
        if (getCeiling() != null) {
            _hashCode += getCeiling().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromotionBenefit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PromotionBenefit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefitType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "BenefitType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ComponentType"));
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
        elemField.setFieldName("percentOff");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PercentOff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "FixedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ceiling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Ceiling"));
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
