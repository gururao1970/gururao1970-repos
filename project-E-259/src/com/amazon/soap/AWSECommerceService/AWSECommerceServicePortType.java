/**
 * AWSECommerceServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public interface AWSECommerceServicePortType extends java.rmi.Remote {
    public com.amazon.soap.AWSECommerceService.HelpResponse help(com.amazon.soap.AWSECommerceService.Help body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.ItemSearchResponse itemSearch(com.amazon.soap.AWSECommerceService.ItemSearch body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.ItemLookupResponse itemLookup(com.amazon.soap.AWSECommerceService.ItemLookup body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.BrowseNodeLookupResponse browseNodeLookup(com.amazon.soap.AWSECommerceService.BrowseNodeLookup body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.ListSearchResponse listSearch(com.amazon.soap.AWSECommerceService.ListSearch body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.ListLookupResponse listLookup(com.amazon.soap.AWSECommerceService.ListLookup body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.CustomerContentSearchResponse customerContentSearch(com.amazon.soap.AWSECommerceService.CustomerContentSearch body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.CustomerContentLookupResponse customerContentLookup(com.amazon.soap.AWSECommerceService.CustomerContentLookup body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.SimilarityLookupResponse similarityLookup(com.amazon.soap.AWSECommerceService.SimilarityLookup body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.SellerLookupResponse sellerLookup(com.amazon.soap.AWSECommerceService.SellerLookup body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.CartGetResponse cartGet(com.amazon.soap.AWSECommerceService.CartGet body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.CartAddResponse cartAdd(com.amazon.soap.AWSECommerceService.CartAdd body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.CartCreateResponse cartCreate(com.amazon.soap.AWSECommerceService.CartCreate body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.CartModifyResponse cartModify(com.amazon.soap.AWSECommerceService.CartModify body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.CartClearResponse cartClear(com.amazon.soap.AWSECommerceService.CartClear body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.TransactionLookupResponse transactionLookup(com.amazon.soap.AWSECommerceService.TransactionLookup body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.SellerListingSearchResponse sellerListingSearch(com.amazon.soap.AWSECommerceService.SellerListingSearch body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.SellerListingLookupResponse sellerListingLookup(com.amazon.soap.AWSECommerceService.SellerListingLookup body) throws java.rmi.RemoteException;
    public com.amazon.soap.AWSECommerceService.MultiOperationResponse multiOperation(com.amazon.soap.AWSECommerceService.MultiOperation body) throws java.rmi.RemoteException;
}
