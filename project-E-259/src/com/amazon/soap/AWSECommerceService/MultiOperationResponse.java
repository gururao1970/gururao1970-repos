/**
 * MultiOperationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class MultiOperationResponse  implements java.io.Serializable {
    private com.amazon.soap.AWSECommerceService.OperationRequest operationRequest;

    private com.amazon.soap.AWSECommerceService.HelpResponse helpResponse;

    private com.amazon.soap.AWSECommerceService.ItemSearchResponse itemSearchResponse;

    private com.amazon.soap.AWSECommerceService.ItemLookupResponse itemLookupResponse;

    private com.amazon.soap.AWSECommerceService.ListSearchResponse listSearchResponse;

    private com.amazon.soap.AWSECommerceService.ListLookupResponse listLookupResponse;

    private com.amazon.soap.AWSECommerceService.CustomerContentSearchResponse customerContentSearchResponse;

    private com.amazon.soap.AWSECommerceService.CustomerContentLookupResponse customerContentLookupResponse;

    private com.amazon.soap.AWSECommerceService.SimilarityLookupResponse similarityLookupResponse;

    private com.amazon.soap.AWSECommerceService.SellerLookupResponse sellerLookupResponse;

    private com.amazon.soap.AWSECommerceService.CartGetResponse cartGetResponse;

    private com.amazon.soap.AWSECommerceService.CartAddResponse cartAddResponse;

    private com.amazon.soap.AWSECommerceService.CartCreateResponse cartCreateResponse;

    private com.amazon.soap.AWSECommerceService.CartModifyResponse cartModifyResponse;

    private com.amazon.soap.AWSECommerceService.CartClearResponse cartClearResponse;

    private com.amazon.soap.AWSECommerceService.TransactionLookupResponse transactionLookupResponse;

    private com.amazon.soap.AWSECommerceService.SellerListingSearchResponse sellerListingSearchResponse;

    private com.amazon.soap.AWSECommerceService.SellerListingLookupResponse sellerListingLookupResponse;

    private com.amazon.soap.AWSECommerceService.BrowseNodeLookupResponse browseNodeLookupResponse;

    public MultiOperationResponse() {
    }

    public MultiOperationResponse(
           com.amazon.soap.AWSECommerceService.OperationRequest operationRequest,
           com.amazon.soap.AWSECommerceService.HelpResponse helpResponse,
           com.amazon.soap.AWSECommerceService.ItemSearchResponse itemSearchResponse,
           com.amazon.soap.AWSECommerceService.ItemLookupResponse itemLookupResponse,
           com.amazon.soap.AWSECommerceService.ListSearchResponse listSearchResponse,
           com.amazon.soap.AWSECommerceService.ListLookupResponse listLookupResponse,
           com.amazon.soap.AWSECommerceService.CustomerContentSearchResponse customerContentSearchResponse,
           com.amazon.soap.AWSECommerceService.CustomerContentLookupResponse customerContentLookupResponse,
           com.amazon.soap.AWSECommerceService.SimilarityLookupResponse similarityLookupResponse,
           com.amazon.soap.AWSECommerceService.SellerLookupResponse sellerLookupResponse,
           com.amazon.soap.AWSECommerceService.CartGetResponse cartGetResponse,
           com.amazon.soap.AWSECommerceService.CartAddResponse cartAddResponse,
           com.amazon.soap.AWSECommerceService.CartCreateResponse cartCreateResponse,
           com.amazon.soap.AWSECommerceService.CartModifyResponse cartModifyResponse,
           com.amazon.soap.AWSECommerceService.CartClearResponse cartClearResponse,
           com.amazon.soap.AWSECommerceService.TransactionLookupResponse transactionLookupResponse,
           com.amazon.soap.AWSECommerceService.SellerListingSearchResponse sellerListingSearchResponse,
           com.amazon.soap.AWSECommerceService.SellerListingLookupResponse sellerListingLookupResponse,
           com.amazon.soap.AWSECommerceService.BrowseNodeLookupResponse browseNodeLookupResponse) {
           this.operationRequest = operationRequest;
           this.helpResponse = helpResponse;
           this.itemSearchResponse = itemSearchResponse;
           this.itemLookupResponse = itemLookupResponse;
           this.listSearchResponse = listSearchResponse;
           this.listLookupResponse = listLookupResponse;
           this.customerContentSearchResponse = customerContentSearchResponse;
           this.customerContentLookupResponse = customerContentLookupResponse;
           this.similarityLookupResponse = similarityLookupResponse;
           this.sellerLookupResponse = sellerLookupResponse;
           this.cartGetResponse = cartGetResponse;
           this.cartAddResponse = cartAddResponse;
           this.cartCreateResponse = cartCreateResponse;
           this.cartModifyResponse = cartModifyResponse;
           this.cartClearResponse = cartClearResponse;
           this.transactionLookupResponse = transactionLookupResponse;
           this.sellerListingSearchResponse = sellerListingSearchResponse;
           this.sellerListingLookupResponse = sellerListingLookupResponse;
           this.browseNodeLookupResponse = browseNodeLookupResponse;
    }


    /**
     * Gets the operationRequest value for this MultiOperationResponse.
     * 
     * @return operationRequest
     */
    public com.amazon.soap.AWSECommerceService.OperationRequest getOperationRequest() {
        return operationRequest;
    }


    /**
     * Sets the operationRequest value for this MultiOperationResponse.
     * 
     * @param operationRequest
     */
    public void setOperationRequest(com.amazon.soap.AWSECommerceService.OperationRequest operationRequest) {
        this.operationRequest = operationRequest;
    }


    /**
     * Gets the helpResponse value for this MultiOperationResponse.
     * 
     * @return helpResponse
     */
    public com.amazon.soap.AWSECommerceService.HelpResponse getHelpResponse() {
        return helpResponse;
    }


    /**
     * Sets the helpResponse value for this MultiOperationResponse.
     * 
     * @param helpResponse
     */
    public void setHelpResponse(com.amazon.soap.AWSECommerceService.HelpResponse helpResponse) {
        this.helpResponse = helpResponse;
    }


    /**
     * Gets the itemSearchResponse value for this MultiOperationResponse.
     * 
     * @return itemSearchResponse
     */
    public com.amazon.soap.AWSECommerceService.ItemSearchResponse getItemSearchResponse() {
        return itemSearchResponse;
    }


    /**
     * Sets the itemSearchResponse value for this MultiOperationResponse.
     * 
     * @param itemSearchResponse
     */
    public void setItemSearchResponse(com.amazon.soap.AWSECommerceService.ItemSearchResponse itemSearchResponse) {
        this.itemSearchResponse = itemSearchResponse;
    }


    /**
     * Gets the itemLookupResponse value for this MultiOperationResponse.
     * 
     * @return itemLookupResponse
     */
    public com.amazon.soap.AWSECommerceService.ItemLookupResponse getItemLookupResponse() {
        return itemLookupResponse;
    }


    /**
     * Sets the itemLookupResponse value for this MultiOperationResponse.
     * 
     * @param itemLookupResponse
     */
    public void setItemLookupResponse(com.amazon.soap.AWSECommerceService.ItemLookupResponse itemLookupResponse) {
        this.itemLookupResponse = itemLookupResponse;
    }


    /**
     * Gets the listSearchResponse value for this MultiOperationResponse.
     * 
     * @return listSearchResponse
     */
    public com.amazon.soap.AWSECommerceService.ListSearchResponse getListSearchResponse() {
        return listSearchResponse;
    }


    /**
     * Sets the listSearchResponse value for this MultiOperationResponse.
     * 
     * @param listSearchResponse
     */
    public void setListSearchResponse(com.amazon.soap.AWSECommerceService.ListSearchResponse listSearchResponse) {
        this.listSearchResponse = listSearchResponse;
    }


    /**
     * Gets the listLookupResponse value for this MultiOperationResponse.
     * 
     * @return listLookupResponse
     */
    public com.amazon.soap.AWSECommerceService.ListLookupResponse getListLookupResponse() {
        return listLookupResponse;
    }


    /**
     * Sets the listLookupResponse value for this MultiOperationResponse.
     * 
     * @param listLookupResponse
     */
    public void setListLookupResponse(com.amazon.soap.AWSECommerceService.ListLookupResponse listLookupResponse) {
        this.listLookupResponse = listLookupResponse;
    }


    /**
     * Gets the customerContentSearchResponse value for this MultiOperationResponse.
     * 
     * @return customerContentSearchResponse
     */
    public com.amazon.soap.AWSECommerceService.CustomerContentSearchResponse getCustomerContentSearchResponse() {
        return customerContentSearchResponse;
    }


    /**
     * Sets the customerContentSearchResponse value for this MultiOperationResponse.
     * 
     * @param customerContentSearchResponse
     */
    public void setCustomerContentSearchResponse(com.amazon.soap.AWSECommerceService.CustomerContentSearchResponse customerContentSearchResponse) {
        this.customerContentSearchResponse = customerContentSearchResponse;
    }


    /**
     * Gets the customerContentLookupResponse value for this MultiOperationResponse.
     * 
     * @return customerContentLookupResponse
     */
    public com.amazon.soap.AWSECommerceService.CustomerContentLookupResponse getCustomerContentLookupResponse() {
        return customerContentLookupResponse;
    }


    /**
     * Sets the customerContentLookupResponse value for this MultiOperationResponse.
     * 
     * @param customerContentLookupResponse
     */
    public void setCustomerContentLookupResponse(com.amazon.soap.AWSECommerceService.CustomerContentLookupResponse customerContentLookupResponse) {
        this.customerContentLookupResponse = customerContentLookupResponse;
    }


    /**
     * Gets the similarityLookupResponse value for this MultiOperationResponse.
     * 
     * @return similarityLookupResponse
     */
    public com.amazon.soap.AWSECommerceService.SimilarityLookupResponse getSimilarityLookupResponse() {
        return similarityLookupResponse;
    }


    /**
     * Sets the similarityLookupResponse value for this MultiOperationResponse.
     * 
     * @param similarityLookupResponse
     */
    public void setSimilarityLookupResponse(com.amazon.soap.AWSECommerceService.SimilarityLookupResponse similarityLookupResponse) {
        this.similarityLookupResponse = similarityLookupResponse;
    }


    /**
     * Gets the sellerLookupResponse value for this MultiOperationResponse.
     * 
     * @return sellerLookupResponse
     */
    public com.amazon.soap.AWSECommerceService.SellerLookupResponse getSellerLookupResponse() {
        return sellerLookupResponse;
    }


    /**
     * Sets the sellerLookupResponse value for this MultiOperationResponse.
     * 
     * @param sellerLookupResponse
     */
    public void setSellerLookupResponse(com.amazon.soap.AWSECommerceService.SellerLookupResponse sellerLookupResponse) {
        this.sellerLookupResponse = sellerLookupResponse;
    }


    /**
     * Gets the cartGetResponse value for this MultiOperationResponse.
     * 
     * @return cartGetResponse
     */
    public com.amazon.soap.AWSECommerceService.CartGetResponse getCartGetResponse() {
        return cartGetResponse;
    }


    /**
     * Sets the cartGetResponse value for this MultiOperationResponse.
     * 
     * @param cartGetResponse
     */
    public void setCartGetResponse(com.amazon.soap.AWSECommerceService.CartGetResponse cartGetResponse) {
        this.cartGetResponse = cartGetResponse;
    }


    /**
     * Gets the cartAddResponse value for this MultiOperationResponse.
     * 
     * @return cartAddResponse
     */
    public com.amazon.soap.AWSECommerceService.CartAddResponse getCartAddResponse() {
        return cartAddResponse;
    }


    /**
     * Sets the cartAddResponse value for this MultiOperationResponse.
     * 
     * @param cartAddResponse
     */
    public void setCartAddResponse(com.amazon.soap.AWSECommerceService.CartAddResponse cartAddResponse) {
        this.cartAddResponse = cartAddResponse;
    }


    /**
     * Gets the cartCreateResponse value for this MultiOperationResponse.
     * 
     * @return cartCreateResponse
     */
    public com.amazon.soap.AWSECommerceService.CartCreateResponse getCartCreateResponse() {
        return cartCreateResponse;
    }


    /**
     * Sets the cartCreateResponse value for this MultiOperationResponse.
     * 
     * @param cartCreateResponse
     */
    public void setCartCreateResponse(com.amazon.soap.AWSECommerceService.CartCreateResponse cartCreateResponse) {
        this.cartCreateResponse = cartCreateResponse;
    }


    /**
     * Gets the cartModifyResponse value for this MultiOperationResponse.
     * 
     * @return cartModifyResponse
     */
    public com.amazon.soap.AWSECommerceService.CartModifyResponse getCartModifyResponse() {
        return cartModifyResponse;
    }


    /**
     * Sets the cartModifyResponse value for this MultiOperationResponse.
     * 
     * @param cartModifyResponse
     */
    public void setCartModifyResponse(com.amazon.soap.AWSECommerceService.CartModifyResponse cartModifyResponse) {
        this.cartModifyResponse = cartModifyResponse;
    }


    /**
     * Gets the cartClearResponse value for this MultiOperationResponse.
     * 
     * @return cartClearResponse
     */
    public com.amazon.soap.AWSECommerceService.CartClearResponse getCartClearResponse() {
        return cartClearResponse;
    }


    /**
     * Sets the cartClearResponse value for this MultiOperationResponse.
     * 
     * @param cartClearResponse
     */
    public void setCartClearResponse(com.amazon.soap.AWSECommerceService.CartClearResponse cartClearResponse) {
        this.cartClearResponse = cartClearResponse;
    }


    /**
     * Gets the transactionLookupResponse value for this MultiOperationResponse.
     * 
     * @return transactionLookupResponse
     */
    public com.amazon.soap.AWSECommerceService.TransactionLookupResponse getTransactionLookupResponse() {
        return transactionLookupResponse;
    }


    /**
     * Sets the transactionLookupResponse value for this MultiOperationResponse.
     * 
     * @param transactionLookupResponse
     */
    public void setTransactionLookupResponse(com.amazon.soap.AWSECommerceService.TransactionLookupResponse transactionLookupResponse) {
        this.transactionLookupResponse = transactionLookupResponse;
    }


    /**
     * Gets the sellerListingSearchResponse value for this MultiOperationResponse.
     * 
     * @return sellerListingSearchResponse
     */
    public com.amazon.soap.AWSECommerceService.SellerListingSearchResponse getSellerListingSearchResponse() {
        return sellerListingSearchResponse;
    }


    /**
     * Sets the sellerListingSearchResponse value for this MultiOperationResponse.
     * 
     * @param sellerListingSearchResponse
     */
    public void setSellerListingSearchResponse(com.amazon.soap.AWSECommerceService.SellerListingSearchResponse sellerListingSearchResponse) {
        this.sellerListingSearchResponse = sellerListingSearchResponse;
    }


    /**
     * Gets the sellerListingLookupResponse value for this MultiOperationResponse.
     * 
     * @return sellerListingLookupResponse
     */
    public com.amazon.soap.AWSECommerceService.SellerListingLookupResponse getSellerListingLookupResponse() {
        return sellerListingLookupResponse;
    }


    /**
     * Sets the sellerListingLookupResponse value for this MultiOperationResponse.
     * 
     * @param sellerListingLookupResponse
     */
    public void setSellerListingLookupResponse(com.amazon.soap.AWSECommerceService.SellerListingLookupResponse sellerListingLookupResponse) {
        this.sellerListingLookupResponse = sellerListingLookupResponse;
    }


    /**
     * Gets the browseNodeLookupResponse value for this MultiOperationResponse.
     * 
     * @return browseNodeLookupResponse
     */
    public com.amazon.soap.AWSECommerceService.BrowseNodeLookupResponse getBrowseNodeLookupResponse() {
        return browseNodeLookupResponse;
    }


    /**
     * Sets the browseNodeLookupResponse value for this MultiOperationResponse.
     * 
     * @param browseNodeLookupResponse
     */
    public void setBrowseNodeLookupResponse(com.amazon.soap.AWSECommerceService.BrowseNodeLookupResponse browseNodeLookupResponse) {
        this.browseNodeLookupResponse = browseNodeLookupResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MultiOperationResponse)) return false;
        MultiOperationResponse other = (MultiOperationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operationRequest==null && other.getOperationRequest()==null) || 
             (this.operationRequest!=null &&
              this.operationRequest.equals(other.getOperationRequest()))) &&
            ((this.helpResponse==null && other.getHelpResponse()==null) || 
             (this.helpResponse!=null &&
              this.helpResponse.equals(other.getHelpResponse()))) &&
            ((this.itemSearchResponse==null && other.getItemSearchResponse()==null) || 
             (this.itemSearchResponse!=null &&
              this.itemSearchResponse.equals(other.getItemSearchResponse()))) &&
            ((this.itemLookupResponse==null && other.getItemLookupResponse()==null) || 
             (this.itemLookupResponse!=null &&
              this.itemLookupResponse.equals(other.getItemLookupResponse()))) &&
            ((this.listSearchResponse==null && other.getListSearchResponse()==null) || 
             (this.listSearchResponse!=null &&
              this.listSearchResponse.equals(other.getListSearchResponse()))) &&
            ((this.listLookupResponse==null && other.getListLookupResponse()==null) || 
             (this.listLookupResponse!=null &&
              this.listLookupResponse.equals(other.getListLookupResponse()))) &&
            ((this.customerContentSearchResponse==null && other.getCustomerContentSearchResponse()==null) || 
             (this.customerContentSearchResponse!=null &&
              this.customerContentSearchResponse.equals(other.getCustomerContentSearchResponse()))) &&
            ((this.customerContentLookupResponse==null && other.getCustomerContentLookupResponse()==null) || 
             (this.customerContentLookupResponse!=null &&
              this.customerContentLookupResponse.equals(other.getCustomerContentLookupResponse()))) &&
            ((this.similarityLookupResponse==null && other.getSimilarityLookupResponse()==null) || 
             (this.similarityLookupResponse!=null &&
              this.similarityLookupResponse.equals(other.getSimilarityLookupResponse()))) &&
            ((this.sellerLookupResponse==null && other.getSellerLookupResponse()==null) || 
             (this.sellerLookupResponse!=null &&
              this.sellerLookupResponse.equals(other.getSellerLookupResponse()))) &&
            ((this.cartGetResponse==null && other.getCartGetResponse()==null) || 
             (this.cartGetResponse!=null &&
              this.cartGetResponse.equals(other.getCartGetResponse()))) &&
            ((this.cartAddResponse==null && other.getCartAddResponse()==null) || 
             (this.cartAddResponse!=null &&
              this.cartAddResponse.equals(other.getCartAddResponse()))) &&
            ((this.cartCreateResponse==null && other.getCartCreateResponse()==null) || 
             (this.cartCreateResponse!=null &&
              this.cartCreateResponse.equals(other.getCartCreateResponse()))) &&
            ((this.cartModifyResponse==null && other.getCartModifyResponse()==null) || 
             (this.cartModifyResponse!=null &&
              this.cartModifyResponse.equals(other.getCartModifyResponse()))) &&
            ((this.cartClearResponse==null && other.getCartClearResponse()==null) || 
             (this.cartClearResponse!=null &&
              this.cartClearResponse.equals(other.getCartClearResponse()))) &&
            ((this.transactionLookupResponse==null && other.getTransactionLookupResponse()==null) || 
             (this.transactionLookupResponse!=null &&
              this.transactionLookupResponse.equals(other.getTransactionLookupResponse()))) &&
            ((this.sellerListingSearchResponse==null && other.getSellerListingSearchResponse()==null) || 
             (this.sellerListingSearchResponse!=null &&
              this.sellerListingSearchResponse.equals(other.getSellerListingSearchResponse()))) &&
            ((this.sellerListingLookupResponse==null && other.getSellerListingLookupResponse()==null) || 
             (this.sellerListingLookupResponse!=null &&
              this.sellerListingLookupResponse.equals(other.getSellerListingLookupResponse()))) &&
            ((this.browseNodeLookupResponse==null && other.getBrowseNodeLookupResponse()==null) || 
             (this.browseNodeLookupResponse!=null &&
              this.browseNodeLookupResponse.equals(other.getBrowseNodeLookupResponse())));
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
        if (getOperationRequest() != null) {
            _hashCode += getOperationRequest().hashCode();
        }
        if (getHelpResponse() != null) {
            _hashCode += getHelpResponse().hashCode();
        }
        if (getItemSearchResponse() != null) {
            _hashCode += getItemSearchResponse().hashCode();
        }
        if (getItemLookupResponse() != null) {
            _hashCode += getItemLookupResponse().hashCode();
        }
        if (getListSearchResponse() != null) {
            _hashCode += getListSearchResponse().hashCode();
        }
        if (getListLookupResponse() != null) {
            _hashCode += getListLookupResponse().hashCode();
        }
        if (getCustomerContentSearchResponse() != null) {
            _hashCode += getCustomerContentSearchResponse().hashCode();
        }
        if (getCustomerContentLookupResponse() != null) {
            _hashCode += getCustomerContentLookupResponse().hashCode();
        }
        if (getSimilarityLookupResponse() != null) {
            _hashCode += getSimilarityLookupResponse().hashCode();
        }
        if (getSellerLookupResponse() != null) {
            _hashCode += getSellerLookupResponse().hashCode();
        }
        if (getCartGetResponse() != null) {
            _hashCode += getCartGetResponse().hashCode();
        }
        if (getCartAddResponse() != null) {
            _hashCode += getCartAddResponse().hashCode();
        }
        if (getCartCreateResponse() != null) {
            _hashCode += getCartCreateResponse().hashCode();
        }
        if (getCartModifyResponse() != null) {
            _hashCode += getCartModifyResponse().hashCode();
        }
        if (getCartClearResponse() != null) {
            _hashCode += getCartClearResponse().hashCode();
        }
        if (getTransactionLookupResponse() != null) {
            _hashCode += getTransactionLookupResponse().hashCode();
        }
        if (getSellerListingSearchResponse() != null) {
            _hashCode += getSellerListingSearchResponse().hashCode();
        }
        if (getSellerListingLookupResponse() != null) {
            _hashCode += getSellerListingLookupResponse().hashCode();
        }
        if (getBrowseNodeLookupResponse() != null) {
            _hashCode += getBrowseNodeLookupResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MultiOperationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">MultiOperationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "OperationRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">OperationRequest"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helpResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "HelpResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">HelpResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSearchResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ItemSearchResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ItemSearchResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemLookupResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ItemLookupResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ItemLookupResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listSearchResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ListSearchResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ListSearchResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listLookupResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ListLookupResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ListLookupResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerContentSearchResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CustomerContentSearchResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CustomerContentSearchResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerContentLookupResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CustomerContentLookupResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CustomerContentLookupResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("similarityLookupResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SimilarityLookupResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SimilarityLookupResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerLookupResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SellerLookupResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerLookupResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartGetResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartGetResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartGetResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartAddResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartAddResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartAddResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartCreateResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartCreateResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartCreateResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartModifyResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartModifyResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartModifyResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cartClearResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartClearResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartClearResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionLookupResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "TransactionLookupResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">TransactionLookupResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerListingSearchResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SellerListingSearchResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerListingSearchResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerListingLookupResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SellerListingLookupResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerListingLookupResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browseNodeLookupResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "BrowseNodeLookupResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">BrowseNodeLookupResponse"));
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
