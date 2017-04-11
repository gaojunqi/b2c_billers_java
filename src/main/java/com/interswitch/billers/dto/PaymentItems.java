package com.interswitch.billers.dto;


public class PaymentItems {
    
    private String categoryid;
    public String getCategoryid() {
        return categoryid;
    }
    public void setCategoryid(String categoryid) {
        this.categoryid = categoryid;
    }
    public String getBillerid() {
        return billerid;
    }
    public void setBillerid(String billerid) {
        this.billerid = billerid;
    }
    public String getIsAmountFixed() {
        return isAmountFixed;
    }
    public void setIsAmountFixed(String isAmountFixed) {
        this.isAmountFixed = isAmountFixed;
    }
    public String getPaymentitemid() {
        return paymentitemid;
    }
    public void setPaymentitemid(String paymentitemid) {
        this.paymentitemid = paymentitemid;
    }
    public String getPaymentitemname() {
        return paymentitemname;
    }
    public void setPaymentitemname(String paymentitemname) {
        this.paymentitemname = paymentitemname;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    public String getCurrencySymbol() {
        return currencySymbol;
    }
    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }
    public String getItemCurrencySymbol() {
        return itemCurrencySymbol;
    }
    public void setItemCurrencySymbol(String itemCurrencySymbol) {
        this.itemCurrencySymbol = itemCurrencySymbol;
    }
    public String getSortOrder() {
        return sortOrder;
    }
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }
    public String getPictureId() {
        return pictureId;
    }
    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }
    public String getPaymentCode() {
        return paymentCode;
    }
    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }
    public String getItemFee() {
        return itemFee;
    }
    public void setItemFee(String itemFee) {
        this.itemFee = itemFee;
    }
    private String billerid;
    private String isAmountFixed;
    private String paymentitemid;
    private String paymentitemname;
    private String amount;
    private String code;
    private String currencyCode;
    private String currencySymbol;
    private String itemCurrencySymbol;
    private String sortOrder;
    private String pictureId;
    private String paymentCode;
    private String itemFee;
}
