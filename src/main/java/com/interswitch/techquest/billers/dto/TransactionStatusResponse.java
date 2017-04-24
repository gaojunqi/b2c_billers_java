package com.interswitch.techquest.billers.dto;

public class TransactionStatusResponse {
    
    private Recharge recharge;
    private StatusError[] errors;
    public StatusError[] getErrors() {
        return errors;
    }
    public void setErrors(StatusError[] errors) {
        this.errors = errors;
    }
    public StatusError getError() {
        return error;
    }
    public void setError(StatusError error) {
        this.error = error;
    }
    private StatusError error;
    private String amount;
    private String currencyCode;
    private String paymentDate;
    private String paymentTypeCode;
    private String serviceCode;
    public Recharge getRecharge() {
        return recharge;
    }
    public void setRecharge(Recharge recharge) {
        this.recharge = recharge;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getCurrencyCode() {
        return currencyCode;
    }
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }
    public String getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
    public String getPaymentTypeCode() {
        return paymentTypeCode;
    }
    public void setPaymentTypeCode(String paymentTypeCode) {
        this.paymentTypeCode = paymentTypeCode;
    }
    public String getServiceCode() {
        return serviceCode;
    }
    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }
    public String getServiceName() {
        return serviceName;
    }
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getResponseCode() {
        return responseCode;
    }
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
    public String getTransactionSet() {
        return transactionSet;
    }
    public void setTransactionSet(String transactionSet) {
        this.transactionSet = transactionSet;
    }
    public String getTransactionResponseCode() {
        return transactionResponseCode;
    }
    public void setTransactionResponseCode(String transactionResponseCode) {
        this.transactionResponseCode = transactionResponseCode;
    }
    public String getTransactionRef() {
        return transactionRef;
    }
    public void setTransactionRef(String transactionRef) {
        this.transactionRef = transactionRef;
    }
    public String getServiceProviderId() {
        return serviceProviderId;
    }
    public void setServiceProviderId(String serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }
    private String serviceName;
    private String status;
    private String responseCode;
    private String transactionSet;
    private String transactionResponseCode;
    private String transactionRef;
    private String serviceProviderId;
}
