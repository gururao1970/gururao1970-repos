/**
 * Item.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.amazon.soap.AWSECommerceService;

public class Item  implements java.io.Serializable {
    private java.lang.String ASIN;

    private java.lang.String parentASIN;

    private com.amazon.soap.AWSECommerceService.ErrorsError[] errors;

    private java.lang.String detailPageURL;

    private java.lang.String salesRank;

    private com.amazon.soap.AWSECommerceService.Image smallImage;

    private com.amazon.soap.AWSECommerceService.Image mediumImage;

    private com.amazon.soap.AWSECommerceService.Image largeImage;

    private com.amazon.soap.AWSECommerceService.ItemImageSets[] imageSets;

    private com.amazon.soap.AWSECommerceService.ItemAttributes itemAttributes;

    private com.amazon.soap.AWSECommerceService.MerchantItemAttributes merchantItemAttributes;

    private com.amazon.soap.AWSECommerceService.CollectionsCollection[] collections;

    private java.lang.String[] subjects;

    private com.amazon.soap.AWSECommerceService.OfferSummary offerSummary;

    private com.amazon.soap.AWSECommerceService.Offers offers;

    private com.amazon.soap.AWSECommerceService.VariationSummary variationSummary;

    private com.amazon.soap.AWSECommerceService.Variations variations;

    private com.amazon.soap.AWSECommerceService.CustomerReviews customerReviews;

    private com.amazon.soap.AWSECommerceService.EditorialReview[] editorialReviews;

    private com.amazon.soap.AWSECommerceService.SimilarProductsSimilarProduct[] similarProducts;

    private com.amazon.soap.AWSECommerceService.AccessoriesAccessory[] accessories;

    private com.amazon.soap.AWSECommerceService.TracksDiscTrack[][] tracks;

    private com.amazon.soap.AWSECommerceService.BrowseNodes browseNodes;

    private com.amazon.soap.AWSECommerceService.ListmaniaListsListmaniaList[] listmaniaLists;

    private com.amazon.soap.AWSECommerceService.SearchInside searchInside;

    private com.amazon.soap.AWSECommerceService.ItemAlternateVersionsAlternateVersion[] alternateVersions;

    public Item() {
    }

    public Item(
           java.lang.String ASIN,
           java.lang.String parentASIN,
           com.amazon.soap.AWSECommerceService.ErrorsError[] errors,
           java.lang.String detailPageURL,
           java.lang.String salesRank,
           com.amazon.soap.AWSECommerceService.Image smallImage,
           com.amazon.soap.AWSECommerceService.Image mediumImage,
           com.amazon.soap.AWSECommerceService.Image largeImage,
           com.amazon.soap.AWSECommerceService.ItemImageSets[] imageSets,
           com.amazon.soap.AWSECommerceService.ItemAttributes itemAttributes,
           com.amazon.soap.AWSECommerceService.MerchantItemAttributes merchantItemAttributes,
           com.amazon.soap.AWSECommerceService.CollectionsCollection[] collections,
           java.lang.String[] subjects,
           com.amazon.soap.AWSECommerceService.OfferSummary offerSummary,
           com.amazon.soap.AWSECommerceService.Offers offers,
           com.amazon.soap.AWSECommerceService.VariationSummary variationSummary,
           com.amazon.soap.AWSECommerceService.Variations variations,
           com.amazon.soap.AWSECommerceService.CustomerReviews customerReviews,
           com.amazon.soap.AWSECommerceService.EditorialReview[] editorialReviews,
           com.amazon.soap.AWSECommerceService.SimilarProductsSimilarProduct[] similarProducts,
           com.amazon.soap.AWSECommerceService.AccessoriesAccessory[] accessories,
           com.amazon.soap.AWSECommerceService.TracksDiscTrack[][] tracks,
           com.amazon.soap.AWSECommerceService.BrowseNodes browseNodes,
           com.amazon.soap.AWSECommerceService.ListmaniaListsListmaniaList[] listmaniaLists,
           com.amazon.soap.AWSECommerceService.SearchInside searchInside,
           com.amazon.soap.AWSECommerceService.ItemAlternateVersionsAlternateVersion[] alternateVersions) {
           this.ASIN = ASIN;
           this.parentASIN = parentASIN;
           this.errors = errors;
           this.detailPageURL = detailPageURL;
           this.salesRank = salesRank;
           this.smallImage = smallImage;
           this.mediumImage = mediumImage;
           this.largeImage = largeImage;
           this.imageSets = imageSets;
           this.itemAttributes = itemAttributes;
           this.merchantItemAttributes = merchantItemAttributes;
           this.collections = collections;
           this.subjects = subjects;
           this.offerSummary = offerSummary;
           this.offers = offers;
           this.variationSummary = variationSummary;
           this.variations = variations;
           this.customerReviews = customerReviews;
           this.editorialReviews = editorialReviews;
           this.similarProducts = similarProducts;
           this.accessories = accessories;
           this.tracks = tracks;
           this.browseNodes = browseNodes;
           this.listmaniaLists = listmaniaLists;
           this.searchInside = searchInside;
           this.alternateVersions = alternateVersions;
    }


    /**
     * Gets the ASIN value for this Item.
     * 
     * @return ASIN
     */
    public java.lang.String getASIN() {
        return ASIN;
    }


    /**
     * Sets the ASIN value for this Item.
     * 
     * @param ASIN
     */
    public void setASIN(java.lang.String ASIN) {
        this.ASIN = ASIN;
    }


    /**
     * Gets the parentASIN value for this Item.
     * 
     * @return parentASIN
     */
    public java.lang.String getParentASIN() {
        return parentASIN;
    }


    /**
     * Sets the parentASIN value for this Item.
     * 
     * @param parentASIN
     */
    public void setParentASIN(java.lang.String parentASIN) {
        this.parentASIN = parentASIN;
    }


    /**
     * Gets the errors value for this Item.
     * 
     * @return errors
     */
    public com.amazon.soap.AWSECommerceService.ErrorsError[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this Item.
     * 
     * @param errors
     */
    public void setErrors(com.amazon.soap.AWSECommerceService.ErrorsError[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the detailPageURL value for this Item.
     * 
     * @return detailPageURL
     */
    public java.lang.String getDetailPageURL() {
        return detailPageURL;
    }


    /**
     * Sets the detailPageURL value for this Item.
     * 
     * @param detailPageURL
     */
    public void setDetailPageURL(java.lang.String detailPageURL) {
        this.detailPageURL = detailPageURL;
    }


    /**
     * Gets the salesRank value for this Item.
     * 
     * @return salesRank
     */
    public java.lang.String getSalesRank() {
        return salesRank;
    }


    /**
     * Sets the salesRank value for this Item.
     * 
     * @param salesRank
     */
    public void setSalesRank(java.lang.String salesRank) {
        this.salesRank = salesRank;
    }


    /**
     * Gets the smallImage value for this Item.
     * 
     * @return smallImage
     */
    public com.amazon.soap.AWSECommerceService.Image getSmallImage() {
        return smallImage;
    }


    /**
     * Sets the smallImage value for this Item.
     * 
     * @param smallImage
     */
    public void setSmallImage(com.amazon.soap.AWSECommerceService.Image smallImage) {
        this.smallImage = smallImage;
    }


    /**
     * Gets the mediumImage value for this Item.
     * 
     * @return mediumImage
     */
    public com.amazon.soap.AWSECommerceService.Image getMediumImage() {
        return mediumImage;
    }


    /**
     * Sets the mediumImage value for this Item.
     * 
     * @param mediumImage
     */
    public void setMediumImage(com.amazon.soap.AWSECommerceService.Image mediumImage) {
        this.mediumImage = mediumImage;
    }


    /**
     * Gets the largeImage value for this Item.
     * 
     * @return largeImage
     */
    public com.amazon.soap.AWSECommerceService.Image getLargeImage() {
        return largeImage;
    }


    /**
     * Sets the largeImage value for this Item.
     * 
     * @param largeImage
     */
    public void setLargeImage(com.amazon.soap.AWSECommerceService.Image largeImage) {
        this.largeImage = largeImage;
    }


    /**
     * Gets the imageSets value for this Item.
     * 
     * @return imageSets
     */
    public com.amazon.soap.AWSECommerceService.ItemImageSets[] getImageSets() {
        return imageSets;
    }


    /**
     * Sets the imageSets value for this Item.
     * 
     * @param imageSets
     */
    public void setImageSets(com.amazon.soap.AWSECommerceService.ItemImageSets[] imageSets) {
        this.imageSets = imageSets;
    }

    public com.amazon.soap.AWSECommerceService.ItemImageSets getImageSets(int i) {
        return this.imageSets[i];
    }

    public void setImageSets(int i, com.amazon.soap.AWSECommerceService.ItemImageSets _value) {
        this.imageSets[i] = _value;
    }


    /**
     * Gets the itemAttributes value for this Item.
     * 
     * @return itemAttributes
     */
    public com.amazon.soap.AWSECommerceService.ItemAttributes getItemAttributes() {
        return itemAttributes;
    }


    /**
     * Sets the itemAttributes value for this Item.
     * 
     * @param itemAttributes
     */
    public void setItemAttributes(com.amazon.soap.AWSECommerceService.ItemAttributes itemAttributes) {
        this.itemAttributes = itemAttributes;
    }


    /**
     * Gets the merchantItemAttributes value for this Item.
     * 
     * @return merchantItemAttributes
     */
    public com.amazon.soap.AWSECommerceService.MerchantItemAttributes getMerchantItemAttributes() {
        return merchantItemAttributes;
    }


    /**
     * Sets the merchantItemAttributes value for this Item.
     * 
     * @param merchantItemAttributes
     */
    public void setMerchantItemAttributes(com.amazon.soap.AWSECommerceService.MerchantItemAttributes merchantItemAttributes) {
        this.merchantItemAttributes = merchantItemAttributes;
    }


    /**
     * Gets the collections value for this Item.
     * 
     * @return collections
     */
    public com.amazon.soap.AWSECommerceService.CollectionsCollection[] getCollections() {
        return collections;
    }


    /**
     * Sets the collections value for this Item.
     * 
     * @param collections
     */
    public void setCollections(com.amazon.soap.AWSECommerceService.CollectionsCollection[] collections) {
        this.collections = collections;
    }


    /**
     * Gets the subjects value for this Item.
     * 
     * @return subjects
     */
    public java.lang.String[] getSubjects() {
        return subjects;
    }


    /**
     * Sets the subjects value for this Item.
     * 
     * @param subjects
     */
    public void setSubjects(java.lang.String[] subjects) {
        this.subjects = subjects;
    }


    /**
     * Gets the offerSummary value for this Item.
     * 
     * @return offerSummary
     */
    public com.amazon.soap.AWSECommerceService.OfferSummary getOfferSummary() {
        return offerSummary;
    }


    /**
     * Sets the offerSummary value for this Item.
     * 
     * @param offerSummary
     */
    public void setOfferSummary(com.amazon.soap.AWSECommerceService.OfferSummary offerSummary) {
        this.offerSummary = offerSummary;
    }


    /**
     * Gets the offers value for this Item.
     * 
     * @return offers
     */
    public com.amazon.soap.AWSECommerceService.Offers getOffers() {
        return offers;
    }


    /**
     * Sets the offers value for this Item.
     * 
     * @param offers
     */
    public void setOffers(com.amazon.soap.AWSECommerceService.Offers offers) {
        this.offers = offers;
    }


    /**
     * Gets the variationSummary value for this Item.
     * 
     * @return variationSummary
     */
    public com.amazon.soap.AWSECommerceService.VariationSummary getVariationSummary() {
        return variationSummary;
    }


    /**
     * Sets the variationSummary value for this Item.
     * 
     * @param variationSummary
     */
    public void setVariationSummary(com.amazon.soap.AWSECommerceService.VariationSummary variationSummary) {
        this.variationSummary = variationSummary;
    }


    /**
     * Gets the variations value for this Item.
     * 
     * @return variations
     */
    public com.amazon.soap.AWSECommerceService.Variations getVariations() {
        return variations;
    }


    /**
     * Sets the variations value for this Item.
     * 
     * @param variations
     */
    public void setVariations(com.amazon.soap.AWSECommerceService.Variations variations) {
        this.variations = variations;
    }


    /**
     * Gets the customerReviews value for this Item.
     * 
     * @return customerReviews
     */
    public com.amazon.soap.AWSECommerceService.CustomerReviews getCustomerReviews() {
        return customerReviews;
    }


    /**
     * Sets the customerReviews value for this Item.
     * 
     * @param customerReviews
     */
    public void setCustomerReviews(com.amazon.soap.AWSECommerceService.CustomerReviews customerReviews) {
        this.customerReviews = customerReviews;
    }


    /**
     * Gets the editorialReviews value for this Item.
     * 
     * @return editorialReviews
     */
    public com.amazon.soap.AWSECommerceService.EditorialReview[] getEditorialReviews() {
        return editorialReviews;
    }


    /**
     * Sets the editorialReviews value for this Item.
     * 
     * @param editorialReviews
     */
    public void setEditorialReviews(com.amazon.soap.AWSECommerceService.EditorialReview[] editorialReviews) {
        this.editorialReviews = editorialReviews;
    }


    /**
     * Gets the similarProducts value for this Item.
     * 
     * @return similarProducts
     */
    public com.amazon.soap.AWSECommerceService.SimilarProductsSimilarProduct[] getSimilarProducts() {
        return similarProducts;
    }


    /**
     * Sets the similarProducts value for this Item.
     * 
     * @param similarProducts
     */
    public void setSimilarProducts(com.amazon.soap.AWSECommerceService.SimilarProductsSimilarProduct[] similarProducts) {
        this.similarProducts = similarProducts;
    }


    /**
     * Gets the accessories value for this Item.
     * 
     * @return accessories
     */
    public com.amazon.soap.AWSECommerceService.AccessoriesAccessory[] getAccessories() {
        return accessories;
    }


    /**
     * Sets the accessories value for this Item.
     * 
     * @param accessories
     */
    public void setAccessories(com.amazon.soap.AWSECommerceService.AccessoriesAccessory[] accessories) {
        this.accessories = accessories;
    }


    /**
     * Gets the tracks value for this Item.
     * 
     * @return tracks
     */
    public com.amazon.soap.AWSECommerceService.TracksDiscTrack[][] getTracks() {
        return tracks;
    }


    /**
     * Sets the tracks value for this Item.
     * 
     * @param tracks
     */
    public void setTracks(com.amazon.soap.AWSECommerceService.TracksDiscTrack[][] tracks) {
        this.tracks = tracks;
    }


    /**
     * Gets the browseNodes value for this Item.
     * 
     * @return browseNodes
     */
    public com.amazon.soap.AWSECommerceService.BrowseNodes getBrowseNodes() {
        return browseNodes;
    }


    /**
     * Sets the browseNodes value for this Item.
     * 
     * @param browseNodes
     */
    public void setBrowseNodes(com.amazon.soap.AWSECommerceService.BrowseNodes browseNodes) {
        this.browseNodes = browseNodes;
    }


    /**
     * Gets the listmaniaLists value for this Item.
     * 
     * @return listmaniaLists
     */
    public com.amazon.soap.AWSECommerceService.ListmaniaListsListmaniaList[] getListmaniaLists() {
        return listmaniaLists;
    }


    /**
     * Sets the listmaniaLists value for this Item.
     * 
     * @param listmaniaLists
     */
    public void setListmaniaLists(com.amazon.soap.AWSECommerceService.ListmaniaListsListmaniaList[] listmaniaLists) {
        this.listmaniaLists = listmaniaLists;
    }


    /**
     * Gets the searchInside value for this Item.
     * 
     * @return searchInside
     */
    public com.amazon.soap.AWSECommerceService.SearchInside getSearchInside() {
        return searchInside;
    }


    /**
     * Sets the searchInside value for this Item.
     * 
     * @param searchInside
     */
    public void setSearchInside(com.amazon.soap.AWSECommerceService.SearchInside searchInside) {
        this.searchInside = searchInside;
    }


    /**
     * Gets the alternateVersions value for this Item.
     * 
     * @return alternateVersions
     */
    public com.amazon.soap.AWSECommerceService.ItemAlternateVersionsAlternateVersion[] getAlternateVersions() {
        return alternateVersions;
    }


    /**
     * Sets the alternateVersions value for this Item.
     * 
     * @param alternateVersions
     */
    public void setAlternateVersions(com.amazon.soap.AWSECommerceService.ItemAlternateVersionsAlternateVersion[] alternateVersions) {
        this.alternateVersions = alternateVersions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Item)) return false;
        Item other = (Item) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ASIN==null && other.getASIN()==null) || 
             (this.ASIN!=null &&
              this.ASIN.equals(other.getASIN()))) &&
            ((this.parentASIN==null && other.getParentASIN()==null) || 
             (this.parentASIN!=null &&
              this.parentASIN.equals(other.getParentASIN()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.detailPageURL==null && other.getDetailPageURL()==null) || 
             (this.detailPageURL!=null &&
              this.detailPageURL.equals(other.getDetailPageURL()))) &&
            ((this.salesRank==null && other.getSalesRank()==null) || 
             (this.salesRank!=null &&
              this.salesRank.equals(other.getSalesRank()))) &&
            ((this.smallImage==null && other.getSmallImage()==null) || 
             (this.smallImage!=null &&
              this.smallImage.equals(other.getSmallImage()))) &&
            ((this.mediumImage==null && other.getMediumImage()==null) || 
             (this.mediumImage!=null &&
              this.mediumImage.equals(other.getMediumImage()))) &&
            ((this.largeImage==null && other.getLargeImage()==null) || 
             (this.largeImage!=null &&
              this.largeImage.equals(other.getLargeImage()))) &&
            ((this.imageSets==null && other.getImageSets()==null) || 
             (this.imageSets!=null &&
              java.util.Arrays.equals(this.imageSets, other.getImageSets()))) &&
            ((this.itemAttributes==null && other.getItemAttributes()==null) || 
             (this.itemAttributes!=null &&
              this.itemAttributes.equals(other.getItemAttributes()))) &&
            ((this.merchantItemAttributes==null && other.getMerchantItemAttributes()==null) || 
             (this.merchantItemAttributes!=null &&
              this.merchantItemAttributes.equals(other.getMerchantItemAttributes()))) &&
            ((this.collections==null && other.getCollections()==null) || 
             (this.collections!=null &&
              java.util.Arrays.equals(this.collections, other.getCollections()))) &&
            ((this.subjects==null && other.getSubjects()==null) || 
             (this.subjects!=null &&
              java.util.Arrays.equals(this.subjects, other.getSubjects()))) &&
            ((this.offerSummary==null && other.getOfferSummary()==null) || 
             (this.offerSummary!=null &&
              this.offerSummary.equals(other.getOfferSummary()))) &&
            ((this.offers==null && other.getOffers()==null) || 
             (this.offers!=null &&
              this.offers.equals(other.getOffers()))) &&
            ((this.variationSummary==null && other.getVariationSummary()==null) || 
             (this.variationSummary!=null &&
              this.variationSummary.equals(other.getVariationSummary()))) &&
            ((this.variations==null && other.getVariations()==null) || 
             (this.variations!=null &&
              this.variations.equals(other.getVariations()))) &&
            ((this.customerReviews==null && other.getCustomerReviews()==null) || 
             (this.customerReviews!=null &&
              this.customerReviews.equals(other.getCustomerReviews()))) &&
            ((this.editorialReviews==null && other.getEditorialReviews()==null) || 
             (this.editorialReviews!=null &&
              java.util.Arrays.equals(this.editorialReviews, other.getEditorialReviews()))) &&
            ((this.similarProducts==null && other.getSimilarProducts()==null) || 
             (this.similarProducts!=null &&
              java.util.Arrays.equals(this.similarProducts, other.getSimilarProducts()))) &&
            ((this.accessories==null && other.getAccessories()==null) || 
             (this.accessories!=null &&
              java.util.Arrays.equals(this.accessories, other.getAccessories()))) &&
            ((this.tracks==null && other.getTracks()==null) || 
             (this.tracks!=null &&
              java.util.Arrays.equals(this.tracks, other.getTracks()))) &&
            ((this.browseNodes==null && other.getBrowseNodes()==null) || 
             (this.browseNodes!=null &&
              this.browseNodes.equals(other.getBrowseNodes()))) &&
            ((this.listmaniaLists==null && other.getListmaniaLists()==null) || 
             (this.listmaniaLists!=null &&
              java.util.Arrays.equals(this.listmaniaLists, other.getListmaniaLists()))) &&
            ((this.searchInside==null && other.getSearchInside()==null) || 
             (this.searchInside!=null &&
              this.searchInside.equals(other.getSearchInside()))) &&
            ((this.alternateVersions==null && other.getAlternateVersions()==null) || 
             (this.alternateVersions!=null &&
              java.util.Arrays.equals(this.alternateVersions, other.getAlternateVersions())));
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
        if (getASIN() != null) {
            _hashCode += getASIN().hashCode();
        }
        if (getParentASIN() != null) {
            _hashCode += getParentASIN().hashCode();
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDetailPageURL() != null) {
            _hashCode += getDetailPageURL().hashCode();
        }
        if (getSalesRank() != null) {
            _hashCode += getSalesRank().hashCode();
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
        if (getImageSets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageSets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImageSets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemAttributes() != null) {
            _hashCode += getItemAttributes().hashCode();
        }
        if (getMerchantItemAttributes() != null) {
            _hashCode += getMerchantItemAttributes().hashCode();
        }
        if (getCollections() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCollections());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCollections(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubjects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubjects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubjects(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOfferSummary() != null) {
            _hashCode += getOfferSummary().hashCode();
        }
        if (getOffers() != null) {
            _hashCode += getOffers().hashCode();
        }
        if (getVariationSummary() != null) {
            _hashCode += getVariationSummary().hashCode();
        }
        if (getVariations() != null) {
            _hashCode += getVariations().hashCode();
        }
        if (getCustomerReviews() != null) {
            _hashCode += getCustomerReviews().hashCode();
        }
        if (getEditorialReviews() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEditorialReviews());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEditorialReviews(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSimilarProducts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSimilarProducts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSimilarProducts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccessories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccessories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTracks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTracks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTracks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBrowseNodes() != null) {
            _hashCode += getBrowseNodes().hashCode();
        }
        if (getListmaniaLists() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListmaniaLists());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListmaniaLists(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSearchInside() != null) {
            _hashCode += getSearchInside().hashCode();
        }
        if (getAlternateVersions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlternateVersions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlternateVersions(), i);
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
        new org.apache.axis.description.TypeDesc(Item.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Item"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ASIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ASIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentASIN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ParentASIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Errors"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailPageURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "DetailPageURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRank");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SalesRank"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageSets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ImageSets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>Item>ImageSets"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ItemAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ItemAttributes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantItemAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "MerchantItemAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">MerchantItemAttributes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collections");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Collections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Collections"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subjects");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Subjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Subject"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "OfferSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">OfferSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Offers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Offers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variationSummary");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "VariationSummary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">VariationSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Variations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Variations"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerReviews");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "CustomerReviews"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">CustomerReviews"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editorialReviews");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "EditorialReviews"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">EditorialReviews"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("similarProducts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SimilarProducts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SimilarProducts"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessories");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Accessories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Accessories"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tracks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "Tracks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">Tracks"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("browseNodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "BrowseNodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">BrowseNodes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listmaniaLists");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "ListmaniaLists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">ListmaniaLists"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchInside");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "SearchInside"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">SearchInside"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateVersions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "AlternateVersions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", ">>>Item>AlternateVersions>AlternateVersion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://webservices.amazon.com/AWSECommerceService/2007-02-22", "AlternateVersion"));
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
