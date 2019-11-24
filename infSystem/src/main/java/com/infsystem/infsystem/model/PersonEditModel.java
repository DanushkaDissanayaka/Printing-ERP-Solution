/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infsystem.infsystem.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dxdjf
 */
public class PersonEditModel {

    public int id;
    public Date createDate;
    public int addBy;
    public Date modifyDate;
    public int INT;
    public String fName;
    public String lName;
    public Date dob;
    public String nic;
    public String companyName;
    public String title;
    public int type;
    public int status;
    public String email;
    public List<Address> address;
    public List<ContactEditModel> contact;
    
    public PersonEditModel(){
        this.contact = new ArrayList() ;
    }
}
