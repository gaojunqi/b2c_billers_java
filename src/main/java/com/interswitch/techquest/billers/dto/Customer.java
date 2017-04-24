package com.interswitch.techquest.billers.dto;

public class Customer {
    
    private String customerId;
    private String paymentCode;
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public String getPaymentCode() {
        return paymentCode;
    }
    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }
    
    
    private String fullName;
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getResponseCode() {
        return responseCode;
    }
    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }
    public String getResponseDescription() {
        return responseDescription;
    }
    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }


    private String responseCode;
    private String responseDescription;
}
