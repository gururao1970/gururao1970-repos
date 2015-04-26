/**
 * ImageSet.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class ImageSet  implements java.io.Serializable {
    private com.amazon.soap.AWSECommerceService.Image swatchImage;

    private com.amazon.soap.AWSECommerceService.Image smallImage;

    private com.amazon.soap.AWSECommerceService.Image mediumImage;

    private com.amazon.soap.AWSECommerceService.Image largeImage;

    private java.lang.String category;  // attribute

    public ImageSet() {
    }

    public ImageSet(
           com.amazon.soap.AWSECommerceService.Image swatchImage,
           com.amazon.soap.AWSECommerceService.Image smallImage,
           com.amazon.soap.AWSECommerceService.Image mediumImage,
           com.amazon.soap.AWSECommerceService.Image largeImage,
           java.lang.String category) {
           this.swatchImage = swatchImage;
           this.smallImage = smallImage;
           this.mediumImage = mediumImage;
           this.largeImage = largeImage;
           this.category = category;
    }


    /**
     * Gets the swatchImage value for this ImageSet.
     * 
     * @return swatchImage
     */
    public com.amazon.soap.AWSECommerceService.Image getSwatchImage() {
        return swatchImage;
    }


    /**
     * Sets the swatchImage value for this ImageSet.
     * 
     * @param swatchImage
     */
    public void setSwatchImage(com.amazon.soap.AWSECommerceService.Image swatchImage) {
        this.swatchImage = swatchImage;
    }


    /**
     * Gets the smallImage value for this ImageSet.
     * 
     * @return smallImage
     */
    public com.amazon.soap.AWSECommerceService.Image getSmallImage() {
        return smallImage;
    }


    /**
     * Sets the smallImage value for this ImageSet.
     * 
     * @param smallImage
     */
    public void setSmallImage(com.amazon.soap.AWSECommerceService.Image smallImage) {
        this.smallImage = smallImage;
    }


    /**
     * Gets the mediumImage value for this ImageSet.
     * 
     * @return mediumImage
     */
    public com.amazon.soap.AWSECommerceService.Image getMediumImage() {
        return mediumImage;
    }


    /**
     * Sets the mediumImage value for this ImageSet.
     * 
     * @param mediumImage
     */
    public void setMediumImage(com.amazon.soap.AWSECommerceService.Image mediumImage) {
        this.mediumImage = mediumImage;
    }


    /**
     * Gets the largeImage value for this ImageSet.
     * 
     * @return largeImage
     */
    public com.amazon.soap.AWSECommerceService.Image getLargeImage() {
        return largeImage;
    }


    /**
     * Sets the largeImage value for this ImageSet.
     * 
     * @param largeImage
     */
    public void setLargeImage(com.amazon.soap.AWSECommerceService.Image largeImage) {
        this.largeImage = largeImage;
    }


    /**
     * Gets the category value for this ImageSet.
     * 
     * @return category
     */
    public java.lang.String getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ImageSet.
     * 
     * @param category
     */
    public void setCategory(java.lang.String category) {
        this.category = category;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImageSet)) return false;
        ImageSet other = (ImageSet) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.swatchImage==null && other.getSwatchImage()==null) || 
             (this.swatchImage!=null &&
              this.swatchImage.equals(other.getSwatchImage()))) &&
            ((this.smallImage==null && other.getSmallImage()==null) || 
             (this.smallImage!=null &&
              this.smallImage.equals(other.getSmallImage()))) &&
            ((this.mediumImage==null && other.getMediumImage()==null) || 
             (this.mediumImage!=null &&
              this.mediumImage.equals(other.getMediumImage()))) &&
            ((this.largeImage==null && other.getLargeImage()==null) || 
             (this.largeImage!=null &&
              this.largeImage.equals(other.getLargeImage()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory())));
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
        if (getSwatchImage() != null) {
            _hashCode += getSwatchImage().hashCode();
        }
        if (getSmallImage() != null) {
            _hashCode += getSmallImage().hashCode();
        }
        if (getMediumImage() != null) {
            _hashCode += getMediumImage().hashCode();
        }
        if (getLargeImage() != null) {
            _hashCode += getLargeImage().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImageSet.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ImageSet"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("category");
        attrField.setXmlName(new javax.xml.namespace.QName("", "Category"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swatchImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SwatchImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smallImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SmallImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediumImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "MediumImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Image"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("largeImage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "LargeImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Image"));
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
