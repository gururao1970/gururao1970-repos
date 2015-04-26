/**
 * OfferAttributes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class OfferAttributes  implements java.io.Serializable {
    private java.lang.String condition;

    private java.lang.String subCondition;

    private java.lang.String conditionNote;

    private java.lang.Boolean willShipExpedited;

    private java.lang.Boolean willShipInternational;

    public OfferAttributes() {
    }

    public OfferAttributes(
           java.lang.String condition,
           java.lang.String subCondition,
           java.lang.String conditionNote,
           java.lang.Boolean willShipExpedited,
           java.lang.Boolean willShipInternational) {
           this.condition = condition;
           this.subCondition = subCondition;
           this.conditionNote = conditionNote;
           this.willShipExpedited = willShipExpedited;
           this.willShipInternational = willShipInternational;
    }


    /**
     * Gets the condition value for this OfferAttributes.
     * 
     * @return condition
     */
    public java.lang.String getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this OfferAttributes.
     * 
     * @param condition
     */
    public void setCondition(java.lang.String condition) {
        this.condition = condition;
    }


    /**
     * Gets the subCondition value for this OfferAttributes.
     * 
     * @return subCondition
     */
    public java.lang.String getSubCondition() {
        return subCondition;
    }


    /**
     * Sets the subCondition value for this OfferAttributes.
     * 
     * @param subCondition
     */
    public void setSubCondition(java.lang.String subCondition) {
        this.subCondition = subCondition;
    }


    /**
     * Gets the conditionNote value for this OfferAttributes.
     * 
     * @return conditionNote
     */
    public java.lang.String getConditionNote() {
        return conditionNote;
    }


    /**
     * Sets the conditionNote value for this OfferAttributes.
     * 
     * @param conditionNote
     */
    public void setConditionNote(java.lang.String conditionNote) {
        this.conditionNote = conditionNote;
    }


    /**
     * Gets the willShipExpedited value for this OfferAttributes.
     * 
     * @return willShipExpedited
     */
    public java.lang.Boolean getWillShipExpedited() {
        return willShipExpedited;
    }


    /**
     * Sets the willShipExpedited value for this OfferAttributes.
     * 
     * @param willShipExpedited
     */
    public void setWillShipExpedited(java.lang.Boolean willShipExpedited) {
        this.willShipExpedited = willShipExpedited;
    }


    /**
     * Gets the willShipInternational value for this OfferAttributes.
     * 
     * @return willShipInternational
     */
    public java.lang.Boolean getWillShipInternational() {
        return willShipInternational;
    }


    /**
     * Sets the willShipInternational value for this OfferAttributes.
     * 
     * @param willShipInternational
     */
    public void setWillShipInternational(java.lang.Boolean willShipInternational) {
        this.willShipInternational = willShipInternational;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfferAttributes)) return false;
        OfferAttributes other = (OfferAttributes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition()))) &&
            ((this.subCondition==null && other.getSubCondition()==null) || 
             (this.subCondition!=null &&
              this.subCondition.equals(other.getSubCondition()))) &&
            ((this.conditionNote==null && other.getConditionNote()==null) || 
             (this.conditionNote!=null &&
              this.conditionNote.equals(other.getConditionNote()))) &&
            ((this.willShipExpedited==null && other.getWillShipExpedited()==null) || 
             (this.willShipExpedited!=null &&
              this.willShipExpedited.equals(other.getWillShipExpedited()))) &&
            ((this.willShipInternational==null && other.getWillShipInternational()==null) || 
             (this.willShipInternational!=null &&
              this.willShipInternational.equals(other.getWillShipInternational())));
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
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        if (getSubCondition() != null) {
            _hashCode += getSubCondition().hashCode();
        }
        if (getConditionNote() != null) {
            _hashCode += getConditionNote().hashCode();
        }
        if (getWillShipExpedited() != null) {
            _hashCode += getWillShipExpedited().hashCode();
        }
        if (getWillShipInternational() != null) {
            _hashCode += getWillShipInternational().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OfferAttributes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">OfferAttributes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subCondition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SubCondition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conditionNote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ConditionNote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("willShipExpedited");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "WillShipExpedited"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("willShipInternational");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "WillShipInternational"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
