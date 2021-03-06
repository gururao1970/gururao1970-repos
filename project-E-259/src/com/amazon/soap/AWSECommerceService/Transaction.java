/**
 * Transaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class Transaction  implements java.io.Serializable {
    private java.lang.String transactionId;

    private java.lang.String sellerId;

    private java.lang.String condition;

    private java.lang.String transactionDate;

    private java.lang.String transactionDateEpoch;

    private java.lang.String sellerName;

    private java.lang.String payingCustomerId;

    private java.lang.String orderingCustomerId;

    private com.amazon.soap.AWSECommerceService.TransactionTotals totals;

    private com.amazon.soap.AWSECommerceService.TransactionItem[] transactionItems;

    private com.amazon.soap.AWSECommerceService.TransactionShipmentsShipment[] shipments;

    public Transaction() {
    }

    public Transaction(
           java.lang.String transactionId,
           java.lang.String sellerId,
           java.lang.String condition,
           java.lang.String transactionDate,
           java.lang.String transactionDateEpoch,
           java.lang.String sellerName,
           java.lang.String payingCustomerId,
           java.lang.String orderingCustomerId,
           com.amazon.soap.AWSECommerceService.TransactionTotals totals,
           com.amazon.soap.AWSECommerceService.TransactionItem[] transactionItems,
           com.amazon.soap.AWSECommerceService.TransactionShipmentsShipment[] shipments) {
           this.transactionId = transactionId;
           this.sellerId = sellerId;
           this.condition = condition;
           this.transactionDate = transactionDate;
           this.transactionDateEpoch = transactionDateEpoch;
           this.sellerName = sellerName;
           this.payingCustomerId = payingCustomerId;
           this.orderingCustomerId = orderingCustomerId;
           this.totals = totals;
           this.transactionItems = transactionItems;
           this.shipments = shipments;
    }


    /**
     * Gets the transactionId value for this Transaction.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this Transaction.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the sellerId value for this Transaction.
     * 
     * @return sellerId
     */
    public java.lang.String getSellerId() {
        return sellerId;
    }


    /**
     * Sets the sellerId value for this Transaction.
     * 
     * @param sellerId
     */
    public void setSellerId(java.lang.String sellerId) {
        this.sellerId = sellerId;
    }


    /**
     * Gets the condition value for this Transaction.
     * 
     * @return condition
     */
    public java.lang.String getCondition() {
        return condition;
    }


    /**
     * Sets the condition value for this Transaction.
     * 
     * @param condition
     */
    public void setCondition(java.lang.String condition) {
        this.condition = condition;
    }


    /**
     * Gets the transactionDate value for this Transaction.
     * 
     * @return transactionDate
     */
    public java.lang.String getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this Transaction.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.lang.String transactionDate) {
        this.transactionDate = transactionDate;
    }


    /**
     * Gets the transactionDateEpoch value for this Transaction.
     * 
     * @return transactionDateEpoch
     */
    public java.lang.String getTransactionDateEpoch() {
        return transactionDateEpoch;
    }


    /**
     * Sets the transactionDateEpoch value for this Transaction.
     * 
     * @param transactionDateEpoch
     */
    public void setTransactionDateEpoch(java.lang.String transactionDateEpoch) {
        this.transactionDateEpoch = transactionDateEpoch;
    }


    /**
     * Gets the sellerName value for this Transaction.
     * 
     * @return sellerName
     */
    public java.lang.String getSellerName() {
        return sellerName;
    }


    /**
     * Sets the sellerName value for this Transaction.
     * 
     * @param sellerName
     */
    public void setSellerName(java.lang.String sellerName) {
        this.sellerName = sellerName;
    }


    /**
     * Gets the payingCustomerId value for this Transaction.
     * 
     * @return payingCustomerId
     */
    public java.lang.String getPayingCustomerId() {
        return payingCustomerId;
    }


    /**
     * Sets the payingCustomerId value for this Transaction.
     * 
     * @param payingCustomerId
     */
    public void setPayingCustomerId(java.lang.String payingCustomerId) {
        this.payingCustomerId = payingCustomerId;
    }


    /**
     * Gets the orderingCustomerId value for this Transaction.
     * 
     * @return orderingCustomerId
     */
    public java.lang.String getOrderingCustomerId() {
        return orderingCustomerId;
    }


    /**
     * Sets the orderingCustomerId value for this Transaction.
     * 
     * @param orderingCustomerId
     */
    public void setOrderingCustomerId(java.lang.String orderingCustomerId) {
        this.orderingCustomerId = orderingCustomerId;
    }


    /**
     * Gets the totals value for this Transaction.
     * 
     * @return totals
     */
    public com.amazon.soap.AWSECommerceService.TransactionTotals getTotals() {
        return totals;
    }


    /**
     * Sets the totals value for this Transaction.
     * 
     * @param totals
     */
    public void setTotals(com.amazon.soap.AWSECommerceService.TransactionTotals totals) {
        this.totals = totals;
    }


    /**
     * Gets the transactionItems value for this Transaction.
     * 
     * @return transactionItems
     */
    public com.amazon.soap.AWSECommerceService.TransactionItem[] getTransactionItems() {
        return transactionItems;
    }


    /**
     * Sets the transactionItems value for this Transaction.
     * 
     * @param transactionItems
     */
    public void setTransactionItems(com.amazon.soap.AWSECommerceService.TransactionItem[] transactionItems) {
        this.transactionItems = transactionItems;
    }


    /**
     * Gets the shipments value for this Transaction.
     * 
     * @return shipments
     */
    public com.amazon.soap.AWSECommerceService.TransactionShipmentsShipment[] getShipments() {
        return shipments;
    }


    /**
     * Sets the shipments value for this Transaction.
     * 
     * @param shipments
     */
    public void setShipments(com.amazon.soap.AWSECommerceService.TransactionShipmentsShipment[] shipments) {
        this.shipments = shipments;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Transaction)) return false;
        Transaction other = (Transaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.sellerId==null && other.getSellerId()==null) || 
             (this.sellerId!=null &&
              this.sellerId.equals(other.getSellerId()))) &&
            ((this.condition==null && other.getCondition()==null) || 
             (this.condition!=null &&
              this.condition.equals(other.getCondition()))) &&
            ((this.transactionDate==null && other.getTransactionDate()==null) || 
             (this.transactionDate!=null &&
              this.transactionDate.equals(other.getTransactionDate()))) &&
            ((this.transactionDateEpoch==null && other.getTransactionDateEpoch()==null) || 
             (this.transactionDateEpoch!=null &&
              this.transactionDateEpoch.equals(other.getTransactionDateEpoch()))) &&
            ((this.sellerName==null && other.getSellerName()==null) || 
             (this.sellerName!=null &&
              this.sellerName.equals(other.getSellerName()))) &&
            ((this.payingCustomerId==null && other.getPayingCustomerId()==null) || 
             (this.payingCustomerId!=null &&
              this.payingCustomerId.equals(other.getPayingCustomerId()))) &&
            ((this.orderingCustomerId==null && other.getOrderingCustomerId()==null) || 
             (this.orderingCustomerId!=null &&
              this.orderingCustomerId.equals(other.getOrderingCustomerId()))) &&
            ((this.totals==null && other.getTotals()==null) || 
             (this.totals!=null &&
              this.totals.equals(other.getTotals()))) &&
            ((this.transactionItems==null && other.getTransactionItems()==null) || 
             (this.transactionItems!=null &&
              java.util.Arrays.equals(this.transactionItems, other.getTransactionItems()))) &&
            ((this.shipments==null && other.getShipments()==null) || 
             (this.shipments!=null &&
              java.util.Arrays.equals(this.shipments, other.getShipments())));
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
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getSellerId() != null) {
            _hashCode += getSellerId().hashCode();
        }
        if (getCondition() != null) {
            _hashCode += getCondition().hashCode();
        }
        if (getTransactionDate() != null) {
            _hashCode += getTransactionDate().hashCode();
        }
        if (getTransactionDateEpoch() != null) {
            _hashCode += getTransactionDateEpoch().hashCode();
        }
        if (getSellerName() != null) {
            _hashCode += getSellerName().hashCode();
        }
        if (getPayingCustomerId() != null) {
            _hashCode += getPayingCustomerId().hashCode();
        }
        if (getOrderingCustomerId() != null) {
            _hashCode += getOrderingCustomerId().hashCode();
        }
        if (getTotals() != null) {
            _hashCode += getTotals().hashCode();
        }
        if (getTransactionItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactionItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipments(), i);
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
        new org.apache.axis.description.TypeDesc(Transaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Transaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SellerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Condition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "TransactionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDateEpoch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "TransactionDateEpoch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SellerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payingCustomerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PayingCustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderingCustomerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "OrderingCustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totals");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Totals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Transaction>Totals"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "TransactionItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "TransactionItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Shipments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>Transaction>Shipments>Shipment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Shipment"));
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
