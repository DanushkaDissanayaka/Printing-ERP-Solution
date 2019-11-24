/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infsystem.infsystem.service;

import com.infsystem.infsystem.model.NameIdModel;
import com.infsystem.infsystem.model.PersonEditModel;
import java.util.List;

/**
 *
 * @author dxdjf
 */
public interface IUserService {

    /**
     * CUSTOMER,CLIENT etc.
     *
     * @return user type id and name
     */
    public List<NameIdModel> getUserType();

    /**
     * SHIPPING, OTHER etc.
     *
     * @return user address type id and name
     */
    public List<NameIdModel> getAddressType();

    /**
     * ACTIVE,DELETE,SUSPENDED etc.
     *
     * @return user status and id
     */
    public List<NameIdModel> getUserStatus();
    
    public String createPerson(PersonEditModel model);
    /**
     * Create Person
     */
}
