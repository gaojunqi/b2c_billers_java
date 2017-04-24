package com.interswitch.techquest.billers.dto;

public class TransactionInquiryResponse {

    private String TransactionRef;

    public String getTransactionRef() {
        return TransactionRef;
    }

    public void setTransactionRef(String transactionRef) {
        TransactionRef = transactionRef;
    }

    public String getBiller() {
        return Biller;
    }

    public void setBiller(String biller) {
        Biller = biller;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getPaymentItem() {
        return PaymentItem;
    }

    public void setPaymentItem(String paymentItem) {
        PaymentItem = paymentItem;
    }

    public String getNarration() {
        return Narration;
    }

    public void setNarration(String narration) {
        Narration = narration;
    }

    public String getAmount() {
        return Amount;
    }

    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getIsAmountFixed() {
        return IsAmountFixed;
    }

    public void setIsAmountFixed(String isAmountFixed) {
        IsAmountFixed = isAmountFixed;
    }

    public String getCollectionsAccountNumber() {
        return CollectionsAccountNumber;
    }

    public void setCollectionsAccountNumber(String collectionsAccountNumber) {
        CollectionsAccountNumber = collectionsAccountNumber;
    }

    public String getCollectionsAccountType() {
        return CollectionsAccountType;
    }

    public void setCollectionsAccountType(String collectionsAccountType) {
        CollectionsAccountType = collectionsAccountType;
    }

    public String getSurcharge() {
        return Surcharge;
    }

    public void setSurcharge(String surcharge) {
        Surcharge = surcharge;
    }

    public String getResponseCode() {
        return ResponseCode;
    }

    public void setResponseCode(String responseCode) {
        ResponseCode = responseCode;
    }

    public String getShortTransactionRef() {
        return ShortTransactionRef;
    }

    public void setShortTransactionRef(String shortTransactionRef) {
        ShortTransactionRef = shortTransactionRef;
    }

    private String Biller;
    private String CustomerId;
    private String CustomerName;
    private String PaymentItem;
    private String Narration;
    private String Amount;
    private String IsAmountFixed;
    private String CollectionsAccountNumber;
    private String CollectionsAccountType;
    private String Surcharge;
    private String ResponseCode;
    private String ShortTransactionRef;
}
