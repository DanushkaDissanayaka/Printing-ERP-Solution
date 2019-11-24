/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infsystem.infsystem.service;

import com.infsystem.infsystem.model.MaterialEditModel;
import com.infsystem.infsystem.model.NameIdModel;
import java.util.List;

/**
 *
 * @author dxdjf
 */
public interface IMaterialService {
    /**
     * Get material category
     * @return name id model
     */
    public List<NameIdModel> getMaterialCategory();
    /**
     * 
     * @return 
     */
    public List<NameIdModel> getMaterialSuplier();
    /**
     * 
     * @param model
     * @return 
     */
    public String save(MaterialEditModel model);
}
