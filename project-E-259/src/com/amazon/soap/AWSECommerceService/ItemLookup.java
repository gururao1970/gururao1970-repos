/**
 * ItemLookup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class ItemLookup  implements java.io.Serializable {
    private java.lang.String marketplaceDomain;

    private java.lang.String AWSAccessKeyId;

    private java.lang.String subscriptionId;

    private java.lang.String associateTag;

    private java.lang.String validate;

    private java.lang.String XMLEscaping;

    private com.amazon.soap.AWSECommerceService.ItemLookupRequest shared;

    private com.amazon.soap.AWSECommerceService.ItemLookupRequest[] request;

    public ItemLookup() {
    }

    public ItemLookup(
           java.lang.String marketplaceDomain,
           java.lang.String AWSAccessKeyId,
           java.lang.String subscriptionId,
           java.lang.String associateTag,
           java.lang.String validate,
           java.lang.String XMLEscaping,
           com.amazon.soap.AWSECommerceService.ItemLookupRequest shared,
           com.amazon.soap.AWSECommerceService.ItemLookupRequest[] request) {
           this.marketplaceDomain = marketplaceDomain;
           this.AWSAccessKeyId = AWSAccessKeyId;
           this.subscriptionId = subscriptionId;
           this.associateTag = associateTag;
           this.validate = validate;
           this.XMLEscaping = XMLEscaping;
           this.shared = shared;
           this.request = request;
    }


    /**
     * Gets the marketplaceDomain value for this ItemLookup.
     * 
     * @return marketplaceDomain
     */
    public java.lang.String getMarketplaceDomain() {
        return marketplaceDomain;
    }


    /**
     * Sets the marketplaceDomain value for this ItemLookup.
     * 
     * @param marketplaceDomain
     */
    public void setMarketplaceDomain(java.lang.String marketplaceDomain) {
        this.marketplaceDomain = marketplaceDomain;
    }


    /**
     * Gets the AWSAccessKeyId value for this ItemLookup.
     * 
     * @return AWSAccessKeyId
     */
    public java.lang.String getAWSAccessKeyId() {
        return AWSAccessKeyId;
    }


    /**
     * Sets the AWSAccessKeyId value for this ItemLookup.
     * 
     * @param AWSAccessKeyId
     */
    public void setAWSAccessKeyId(java.lang.String AWSAccessKeyId) {
        this.AWSAccessKeyId = AWSAccessKeyId;
    }


    /**
     * Gets the subscriptionId value for this ItemLookup.
     * 
     * @return subscriptionId
     */
    public java.lang.String getSubscriptionId() {
        return subscriptionId;
    }


    /**
     * Sets the subscriptionId value for this ItemLookup.
     * 
     * @param subscriptionId
     */
    public void setSubscriptionId(java.lang.String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    /**
     * Gets the associateTag value for this ItemLookup.
     * 
     * @return associateTag
     */
    public java.lang.String getAssociateTag() {
        return associateTag;
    }


    /**
     * Sets the associateTag value for this ItemLookup.
     * 
     * @param associateTag
     */
    public void setAssociateTag(java.lang.String associateTag) {
        this.associateTag = associateTag;
    }


    /**
     * Gets the validate value for this ItemLookup.
     * 
     * @return validate
     */
    public java.lang.String getValidate() {
        return validate;
    }


    /**
     * Sets the validate value for this ItemLookup.
     * 
     * @param validate
     */
    public void setValidate(java.lang.String validate) {
        this.validate = validate;
    }


    /**
     * Gets the XMLEscaping value for this ItemLookup.
     * 
     * @return XMLEscaping
     */
    public java.lang.String getXMLEscaping() {
        return XMLEscaping;
    }


    /**
     * Sets the XMLEscaping value for this ItemLookup.
     * 
     * @param XMLEscaping
     */
    public void setXMLEscaping(java.lang.String XMLEscaping) {
        this.XMLEscaping = XMLEscaping;
    }


    /**
     * Gets the shared value for this ItemLookup.
     * 
     * @return shared
     */
    public com.amazon.soap.AWSECommerceService.ItemLookupRequest getShared() {
        return shared;
    }


    /**
     * Sets the shared value for this ItemLookup.
     * 
     * @param shared
     */
    public void setShared(com.amazon.soap.AWSECommerceService.ItemLookupRequest shared) {
        this.shared = shared;
    }


    /**
     * Gets the request value for this ItemLookup.
     * 
     * @return request
     */
    public com.amazon.soap.AWSECommerceService.ItemLookupRequest[] getRequest() {
        return request;
    }


    /**
     * Sets the request value for this ItemLookup.
     * 
     * @param request
     */
    public void setRequest(com.amazon.soap.AWSECommerceService.ItemLookupRequest[] request) {
        this.request = request;
    }

    public com.amazon.soap.AWSECommerceService.ItemLookupRequest getRequest(int i) {
        return this.request[i];
    }

    public void setRequest(int i, com.amazon.soap.AWSECommerceService.ItemLookupRequest _value) {
        this.request[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemLookup)) return false;
        ItemLookup other = (ItemLookup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.marketplaceDomain==null && other.getMarketplaceDomain()==null) || 
             (this.marketplaceDomain!=null &&
              this.marketplaceDomain.equals(other.getMarketplaceDomain()))) &&
            ((this.AWSAccessKeyId==null && other.getAWSAccessKeyId()==null) || 
             (this.AWSAccessKeyId!=null &&
              this.AWSAccessKeyId.equals(other.getAWSAccessKeyId()))) &&
            ((this.subscriptionId==null && other.getSubscriptionId()==null) || 
             (this.subscriptionId!=null &&
              this.subscriptionId.equals(other.getSubscriptionId()))) &&
            ((this.associateTag==null && other.getAssociateTag()==null) || 
             (this.associateTag!=null &&
              this.associateTag.equals(other.getAssociateTag()))) &&
            ((this.validate==null && other.getValidate()==null) || 
             (this.validate!=null &&
              this.validate.equals(other.getValidate()))) &&
            ((this.XMLEscaping==null && other.getXMLEscaping()==null) || 
             (this.XMLEscaping!=null &&
              this.XMLEscaping.equals(other.getXMLEscaping()))) &&
            ((this.shared==null && other.getShared()==null) || 
             (this.shared!=null &&
              this.shared.equals(other.getShared()))) &&
            ((this.request==null && other.getRequest()==null) || 
             (this.request!=null &&
              java.util.Arrays.equals(this.request, other.getRequest())));
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
        if (getMarketplaceDomain() != null) {
            _hashCode += getMarketplaceDomain().hashCode();
        }
        if (getAWSAccessKeyId() != null) {
            _hashCode += getAWSAccessKeyId().hashCode();
        }
        if (getSubscriptionId() != null) {
            _hashCode += getSubscriptionId().hashCode();
        }
        if (getAssociateTag() != null) {
            _hashCode += getAssociateTag().hashCode();
        }
        if (getValidate() != null) {
            _hashCode += getValidate().hashCode();
        }
        if (getXMLEscaping() != null) {
            _hashCode += getXMLEscaping().hashCode();
        }
        if (getShared() != null) {
            _hashCode += getShared().hashCode();
        }
        if (getRequest() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequest());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequest(), i);
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
        new org.apache.axis.description.TypeDesc(ItemLookup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ItemLookup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marketplaceDomain");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "MarketplaceDomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AWSAccessKeyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "AWSAccessKeyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SubscriptionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associateTag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "AssociateTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Validate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XMLEscaping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "XMLEscaping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shared");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Shared"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ItemLookupRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("request");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Request"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ItemLookupRequest"));
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
