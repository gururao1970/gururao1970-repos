/**
 * AWSECommerceServiceBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class AWSECommerceServiceBindingStub extends org.apache.axis.client.Stub implements com.amazon.soap.AWSECommerceService.AWSECommerceServicePortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[19];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Help");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Help"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Help"), com.amazon.soap.AWSECommerceService.Help.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">HelpResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.HelpResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "HelpResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ItemSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ItemSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ItemSearch"), com.amazon.soap.AWSECommerceService.ItemSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ItemSearchResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.ItemSearchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ItemSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ItemLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ItemLookup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ItemLookup"), com.amazon.soap.AWSECommerceService.ItemLookup.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ItemLookupResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.ItemLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ItemLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BrowseNodeLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "BrowseNodeLookup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">BrowseNodeLookup"), com.amazon.soap.AWSECommerceService.BrowseNodeLookup.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">BrowseNodeLookupResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.BrowseNodeLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "BrowseNodeLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ListSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ListSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ListSearch"), com.amazon.soap.AWSECommerceService.ListSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ListSearchResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.ListSearchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ListSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ListLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ListLookup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ListLookup"), com.amazon.soap.AWSECommerceService.ListLookup.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ListLookupResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.ListLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ListLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerContentSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CustomerContentSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CustomerContentSearch"), com.amazon.soap.AWSECommerceService.CustomerContentSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CustomerContentSearchResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.CustomerContentSearchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CustomerContentSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CustomerContentLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CustomerContentLookup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CustomerContentLookup"), com.amazon.soap.AWSECommerceService.CustomerContentLookup.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CustomerContentLookupResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.CustomerContentLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CustomerContentLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SimilarityLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SimilarityLookup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SimilarityLookup"), com.amazon.soap.AWSECommerceService.SimilarityLookup.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SimilarityLookupResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.SimilarityLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SimilarityLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SellerLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SellerLookup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerLookup"), com.amazon.soap.AWSECommerceService.SellerLookup.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerLookupResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.SellerLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SellerLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CartGet");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartGet"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartGet"), com.amazon.soap.AWSECommerceService.CartGet.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartGetResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.CartGetResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartGetResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CartCreate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartCreate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartCreate"), com.amazon.soap.AWSECommerceService.CartCreate.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartCreateResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.CartCreateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartCreateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CartAdd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartAdd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartAdd"), com.amazon.soap.AWSECommerceService.CartAdd.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartAddResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.CartAddResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartAddResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CartModify");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartModify"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartModify"), com.amazon.soap.AWSECommerceService.CartModify.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartModifyResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.CartModifyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartModifyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CartClear");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartClear"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartClear"), com.amazon.soap.AWSECommerceService.CartClear.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartClearResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.CartClearResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartClearResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TransactionLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "TransactionLookup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">TransactionLookup"), com.amazon.soap.AWSECommerceService.TransactionLookup.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">TransactionLookupResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.TransactionLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "TransactionLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SellerListingSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SellerListingSearch"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerListingSearch"), com.amazon.soap.AWSECommerceService.SellerListingSearch.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerListingSearchResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.SellerListingSearchResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SellerListingSearchResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SellerListingLookup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SellerListingLookup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerListingLookup"), com.amazon.soap.AWSECommerceService.SellerListingLookup.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerListingLookupResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.SellerListingLookupResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SellerListingLookupResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MultiOperation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "MultiOperation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">MultiOperation"), com.amazon.soap.AWSECommerceService.MultiOperation.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">MultiOperationResponse"));
        oper.setReturnClass(com.amazon.soap.AWSECommerceService.MultiOperationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "MultiOperationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

    }

    public AWSECommerceServiceBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public AWSECommerceServiceBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public AWSECommerceServiceBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>>>Transaction>Shipments>Shipment>Packages>Package");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.TransactionShipmentsShipmentPackagesPackage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>>Seller>SellerFeedbackSummary>FeedbackDateRange>SellerFeedbackRating");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerSellerFeedbackSummaryFeedbackDateRangeSellerFeedbackRating.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>>Transaction>Shipments>Shipment>Packages");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.TransactionShipmentsShipmentPackagesPackage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>>>Transaction>Shipments>Shipment>Packages>Package");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Package");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>>Transaction>Shipments>Shipment>ShipmentItems");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "TransactionItemId");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>CartModifyRequest>Items>Item>Action");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartModifyRequestItemsItemAction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>Collections>Collection>CollectionItem");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CollectionsCollectionCollectionItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>Collections>Collection>CollectionParent");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CollectionsCollectionCollectionParent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>Collections>Collection>CollectionSummary");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CollectionsCollectionCollectionSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>Item>AlternateVersions>AlternateVersion");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemAlternateVersionsAlternateVersion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>ItemAttributes>Languages>Language");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemAttributesLanguagesLanguage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>MerchantItemAttributes>Languages>Language");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.MerchantItemAttributesLanguagesLanguage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>Seller>SellerFeedbackSummary>FeedbackDateRange");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerSellerFeedbackSummaryFeedbackDateRangeSellerFeedbackRating[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>>Seller>SellerFeedbackSummary>FeedbackDateRange>SellerFeedbackRating");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SellerFeedbackRating");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>Tracks>Disc>Track");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.TracksDiscTrack.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>Transaction>Shipments>Shipment");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.TransactionShipmentsShipment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Accessories>Accessory");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.AccessoriesAccessory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Arguments>Argument");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ArgumentsArgument.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Bin>BinParameter");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.BinBinParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>BrowseNode>Ancestors");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.BrowseNode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "BrowseNode");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>BrowseNode>Children");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.BrowseNode[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "BrowseNode");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>CartAddRequest>Items>Item");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartAddRequestItemsItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>CartCreateRequest>Items>Item");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartCreateRequestItemsItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>CartModifyRequest>Items>Item");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartModifyRequestItemsItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Collections>Collection");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CollectionsCollection.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Customer>Location");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CustomerLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Errors>Error");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ErrorsError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>HTTPHeaders>Header");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.HTTPHeadersHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Item>AlternateVersions");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemAlternateVersionsAlternateVersion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>Item>AlternateVersions>AlternateVersion");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "AlternateVersion");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Item>ImageSets");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemImageSets.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Item>Subjects");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Subject");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>ItemAttributes>Creator");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemAttributesCreator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>ItemAttributes>ItemDimensions");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemAttributesItemDimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>ItemAttributes>Languages");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemAttributesLanguagesLanguage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>ItemAttributes>Languages>Language");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Language");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>ItemAttributes>PackageDimensions");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemAttributesPackageDimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>List>ListType");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ListListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>ListmaniaLists>ListmaniaList");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ListmaniaListsListmaniaList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>MerchantItemAttributes>Creator");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.MerchantItemAttributesCreator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>MerchantItemAttributes>ItemDimensions");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.MerchantItemAttributesItemDimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>MerchantItemAttributes>Languages");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.MerchantItemAttributesLanguagesLanguage[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>MerchantItemAttributes>Languages>Language");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Language");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>MerchantItemAttributes>PackageDimensions");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.MerchantItemAttributesPackageDimensions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>MerchantItemAttributes>VendorRebate");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.MerchantItemAttributesVendorRebate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>NewReleases>NewRelease");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.NewReleasesNewRelease.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>OfferListing>AvailabilityAttributes");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.OfferListingAvailabilityAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>OfferListing>ShippingCharge");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.OfferListingShippingCharge.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>OperationInformation>AvailableParameters");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Parameter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>OperationInformation>AvailableResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>OperationInformation>DefaultResponseGroups");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ResponseGroup");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>OperationInformation>RequiredParameters");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Parameter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>OtherCategoriesSimilarProducts>OtherCategoriesSimilarProduct");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.OtherCategoriesSimilarProductsOtherCategoriesSimilarProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Promotion>Details");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.PromotionDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Promotion>Summary");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.PromotionSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>ResponseGroupInformation>Elements");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Element");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>ResponseGroupInformation>ValidOperations");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Operation");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>SearchInside>Excerpt");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SearchInsideExcerpt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>SearchResultsMap>SearchIndex");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SearchResultsMapSearchIndex.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Seller>Location");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerLocation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Seller>SellerFeedbackSummary");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerSellerFeedbackSummaryFeedbackDateRangeSellerFeedbackRating[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>Seller>SellerFeedbackSummary>FeedbackDateRange");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "FeedbackDateRange");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>SellerFeedback>Feedback");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerFeedbackFeedback.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>SimilarProducts>SimilarProduct");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SimilarProductsSimilarProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>SimilarViewedProducts>SimilarViewedProduct");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SimilarViewedProductsSimilarViewedProduct.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>TopSellers>TopSeller");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.TopSellersTopSeller.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Tracks>Disc");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.TracksDiscTrack[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>Tracks>Disc>Track");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Track");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Transaction>Shipments");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.TransactionShipmentsShipment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>Transaction>Shipments>Shipment");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Shipment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Transaction>Totals");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.TransactionTotals.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Transaction>TransactionItems");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.TransactionItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "TransactionItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>TransactionItem>ChildTransactionItems");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.TransactionItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "TransactionItem");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Accessories");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.AccessoriesAccessory[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Accessories>Accessory");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Accessory");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Arguments");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ArgumentsArgument[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Arguments>Argument");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Argument");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">AudienceRating");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.AudienceRating.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Bin");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Bin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">BrowseNode");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.BrowseNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">BrowseNodeLookup");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.BrowseNodeLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">BrowseNodeLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.BrowseNodeLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">BrowseNodes");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.BrowseNodes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Cart");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Cart.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartAdd");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartAdd.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartAddRequest>Items");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartAddRequestItemsItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>CartAddRequest>Items>Item");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartAddResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartAddResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartClear");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartClear.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartClearResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartClearResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartCreate");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartCreate.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartCreateRequest>Items");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartCreateRequestItemsItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>CartCreateRequest>Items>Item");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartCreateResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartCreateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartGet");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartGet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartGetResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartGetResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartItems");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartModify");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartModify.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartModifyRequest>Items");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartModifyRequestItemsItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>CartModifyRequest>Items>Item");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CartModifyResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartModifyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Collections");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CollectionsCollection[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Collections>Collection");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Collection");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Condition");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Condition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CorrectedQuery");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CorrectedQuery.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Customer");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Customer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CustomerContentLookup");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CustomerContentLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CustomerContentLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CustomerContentLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CustomerContentSearch");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CustomerContentSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CustomerContentSearchResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CustomerContentSearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CustomerReviews");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CustomerReviews.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Customers");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Customers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">DeliveryMethod");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.DeliveryMethod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">EditorialReview");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.EditorialReview.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">EditorialReviews");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.EditorialReview[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "EditorialReview");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Errors");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ErrorsError[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Errors>Error");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Error");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Help");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Help.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">HelpRequest>HelpType");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.HelpRequestHelpType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">HelpResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.HelpResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">HTTPHeaders");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.HTTPHeadersHeader[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>HTTPHeaders>Header");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Header");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ImageSet");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ImageSet.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Information");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Information.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Item");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Item.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ItemAttributes");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ItemLookup");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ItemLookupRequest>IdType");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemLookupRequestIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ItemLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Items");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Items.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ItemSearch");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ItemSearchRequest>Availability");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemSearchRequestAvailability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ItemSearchResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemSearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">List");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.List.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ListItem");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ListItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ListLookup");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ListLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ListLookupRequest>ListType");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ListLookupRequestListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ListLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ListLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ListmaniaLists");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ListmaniaListsListmaniaList[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>ListmaniaLists>ListmaniaList");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ListmaniaList");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Lists");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Lists.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ListSearch");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ListSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ListSearchRequest>ListType");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ListSearchRequestListType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ListSearchResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ListSearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">LoyaltyPoints");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.LoyaltyPoints.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Merchant");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Merchant.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">MerchantItemAttributes");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.MerchantItemAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">MultiOperation");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.MultiOperation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">MultiOperationResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.MultiOperationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">NewReleases");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.NewReleasesNewRelease[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>NewReleases>NewRelease");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "NewRelease");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Offer");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Offer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">OfferAttributes");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.OfferAttributes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">OfferListing");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.OfferListing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Offers");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Offers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">OfferSummary");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.OfferSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">OperationInformation");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.OperationInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">OperationRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.OperationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">OtherCategoriesSimilarProducts");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.OtherCategoriesSimilarProductsOtherCategoriesSimilarProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>OtherCategoriesSimilarProducts>OtherCategoriesSimilarProduct");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "OtherCategoriesSimilarProduct");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Promotion");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Promotion.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Promotions");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Promotion[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Promotion");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Request");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ResponseGroupInformation");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ResponseGroupInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Review");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Review.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Reviewer");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Reviewer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SavedForLaterItems");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SavedForLaterItems.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SearchBinSet");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Bin[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Bin");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SearchBinSets");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Bin[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SearchBinSet");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SearchInside");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SearchInside.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SearchResultsMap");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SearchResultsMapSearchIndex[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>SearchResultsMap>SearchIndex");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SearchIndex");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Seller");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Seller.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerFeedback");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerFeedbackFeedback[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>SellerFeedback>Feedback");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Feedback");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerListing");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerListing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerListingLookup");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerListingLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerListingLookupRequest>IdType");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerListingLookupRequestIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerListingLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerListingLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerListings");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerListings.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerListingSearch");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerListingSearch.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerListingSearchRequest>OfferStatus");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerListingSearchRequestOfferStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerListingSearchResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerListingSearchResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerLookup");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SellerLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Sellers");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Sellers.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SimilarityLookup");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SimilarityLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SimilarityLookupRequest>SimilarityType");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SimilarityLookupRequestSimilarityType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SimilarityLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SimilarityLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SimilarProducts");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SimilarProductsSimilarProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>SimilarProducts>SimilarProduct");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SimilarProduct");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SimilarViewedProducts");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SimilarViewedProductsSimilarViewedProduct[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>SimilarViewedProducts>SimilarViewedProduct");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SimilarViewedProduct");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">TopSellers");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.TopSellersTopSeller[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>TopSellers>TopSeller");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "TopSeller");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Tracks");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.TracksDiscTrack[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Tracks>Disc");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Disc");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Transaction");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Transaction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">TransactionItem");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.TransactionItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">TransactionLookup");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.TransactionLookup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">TransactionLookupResponse");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.TransactionLookupResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Transactions");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Transactions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">VariationDimensions");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "VariationDimension");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Variations");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Variations.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">VariationSummary");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.VariationSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Address");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Address.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "BrowseNodeLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.BrowseNodeLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartAddRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartAddRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartClearRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartClearRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartCreateRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartCreateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartGetRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartGetRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartItem");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CartModifyRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CartModifyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CustomerContentLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CustomerContentLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CustomerContentSearchRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.CustomerContentSearchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "DecimalWithUnits");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.DecimalWithUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "HelpRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.HelpRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Image");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Image.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ItemLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ItemSearchRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ItemSearchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ListLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ListLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ListSearchRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.ListSearchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "NonNegativeIntegerWithUnits");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.NonNegativeIntegerWithUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "positiveIntegerOrAll");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.PositiveIntegerOrAll.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Price");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.Price.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PromotionBenefit");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.PromotionBenefit.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PromotionBenefits");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.PromotionBenefit[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PromotionBenefit");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Benefit");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PromotionEligibilityRequirement");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.PromotionEligibilityRequirement.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PromotionEligibilityRequirements");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.PromotionEligibilityRequirement[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PromotionEligibilityRequirement");
            qName2 = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "EligibilityRequirement");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "PromotionItemApplicability");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.PromotionItemApplicability.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SellerListingLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerListingLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SellerListingSearchRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerListingSearchRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SellerLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SellerLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SimilarityLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.SimilarityLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "StringWithUnits");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.StringWithUnits.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "TransactionLookupRequest");
            cachedSerQNames.add(qName);
            cls = com.amazon.soap.AWSECommerceService.TransactionLookupRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.amazon.soap.AWSECommerceService.HelpResponse help(com.amazon.soap.AWSECommerceService.Help body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Help"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.HelpResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.HelpResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.HelpResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.ItemSearchResponse itemSearch(com.amazon.soap.AWSECommerceService.ItemSearch body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ItemSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.ItemSearchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.ItemSearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.ItemSearchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.ItemLookupResponse itemLookup(com.amazon.soap.AWSECommerceService.ItemLookup body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ItemLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.ItemLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.ItemLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.ItemLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.BrowseNodeLookupResponse browseNodeLookup(com.amazon.soap.AWSECommerceService.BrowseNodeLookup body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "BrowseNodeLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.BrowseNodeLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.BrowseNodeLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.BrowseNodeLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.ListSearchResponse listSearch(com.amazon.soap.AWSECommerceService.ListSearch body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ListSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.ListSearchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.ListSearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.ListSearchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.ListLookupResponse listLookup(com.amazon.soap.AWSECommerceService.ListLookup body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ListLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.ListLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.ListLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.ListLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.CustomerContentSearchResponse customerContentSearch(com.amazon.soap.AWSECommerceService.CustomerContentSearch body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CustomerContentSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.CustomerContentSearchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.CustomerContentSearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.CustomerContentSearchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.CustomerContentLookupResponse customerContentLookup(com.amazon.soap.AWSECommerceService.CustomerContentLookup body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CustomerContentLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.CustomerContentLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.CustomerContentLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.CustomerContentLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.SimilarityLookupResponse similarityLookup(com.amazon.soap.AWSECommerceService.SimilarityLookup body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SimilarityLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.SimilarityLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.SimilarityLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.SimilarityLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.SellerLookupResponse sellerLookup(com.amazon.soap.AWSECommerceService.SellerLookup body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SellerLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.SellerLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.SellerLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.SellerLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.CartGetResponse cartGet(com.amazon.soap.AWSECommerceService.CartGet body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CartGet"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.CartGetResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.CartGetResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.CartGetResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.CartCreateResponse cartCreate(com.amazon.soap.AWSECommerceService.CartCreate body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CartCreate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.CartCreateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.CartCreateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.CartCreateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.CartAddResponse cartAdd(com.amazon.soap.AWSECommerceService.CartAdd body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CartAdd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.CartAddResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.CartAddResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.CartAddResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.CartModifyResponse cartModify(com.amazon.soap.AWSECommerceService.CartModify body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CartModify"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.CartModifyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.CartModifyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.CartModifyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.CartClearResponse cartClear(com.amazon.soap.AWSECommerceService.CartClear body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CartClear"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.CartClearResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.CartClearResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.CartClearResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.TransactionLookupResponse transactionLookup(com.amazon.soap.AWSECommerceService.TransactionLookup body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TransactionLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.TransactionLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.TransactionLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.TransactionLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.SellerListingSearchResponse sellerListingSearch(com.amazon.soap.AWSECommerceService.SellerListingSearch body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SellerListingSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.SellerListingSearchResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.SellerListingSearchResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.SellerListingSearchResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.SellerListingLookupResponse sellerListingLookup(com.amazon.soap.AWSECommerceService.SellerListingLookup body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SellerListingLookup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.SellerListingLookupResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.SellerListingLookupResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.SellerListingLookupResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.amazon.soap.AWSECommerceService.MultiOperationResponse multiOperation(com.amazon.soap.AWSECommerceService.MultiOperation body) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://soap.amazon.com");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MultiOperation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.amazon.soap.AWSECommerceService.MultiOperationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.amazon.soap.AWSECommerceService.MultiOperationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.amazon.soap.AWSECommerceService.MultiOperationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
