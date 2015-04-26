/**
 * Offer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class Offer  implements java.io.Serializable {
    private com.amazon.soap.AWSECommerceService.Merchant merchant;

    private com.amazon.soap.AWSECommerceService.Seller seller;

    private com.amazon.soap.AWSECommerceService.OfferAttributes offerAttributes;

    private com.amazon.soap.AWSECommerceService.OfferListing[] offerListing;

    private com.amazon.soap.AWSECommerceService.LoyaltyPoints loyaltyPoints;

    private com.amazon.soap.AWSECommerceService.Promotion[] promotions;

    public Offer() {
    }

    public Offer(
           com.amazon.soap.AWSECommerceService.Merchant merchant,
           com.amazon.soap.AWSECommerceService.Seller seller,
           com.amazon.soap.AWSECommerceService.OfferAttributes offerAttributes,
           com.amazon.soap.AWSECommerceService.OfferListing[] offerListing,
           com.amazon.soap.AWSECommerceService.LoyaltyPoints loyaltyPoints,
           com.amazon.soap.AWSECommerceService.Promotion[] promotions) {
           this.merchant = merchant;
           this.seller = seller;
           this.offerAttributes = offerAttributes;
           this.offerListing = offerListing;
           this.loyaltyPoints = loyaltyPoints;
           this.promotions = promotions;
    }


    /**
     * Gets the merchant value for this Offer.
     * 
     * @return merchant
     */
    public com.amazon.soap.AWSECommerceService.Merchant getMerchant() {
        return merchant;
    }


    /**
     * Sets the merchant value for this Offer.
     * 
     * @param merchant
     */
    public void setMerchant(com.amazon.soap.AWSECommerceService.Merchant merchant) {
        this.merchant = merchant;
    }


    /**
     * Gets the seller value for this Offer.
     * 
     * @return seller
     */
    public com.amazon.soap.AWSECommerceService.Seller getSeller() {
        return seller;
    }


    /**
     * Sets the seller value for this Offer.
     * 
     * @param seller
     */
    public void setSeller(com.amazon.soap.AWSECommerceService.Seller seller) {
        this.seller = seller;
    }


    /**
     * Gets the offerAttributes value for this Offer.
     * 
     * @return offerAttributes
     */
    public com.amazon.soap.AWSECommerceService.OfferAttributes getOfferAttributes() {
        return offerAttributes;
    }


    /**
     * Sets the offerAttributes value for this Offer.
     * 
     * @param offerAttributes
     */
    public void setOfferAttributes(com.amazon.soap.AWSECommerceService.OfferAttributes offerAttributes) {
        this.offerAttributes = offerAttributes;
    }


    /**
     * Gets the offerListing value for this Offer.
     * 
     * @return offerListing
     */
    public com.amazon.soap.AWSECommerceService.OfferListing[] getOfferListing() {
        return offerListing;
    }


    /**
     * Sets the offerListing value for this Offer.
     * 
     * @param offerListing
     */
    public void setOfferListing(com.amazon.soap.AWSECommerceService.OfferListing[] offerListing) {
        this.offerListing = offerListing;
    }

    public com.amazon.soap.AWSECommerceService.OfferListing getOfferListing(int i) {
        return this.offerListing[i];
    }

    public void setOfferListing(int i, com.amazon.soap.AWSECommerceService.OfferListing _value) {
        this.offerListing[i] = _value;
    }


    /**
     * Gets the loyaltyPoints value for this Offer.
     * 
     * @return loyaltyPoints
     */
    public com.amazon.soap.AWSECommerceService.LoyaltyPoints getLoyaltyPoints() {
        return loyaltyPoints;
    }


    /**
     * Sets the loyaltyPoints value for this Offer.
     * 
     * @param loyaltyPoints
     */
    public void setLoyaltyPoints(com.amazon.soap.AWSECommerceService.LoyaltyPoints loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }


    /**
     * Gets the promotions value for this Offer.
     * 
     * @return promotions
     */
    public com.amazon.soap.AWSECommerceService.Promotion[] getPromotions() {
        return promotions;
    }


    /**
     * Sets the promotions value for this Offer.
     * 
     * @param promotions
     */
    public void setPromotions(com.amazon.soap.AWSECommerceService.Promotion[] promotions) {
        this.promotions = promotions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Offer)) return false;
        Offer other = (Offer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.merchant==null && other.getMerchant()==null) || 
             (this.merchant!=null &&
              this.merchant.equals(other.getMerchant()))) &&
            ((this.seller==null && other.getSeller()==null) || 
             (this.seller!=null &&
              this.seller.equals(other.getSeller()))) &&
            ((this.offerAttributes==null && other.getOfferAttributes()==null) || 
             (this.offerAttributes!=null &&
              this.offerAttributes.equals(other.getOfferAttributes()))) &&
            ((this.offerListing==null && other.getOfferListing()==null) || 
             (this.offerListing!=null &&
              java.util.Arrays.equals(this.offerListing, other.getOfferListing()))) &&
            ((this.loyaltyPoints==null && other.getLoyaltyPoints()==null) || 
             (this.loyaltyPoints!=null &&
              this.loyaltyPoints.equals(other.getLoyaltyPoints()))) &&
            ((this.promotions==null && other.getPromotions()==null) || 
             (this.promotions!=null &&
              java.util.Arrays.equals(this.promotions, other.getPromotions())));
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
        if (getMerchant() != null) {
            _hashCode += getMerchant().hashCode();
        }
        if (getSeller() != null) {
            _hashCode += getSeller().hashCode();
        }
        if (getOfferAttributes() != null) {
            _hashCode += getOfferAttributes().hashCode();
        }
        if (getOfferListing() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferListing());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferListing(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLoyaltyPoints() != null) {
            _hashCode += getLoyaltyPoints().hashCode();
        }
        if (getPromotions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromotions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromotions(), i);
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
        new org.apache.axis.description.TypeDesc(Offer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Offer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Merchant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Merchant"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seller");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Seller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Seller"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "OfferAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">OfferAttributes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerListing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "OfferListing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "OfferListing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loyaltyPoints");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "LoyaltyPoints"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">LoyaltyPoints"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Promotions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Promotions"));
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
