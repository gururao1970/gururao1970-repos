/**
 * PromotionDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class PromotionDetails  implements java.io.Serializable {
    private java.lang.String merchantId;

    private java.lang.String owningMerchantId;

    private java.lang.String promotionId;

    private java.lang.String promotionCategory;

    private java.lang.String merchantPromotionId;

    private java.lang.String groupClaimCode;

    private java.lang.String couponCombinationType;

    private java.lang.String startDate;

    private java.lang.String endDate;

    private java.lang.String termsAndConditions;

    private com.amazon.soap.AWSECommerceService.PromotionEligibilityRequirement[] eligibilityRequirements;

    private com.amazon.soap.AWSECommerceService.PromotionBenefit[] benefits;

    private com.amazon.soap.AWSECommerceService.PromotionItemApplicability itemApplicability;

    public PromotionDetails() {
    }

    public PromotionDetails(
           java.lang.String merchantId,
           java.lang.String owningMerchantId,
           java.lang.String promotionId,
           java.lang.String promotionCategory,
           java.lang.String merchantPromotionId,
           java.lang.String groupClaimCode,
           java.lang.String couponCombinationType,
           java.lang.String startDate,
           java.lang.String endDate,
           java.lang.String termsAndConditions,
           com.amazon.soap.AWSECommerceService.PromotionEligibilityRequirement[] eligibilityRequirements,
           com.amazon.soap.AWSECommerceService.PromotionBenefit[] benefits,
           com.amazon.soap.AWSECommerceService.PromotionItemApplicability itemApplicability) {
           this.merchantId = merchantId;
           this.owningMerchantId = owningMerchantId;
           this.promotionId = promotionId;
           this.promotionCategory = promotionCategory;
           this.merchantPromotionId = merchantPromotionId;
           this.groupClaimCode = groupClaimCode;
           this.couponCombinationType = couponCombinationType;
           this.startDate = startDate;
           this.endDate = endDate;
           this.termsAndConditions = termsAndConditions;
           this.eligibilityRequirements = eligibilityRequirements;
           this.benefits = benefits;
           this.itemApplicability = itemApplicability;
    }


    /**
     * Gets the merchantId value for this PromotionDetails.
     * 
     * @return merchantId
     */
    public java.lang.String getMerchantId() {
        return merchantId;
    }


    /**
     * Sets the merchantId value for this PromotionDetails.
     * 
     * @param merchantId
     */
    public void setMerchantId(java.lang.String merchantId) {
        this.merchantId = merchantId;
    }


    /**
     * Gets the owningMerchantId value for this PromotionDetails.
     * 
     * @return owningMerchantId
     */
    public java.lang.String getOwningMerchantId() {
        return owningMerchantId;
    }


    /**
     * Sets the owningMerchantId value for this PromotionDetails.
     * 
     * @param owningMerchantId
     */
    public void setOwningMerchantId(java.lang.String owningMerchantId) {
        this.owningMerchantId = owningMerchantId;
    }


    /**
     * Gets the promotionId value for this PromotionDetails.
     * 
     * @return promotionId
     */
    public java.lang.String getPromotionId() {
        return promotionId;
    }


    /**
     * Sets the promotionId value for this PromotionDetails.
     * 
     * @param promotionId
     */
    public void setPromotionId(java.lang.String promotionId) {
        this.promotionId = promotionId;
    }


    /**
     * Gets the promotionCategory value for this PromotionDetails.
     * 
     * @return promotionCategory
     */
    public java.lang.String getPromotionCategory() {
        return promotionCategory;
    }


    /**
     * Sets the promotionCategory value for this PromotionDetails.
     * 
     * @param promotionCategory
     */
    public void setPromotionCategory(java.lang.String promotionCategory) {
        this.promotionCategory = promotionCategory;
    }


    /**
     * Gets the merchantPromotionId value for this PromotionDetails.
     * 
     * @return merchantPromotionId
     */
    public java.lang.String getMerchantPromotionId() {
        return merchantPromotionId;
    }


    /**
     * Sets the merchantPromotionId value for this PromotionDetails.
     * 
     * @param merchantPromotionId
     */
    public void setMerchantPromotionId(java.lang.String merchantPromotionId) {
        this.merchantPromotionId = merchantPromotionId;
    }


    /**
     * Gets the groupClaimCode value for this PromotionDetails.
     * 
     * @return groupClaimCode
     */
    public java.lang.String getGroupClaimCode() {
        return groupClaimCode;
    }


    /**
     * Sets the groupClaimCode value for this PromotionDetails.
     * 
     * @param groupClaimCode
     */
    public void setGroupClaimCode(java.lang.String groupClaimCode) {
        this.groupClaimCode = groupClaimCode;
    }


    /**
     * Gets the couponCombinationType value for this PromotionDetails.
     * 
     * @return couponCombinationType
     */
    public java.lang.String getCouponCombinationType() {
        return couponCombinationType;
    }


    /**
     * Sets the couponCombinationType value for this PromotionDetails.
     * 
     * @param couponCombinationType
     */
    public void setCouponCombinationType(java.lang.String couponCombinationType) {
        this.couponCombinationType = couponCombinationType;
    }


    /**
     * Gets the startDate value for this PromotionDetails.
     * 
     * @return startDate
     */
    public java.lang.String getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this PromotionDetails.
     * 
     * @param startDate
     */
    public void setStartDate(java.lang.String startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this PromotionDetails.
     * 
     * @return endDate
     */
    public java.lang.String getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this PromotionDetails.
     * 
     * @param endDate
     */
    public void setEndDate(java.lang.String endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the termsAndConditions value for this PromotionDetails.
     * 
     * @return termsAndConditions
     */
    public java.lang.String getTermsAndConditions() {
        return termsAndConditions;
    }


    /**
     * Sets the termsAndConditions value for this PromotionDetails.
     * 
     * @param termsAndConditions
     */
    public void setTermsAndConditions(java.lang.String termsAndConditions) {
        this.termsAndConditions = termsAndConditions;
    }


    /**
     * Gets the eligibilityRequirements value for this PromotionDetails.
     * 
     * @return eligibilityRequirements
     */
    public com.amazon.soap.AWSECommerceService.PromotionEligibilityRequirement[] getEligibilityRequirements() {
        return eligibilityRequirements;
    }


    /**
     * Sets the eligibilityRequirements value for this PromotionDetails.
     * 
     * @param eligibilityRequirements
     */
    public void setEligibilityRequirements(com.amazon.soap.AWSECommerceService.PromotionEligibilityRequirement[] eligibilityRequirements) {
        this.eligibilityRequirements = eligibilityRequirements;
    }


    /**
     * Gets the benefits value for this PromotionDetails.
     * 
     * @return benefits
     */
    public com.amazon.soap.AWSECommerceService.PromotionBenefit[] getBenefits() {
        return benefits;
    }


    /**
     * Sets the benefits value for this PromotionDetails.
     * 
     * @param benefits
     */
    public void setBenefits(com.amazon.soap.AWSECommerceService.PromotionBenefit[] benefits) {
        this.benefits = benefits;
    }


    /**
     * Gets the itemApplicability value for this PromotionDetails.
     * 
     * @return itemApplicability
     */
    public com.amazon.soap.AWSECommerceService.PromotionItemApplicability getItemApplicability() {
        return itemApplicability;
    }


    /**
     * Sets the itemApplicability value for this PromotionDetails.
     * 
     * @param itemApplicability
     */
    public void setItemApplicability(com.amazon.soap.AWSECommerceService.PromotionItemApplicability itemApplicability) {
        this.itemApplicability = itemApplicability;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PromotionDetails)) return false;
        PromotionDetails other = (PromotionDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.merchantId==null && other.getMerchantId()==null) || 
             (this.merchantId!=null &&
              this.merchantId.equals(other.getMerchantId()))) &&
            ((this.owningMerchantId==null && other.getOwningMerchantId()==null) || 
             (this.owningMerchantId!=null &&
              this.owningMerchantId.equals(other.getOwningMerchantId()))) &&
            ((this.promotionId==null && other.getPromotionId()==null) || 
             (this.promotionId!=null &&
              this.promotionId.equals(other.getPromotionId()))) &&
            ((this.promotionCategory==null && other.getPromotionCategory()==null) || 
             (this.promotionCategory!=null &&
              this.promotionCategory.equals(other.getPromotionCategory()))) &&
            ((this.merchantPromotionId==null && other.getMerchantPromotionId()==null) || 
             (this.merchantPromotionId!=null &&
              this.merchantPromotionId.equals(other.getMerchantPromotionId()))) &&
            ((this.groupClaimCode==null && other.getGroupClaimCode()==null) || 
             (this.groupClaimCode!=null &&
              this.groupClaimCode.equals(other.getGroupClaimCode()))) &&
            ((this.couponCombinationType==null && other.getCouponCombinationType()==null) || 
             (this.couponCombinationType!=null &&
              this.couponCombinationType.equals(other.getCouponCombinationType()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.termsAndConditions==null && other.getTermsAndConditions()==null) || 
             (this.termsAndConditions!=null &&
              this.termsAndConditions.equals(other.getTermsAndConditions()))) &&
            ((this.eligibilityRequirements==null && other.getEligibilityRequirements()==null) || 
             (this.eligibilityRequirements!=null &&
              java.util.Arrays.equals(this.eligibilityRequirements, other.getEligibilityRequirements()))) &&
            ((this.benefits==null && other.getBenefits()==null) || 
             (this.benefits!=null &&
              java.util.Arrays.equals(this.benefits, other.getBenefits()))) &&
            ((this.itemApplicability==null && other.getItemApplicability()==null) || 
             (this.itemApplicability!=null &&
              this.itemApplicability.equals(other.getItemApplicability())));
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
        if (getMerchantId() != null) {
            _hashCode += getMerchantId().hashCode();
        }
        if (getOwningMerchantId() != null) {
            _hashCode += getOwningMerchantId().hashCode();
        }
        if (getPromotionId() != null) {
            _hashCode += getPromotionId().hashCode();
        }
        if (getPromotionCategory() != null) {
            _hashCode += getPromotionCategory().hashCode();
        }
        if (getMerchantPromotionId() != null) {
            _hashCode += getMerchantPromotionId().hashCode();
        }
        if (getGroupClaimCode() != null) {
            _hashCode += getGroupClaimCode().hashCode();
        }
        if (getCouponCombinationType() != null) {
            _hashCode += getCouponCombinationType().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getTermsAndConditions() != null) {
            _hashCode += getTermsAndConditions().hashCode();
        }
        if (getEligibilityRequirements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEligibilityRequirements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEligibilityRequirements(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBenefits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBenefits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBenefits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemApplicability() != null) {
            _hashCode += getItemApplicability().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PromotionDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Promotion>Details"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "MerchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owningMerchantId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "OwningMerchantId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PromotionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PromotionCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantPromotionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "MerchantPromotionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupClaimCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "GroupClaimCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("couponCombinationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CouponCombinationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termsAndConditions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "TermsAndConditions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eligibilityRequirements");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "EligibilityRequirements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PromotionEligibilityRequirement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "EligibilityRequirement"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("benefits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Benefits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PromotionBenefit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Benefit"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemApplicability");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ItemApplicability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PromotionItemApplicability"));
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
