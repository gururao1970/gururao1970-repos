/**
 * OfferListing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class OfferListing  implements java.io.Serializable {
    private java.lang.String offerListingId;

    private java.lang.String exchangeId;

    private com.amazon.soap.AWSECommerceService.Price price;

    private com.amazon.soap.AWSECommerceService.Price salePrice;

    private com.amazon.soap.AWSECommerceService.Price amountSaved;

    private org.apache.axis.types.NonNegativeInteger percentageSaved;

    private java.lang.String availability;

    private com.amazon.soap.AWSECommerceService.OfferListingAvailabilityAttributes availabilityAttributes;

    private java.math.BigInteger quantity;

    private com.amazon.soap.AWSECommerceService.Address ISPUStoreAddress;

    private java.lang.String ISPUStoreHours;

    private java.lang.Boolean isEligibleForSuperSaverShipping;

    private java.lang.String salesRestriction;

    private com.amazon.soap.AWSECommerceService.OfferListingShippingCharge[] shippingCharge;

    public OfferListing() {
    }

    public OfferListing(
           java.lang.String offerListingId,
           java.lang.String exchangeId,
           com.amazon.soap.AWSECommerceService.Price price,
           com.amazon.soap.AWSECommerceService.Price salePrice,
           com.amazon.soap.AWSECommerceService.Price amountSaved,
           org.apache.axis.types.NonNegativeInteger percentageSaved,
           java.lang.String availability,
           com.amazon.soap.AWSECommerceService.OfferListingAvailabilityAttributes availabilityAttributes,
           java.math.BigInteger quantity,
           com.amazon.soap.AWSECommerceService.Address ISPUStoreAddress,
           java.lang.String ISPUStoreHours,
           java.lang.Boolean isEligibleForSuperSaverShipping,
           java.lang.String salesRestriction,
           com.amazon.soap.AWSECommerceService.OfferListingShippingCharge[] shippingCharge) {
           this.offerListingId = offerListingId;
           this.exchangeId = exchangeId;
           this.price = price;
           this.salePrice = salePrice;
           this.amountSaved = amountSaved;
           this.percentageSaved = percentageSaved;
           this.availability = availability;
           this.availabilityAttributes = availabilityAttributes;
           this.quantity = quantity;
           this.ISPUStoreAddress = ISPUStoreAddress;
           this.ISPUStoreHours = ISPUStoreHours;
           this.isEligibleForSuperSaverShipping = isEligibleForSuperSaverShipping;
           this.salesRestriction = salesRestriction;
           this.shippingCharge = shippingCharge;
    }


    /**
     * Gets the offerListingId value for this OfferListing.
     * 
     * @return offerListingId
     */
    public java.lang.String getOfferListingId() {
        return offerListingId;
    }


    /**
     * Sets the offerListingId value for this OfferListing.
     * 
     * @param offerListingId
     */
    public void setOfferListingId(java.lang.String offerListingId) {
        this.offerListingId = offerListingId;
    }


    /**
     * Gets the exchangeId value for this OfferListing.
     * 
     * @return exchangeId
     */
    public java.lang.String getExchangeId() {
        return exchangeId;
    }


    /**
     * Sets the exchangeId value for this OfferListing.
     * 
     * @param exchangeId
     */
    public void setExchangeId(java.lang.String exchangeId) {
        this.exchangeId = exchangeId;
    }


    /**
     * Gets the price value for this OfferListing.
     * 
     * @return price
     */
    public com.amazon.soap.AWSECommerceService.Price getPrice() {
        return price;
    }


    /**
     * Sets the price value for this OfferListing.
     * 
     * @param price
     */
    public void setPrice(com.amazon.soap.AWSECommerceService.Price price) {
        this.price = price;
    }


    /**
     * Gets the salePrice value for this OfferListing.
     * 
     * @return salePrice
     */
    public com.amazon.soap.AWSECommerceService.Price getSalePrice() {
        return salePrice;
    }


    /**
     * Sets the salePrice value for this OfferListing.
     * 
     * @param salePrice
     */
    public void setSalePrice(com.amazon.soap.AWSECommerceService.Price salePrice) {
        this.salePrice = salePrice;
    }


    /**
     * Gets the amountSaved value for this OfferListing.
     * 
     * @return amountSaved
     */
    public com.amazon.soap.AWSECommerceService.Price getAmountSaved() {
        return amountSaved;
    }


    /**
     * Sets the amountSaved value for this OfferListing.
     * 
     * @param amountSaved
     */
    public void setAmountSaved(com.amazon.soap.AWSECommerceService.Price amountSaved) {
        this.amountSaved = amountSaved;
    }


    /**
     * Gets the percentageSaved value for this OfferListing.
     * 
     * @return percentageSaved
     */
    public org.apache.axis.types.NonNegativeInteger getPercentageSaved() {
        return percentageSaved;
    }


    /**
     * Sets the percentageSaved value for this OfferListing.
     * 
     * @param percentageSaved
     */
    public void setPercentageSaved(org.apache.axis.types.NonNegativeInteger percentageSaved) {
        this.percentageSaved = percentageSaved;
    }


    /**
     * Gets the availability value for this OfferListing.
     * 
     * @return availability
     */
    public java.lang.String getAvailability() {
        return availability;
    }


    /**
     * Sets the availability value for this OfferListing.
     * 
     * @param availability
     */
    public void setAvailability(java.lang.String availability) {
        this.availability = availability;
    }


    /**
     * Gets the availabilityAttributes value for this OfferListing.
     * 
     * @return availabilityAttributes
     */
    public com.amazon.soap.AWSECommerceService.OfferListingAvailabilityAttributes getAvailabilityAttributes() {
        return availabilityAttributes;
    }


    /**
     * Sets the availabilityAttributes value for this OfferListing.
     * 
     * @param availabilityAttributes
     */
    public void setAvailabilityAttributes(com.amazon.soap.AWSECommerceService.OfferListingAvailabilityAttributes availabilityAttributes) {
        this.availabilityAttributes = availabilityAttributes;
    }


    /**
     * Gets the quantity value for this OfferListing.
     * 
     * @return quantity
     */
    public java.math.BigInteger getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this OfferListing.
     * 
     * @param quantity
     */
    public void setQuantity(java.math.BigInteger quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the ISPUStoreAddress value for this OfferListing.
     * 
     * @return ISPUStoreAddress
     */
    public com.amazon.soap.AWSECommerceService.Address getISPUStoreAddress() {
        return ISPUStoreAddress;
    }


    /**
     * Sets the ISPUStoreAddress value for this OfferListing.
     * 
     * @param ISPUStoreAddress
     */
    public void setISPUStoreAddress(com.amazon.soap.AWSECommerceService.Address ISPUStoreAddress) {
        this.ISPUStoreAddress = ISPUStoreAddress;
    }


    /**
     * Gets the ISPUStoreHours value for this OfferListing.
     * 
     * @return ISPUStoreHours
     */
    public java.lang.String getISPUStoreHours() {
        return ISPUStoreHours;
    }


    /**
     * Sets the ISPUStoreHours value for this OfferListing.
     * 
     * @param ISPUStoreHours
     */
    public void setISPUStoreHours(java.lang.String ISPUStoreHours) {
        this.ISPUStoreHours = ISPUStoreHours;
    }


    /**
     * Gets the isEligibleForSuperSaverShipping value for this OfferListing.
     * 
     * @return isEligibleForSuperSaverShipping
     */
    public java.lang.Boolean getIsEligibleForSuperSaverShipping() {
        return isEligibleForSuperSaverShipping;
    }


    /**
     * Sets the isEligibleForSuperSaverShipping value for this OfferListing.
     * 
     * @param isEligibleForSuperSaverShipping
     */
    public void setIsEligibleForSuperSaverShipping(java.lang.Boolean isEligibleForSuperSaverShipping) {
        this.isEligibleForSuperSaverShipping = isEligibleForSuperSaverShipping;
    }


    /**
     * Gets the salesRestriction value for this OfferListing.
     * 
     * @return salesRestriction
     */
    public java.lang.String getSalesRestriction() {
        return salesRestriction;
    }


    /**
     * Sets the salesRestriction value for this OfferListing.
     * 
     * @param salesRestriction
     */
    public void setSalesRestriction(java.lang.String salesRestriction) {
        this.salesRestriction = salesRestriction;
    }


    /**
     * Gets the shippingCharge value for this OfferListing.
     * 
     * @return shippingCharge
     */
    public com.amazon.soap.AWSECommerceService.OfferListingShippingCharge[] getShippingCharge() {
        return shippingCharge;
    }


    /**
     * Sets the shippingCharge value for this OfferListing.
     * 
     * @param shippingCharge
     */
    public void setShippingCharge(com.amazon.soap.AWSECommerceService.OfferListingShippingCharge[] shippingCharge) {
        this.shippingCharge = shippingCharge;
    }

    public com.amazon.soap.AWSECommerceService.OfferListingShippingCharge getShippingCharge(int i) {
        return this.shippingCharge[i];
    }

    public void setShippingCharge(int i, com.amazon.soap.AWSECommerceService.OfferListingShippingCharge _value) {
        this.shippingCharge[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OfferListing)) return false;
        OfferListing other = (OfferListing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offerListingId==null && other.getOfferListingId()==null) || 
             (this.offerListingId!=null &&
              this.offerListingId.equals(other.getOfferListingId()))) &&
            ((this.exchangeId==null && other.getExchangeId()==null) || 
             (this.exchangeId!=null &&
              this.exchangeId.equals(other.getExchangeId()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.salePrice==null && other.getSalePrice()==null) || 
             (this.salePrice!=null &&
              this.salePrice.equals(other.getSalePrice()))) &&
            ((this.amountSaved==null && other.getAmountSaved()==null) || 
             (this.amountSaved!=null &&
              this.amountSaved.equals(other.getAmountSaved()))) &&
            ((this.percentageSaved==null && other.getPercentageSaved()==null) || 
             (this.percentageSaved!=null &&
              this.percentageSaved.equals(other.getPercentageSaved()))) &&
            ((this.availability==null && other.getAvailability()==null) || 
             (this.availability!=null &&
              this.availability.equals(other.getAvailability()))) &&
            ((this.availabilityAttributes==null && other.getAvailabilityAttributes()==null) || 
             (this.availabilityAttributes!=null &&
              this.availabilityAttributes.equals(other.getAvailabilityAttributes()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.ISPUStoreAddress==null && other.getISPUStoreAddress()==null) || 
             (this.ISPUStoreAddress!=null &&
              this.ISPUStoreAddress.equals(other.getISPUStoreAddress()))) &&
            ((this.ISPUStoreHours==null && other.getISPUStoreHours()==null) || 
             (this.ISPUStoreHours!=null &&
              this.ISPUStoreHours.equals(other.getISPUStoreHours()))) &&
            ((this.isEligibleForSuperSaverShipping==null && other.getIsEligibleForSuperSaverShipping()==null) || 
             (this.isEligibleForSuperSaverShipping!=null &&
              this.isEligibleForSuperSaverShipping.equals(other.getIsEligibleForSuperSaverShipping()))) &&
            ((this.salesRestriction==null && other.getSalesRestriction()==null) || 
             (this.salesRestriction!=null &&
              this.salesRestriction.equals(other.getSalesRestriction()))) &&
            ((this.shippingCharge==null && other.getShippingCharge()==null) || 
             (this.shippingCharge!=null &&
              java.util.Arrays.equals(this.shippingCharge, other.getShippingCharge())));
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
        if (getOfferListingId() != null) {
            _hashCode += getOfferListingId().hashCode();
        }
        if (getExchangeId() != null) {
            _hashCode += getExchangeId().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getSalePrice() != null) {
            _hashCode += getSalePrice().hashCode();
        }
        if (getAmountSaved() != null) {
            _hashCode += getAmountSaved().hashCode();
        }
        if (getPercentageSaved() != null) {
            _hashCode += getPercentageSaved().hashCode();
        }
        if (getAvailability() != null) {
            _hashCode += getAvailability().hashCode();
        }
        if (getAvailabilityAttributes() != null) {
            _hashCode += getAvailabilityAttributes().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getISPUStoreAddress() != null) {
            _hashCode += getISPUStoreAddress().hashCode();
        }
        if (getISPUStoreHours() != null) {
            _hashCode += getISPUStoreHours().hashCode();
        }
        if (getIsEligibleForSuperSaverShipping() != null) {
            _hashCode += getIsEligibleForSuperSaverShipping().hashCode();
        }
        if (getSalesRestriction() != null) {
            _hashCode += getSalesRestriction().hashCode();
        }
        if (getShippingCharge() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingCharge());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingCharge(), i);
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
        new org.apache.axis.description.TypeDesc(OfferListing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">OfferListing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerListingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "OfferListingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ExchangeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SalePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountSaved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "AmountSaved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentageSaved");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PercentageSaved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "nonNegativeInteger"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Availability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availabilityAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "AvailabilityAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>OfferListing>AvailabilityAttributes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISPUStoreAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ISPUStoreAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ISPUStoreHours");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ISPUStoreHours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isEligibleForSuperSaverShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "IsEligibleForSuperSaverShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRestriction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SalesRestriction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ShippingCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>OfferListing>ShippingCharge"));
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
