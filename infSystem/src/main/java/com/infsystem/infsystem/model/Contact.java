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
public class Contact {

    private String mobilePhone;
    private String homeTel;
    private String Fax;
    

    /**
     * @return the mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * @param mobilePhone the mobilePhone to set
     */
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    /**
     * @return the homeTel
     */
    public String getHomeTel() {
        return homeTel;
    }

    /**
     * @param homeTel the homeTel to set
     */
    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    /**
     * @return the Fax
     */
    public String getFax() {
        return Fax;
    }

    /**
     * @param Fax the Fax to set
     */
    public void setFax(String Fax) {
        this.Fax = Fax;
    }
}
