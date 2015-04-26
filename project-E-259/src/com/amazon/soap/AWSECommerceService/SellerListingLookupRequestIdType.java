/**
 * SellerListingLookupRequestIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class SellerListingLookupRequestIdType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SellerListingLookupRequestIdType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Exchange = "Exchange";
    public static final java.lang.String _Listing = "Listing";
    public static final java.lang.String _ASIN = "ASIN";
    public static final java.lang.String _SKU = "SKU";
    public static final SellerListingLookupRequestIdType Exchange = new SellerListingLookupRequestIdType(_Exchange);
    public static final SellerListingLookupRequestIdType Listing = new SellerListingLookupRequestIdType(_Listing);
    public static final SellerListingLookupRequestIdType ASIN = new SellerListingLookupRequestIdType(_ASIN);
    public static final SellerListingLookupRequestIdType SKU = new SellerListingLookupRequestIdType(_SKU);
    public java.lang.String getValue() { return _value_;}
    public static SellerListingLookupRequestIdType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SellerListingLookupRequestIdType enumeration = (SellerListingLookupRequestIdType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SellerListingLookupRequestIdType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellerListingLookupRequestIdType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerListingLookupRequest>IdType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
