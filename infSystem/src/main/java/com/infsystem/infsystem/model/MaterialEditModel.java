/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infsystem.infsystem.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dxdjf
 */
public class MaterialEditModel {

    public int id;
    public String name;
    public int categoryId;
    public int availableQty;
    public int pendingQty;
    public String brand;
    public List< MaterialSuplier> materialSuplier;

    public MaterialEditModel() {
        this.materialSuplier = new ArrayList();
    }

}
