/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infsystem.infsystem.model;

/**
 *
 * @author dxdjf
 */
public class Product {

    private final Book book;
    private int trigerLimit;
    private int billingPrice;
    private int endUserPrice;
    private int cosPerUnit;
    private final String ProductType;
    private String productiId;
    private final String ProductName;

    Product(Book book) {
        this.book = book;
        this.productiId = book.getBookCode();
        this.ProductType = book.getBookType();
        this.ProductName = book.getBookName();
    }

    /**
     * @return the book
     */
    public Book getBook() {
        return book;
    }

    /**
     * @return the trigerLimit
     */
    public int getTrigerLimit() {
        return trigerLimit;
    }

    /**
     * @param trigerLimit the trigerLimit to set
     */
    public void setTrigerLimit(int trigerLimit) {
        this.trigerLimit = trigerLimit;
    }

    /**
     * @return the billingPrice
     */
    public int getBillingPrice() {
        return billingPrice;
    }

    /**
     * @param billingPrice the billingPrice to set
     */
    public void setBillingPrice(int billingPrice) {
        this.billingPrice = billingPrice;
    }

    /**
     * @return the endUserPrice
     */
    public int getEndUserPrice() {
        return endUserPrice;
    }

    /**
     * @param endUserPrice the endUserPrice to set
     */
    public void setEndUserPrice(int endUserPrice) {
        this.endUserPrice = endUserPrice;
    }

    /**
     * @return the cosPerUnit
     */
    public int getCosPerUnit() {
        return cosPerUnit;
    }

    /**
     * @param cosPerUnit the cosPerUnit to set
     */
    public void setCosPerUnit(int cosPerUnit) {
        this.cosPerUnit = cosPerUnit;
    }

    /**
     * @return the productiId
     */
    public String getProductiId() {
        return productiId;
    }

    /**
     * @param productiId the productiId to set
     */
    private void setProductiId(String productiId) {
        this.productiId = productiId;
    }

    /**
     * @return the ProductType
     */
    public String getProductType() {
        return ProductType;
    }

    /**
     * @return the ProductName
     */
    public String getProductName() {
        return ProductName;
    }
}
