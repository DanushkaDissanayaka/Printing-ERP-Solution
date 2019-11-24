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
public class MaterialSuplier {
    public int suplierId;
    public String suplierName;
    public int materialId;
    public float price;
    
    /**
     * @return the suplierName
     */
    public String getSuplierName() {
        return suplierName;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }
}
