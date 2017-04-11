package com.interswitch.billers.dto;


public class Biller {

    private String categoryid;
    public String getCategoryid() {
        return categoryid;
    }
    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }
    public String getCategoryname() {
        return categoryname;
    }
    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
    public String getCategorydescription() {
        return categorydescription;
    }
    public void setCategorydescription(String categorydescription) {
        this.categorydescription = categorydescription;
    }
    public String getBillerid() {
        return billerid;
    }
    public void setBillerid(String billerid) {
        this.billerid = billerid;
    }
    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
    public String getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    public String getSurcharge() {
        return surcharge;
    }
    public void setSurcharge(String surcharge) {
        this.surcharge = surcharge;
    }
    private String categoryname;
    private String categorydescription;
    private String billerid;
    private String shortName;
    private String currencyCode;
    private String surcharge;
    private String billername;
    public String getBillername() {
        return billername;
    }
    public void setBillername(String billername) {
        this.billername = billername;
    }
    
    
}


