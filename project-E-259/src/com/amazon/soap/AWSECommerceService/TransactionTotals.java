/**
 * TransactionTotals.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class TransactionTotals  implements java.io.Serializable {
    private com.amazon.soap.AWSECommerceService.Price total;

    private com.amazon.soap.AWSECommerceService.Price subtotal;

    private com.amazon.soap.AWSECommerceService.Price tax;

    private com.amazon.soap.AWSECommerceService.Price shippingCharge;

    private com.amazon.soap.AWSECommerceService.Price promotion;

    public TransactionTotals() {
    }

    public TransactionTotals(
           com.amazon.soap.AWSECommerceService.Price total,
           com.amazon.soap.AWSECommerceService.Price subtotal,
           com.amazon.soap.AWSECommerceService.Price tax,
           com.amazon.soap.AWSECommerceService.Price shippingCharge,
           com.amazon.soap.AWSECommerceService.Price promotion) {
           this.total = total;
           this.subtotal = subtotal;
           this.tax = tax;
           this.shippingCharge = shippingCharge;
           this.promotion = promotion;
    }


    /**
     * Gets the total value for this TransactionTotals.
     * 
     * @return total
     */
    public com.amazon.soap.AWSECommerceService.Price getTotal() {
        return total;
    }


    /**
     * Sets the total value for this TransactionTotals.
     * 
     * @param total
     */
    public void setTotal(com.amazon.soap.AWSECommerceService.Price total) {
        this.total = total;
    }


    /**
     * Gets the subtotal value for this TransactionTotals.
     * 
     * @return subtotal
     */
    public com.amazon.soap.AWSECommerceService.Price getSubtotal() {
        return subtotal;
    }


    /**
     * Sets the subtotal value for this TransactionTotals.
     * 
     * @param subtotal
     */
    public void setSubtotal(com.amazon.soap.AWSECommerceService.Price subtotal) {
        this.subtotal = subtotal;
    }


    /**
     * Gets the tax value for this TransactionTotals.
     * 
     * @return tax
     */
    public com.amazon.soap.AWSECommerceService.Price getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this TransactionTotals.
     * 
     * @param tax
     */
    public void setTax(com.amazon.soap.AWSECommerceService.Price tax) {
        this.tax = tax;
    }


    /**
     * Gets the shippingCharge value for this TransactionTotals.
     * 
     * @return shippingCharge
     */
    public com.amazon.soap.AWSECommerceService.Price getShippingCharge() {
        return shippingCharge;
    }


    /**
     * Sets the shippingCharge value for this TransactionTotals.
     * 
     * @param shippingCharge
     */
    public void setShippingCharge(com.amazon.soap.AWSECommerceService.Price shippingCharge) {
        this.shippingCharge = shippingCharge;
    }


    /**
     * Gets the promotion value for this TransactionTotals.
     * 
     * @return promotion
     */
    public com.amazon.soap.AWSECommerceService.Price getPromotion() {
        return promotion;
    }


    /**
     * Sets the promotion value for this TransactionTotals.
     * 
     * @param promotion
     */
    public void setPromotion(com.amazon.soap.AWSECommerceService.Price promotion) {
        this.promotion = promotion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionTotals)) return false;
        TransactionTotals other = (TransactionTotals) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.subtotal==null && other.getSubtotal()==null) || 
             (this.subtotal!=null &&
              this.subtotal.equals(other.getSubtotal()))) &&
            ((this.tax==null && other.getTax()==null) || 
             (this.tax!=null &&
              this.tax.equals(other.getTax()))) &&
            ((this.shippingCharge==null && other.getShippingCharge()==null) || 
             (this.shippingCharge!=null &&
              this.shippingCharge.equals(other.getShippingCharge()))) &&
            ((this.promotion==null && other.getPromotion()==null) || 
             (this.promotion!=null &&
              this.promotion.equals(other.getPromotion())));
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
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getSubtotal() != null) {
            _hashCode += getSubtotal().hashCode();
        }
        if (getTax() != null) {
            _hashCode += getTax().hashCode();
        }
        if (getShippingCharge() != null) {
            _hashCode += getShippingCharge().hashCode();
        }
        if (getPromotion() != null) {
            _hashCode += getPromotion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionTotals.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Transaction>Totals"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Price"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtotal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Subtotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Price"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Price"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ShippingCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Price"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Promotion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Price"));
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
