/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infsystem.infsystem.model;

import java.util.List;

/**
 *
 * @author dxdjf
 */
public class Client {

    private String clientId;
    private String companyName;
    private String FirstName;
    private String LastName;
    private String JobTitle;
    private String Email;
    private String website;
    private List<Address> address;
    private List<Contact> contact;
    private String shippingAddress;

    /**
     * @return the clientId
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * @param clientId the clientId to set
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * @return the companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * @param companyName the companyName to set
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the JobTitle
     */
    public String getJobTitle() {
        return JobTitle;
    }

    /**
     * @param JobTitle the JobTitle to set
     */
    public void setJobTitle(String JobTitle) {
        this.JobTitle = JobTitle;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the website
     */
    public String getWebsite() {
        return website;
    }

    /**
     * @param website the website to set
     */
    public void setWebsite(String website) {
        this.website = website;
    }

    /**
     * @return the address
     */
    public List<Address> getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(List<Address> address) {
        this.address = address;
    }

    /**
     * @return the contact
     */
    public List<Contact> getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(List<Contact> contact) {
        this.contact = contact;
    }

    /**
     * @return the shippingAddress
     */
    public String getShippingAddress() {
        return this.shippingAddress;//this.address.get(0).getFullAddress();
    }

    /**
     * @param shippingAddress the shippingAddress to set
     */
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

}
