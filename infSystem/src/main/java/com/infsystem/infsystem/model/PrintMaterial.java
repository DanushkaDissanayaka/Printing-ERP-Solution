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
public class PrintMaterial {

    private Integer quentity;
    private String itemCode;
    private String itemName;

    public PrintMaterial(int quentity, String itemCode, String itemName) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.quentity = quentity;
    }

    /**
     * @return the quantity
     */
    public int getQuentity() {
        return quentity;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

}
