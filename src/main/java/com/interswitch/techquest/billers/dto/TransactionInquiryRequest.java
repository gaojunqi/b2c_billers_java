package com.interswitch.techquest.billers.dto;

public class TransactionInquiryRequest {

    private String paymentCode;

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerMobile() {
        return customerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        this.customerMobile = customerMobile;
    }

    public String getPageFlowValues() {
        return pageFlowValues;
    }

    public void setPageFlowValues(String pageFlowValues) {
        this.pageFlowValues = pageFlowValues;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }
    
    

    private String amount;
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getSiteDomainName() {
        return siteDomainName;
    }

    public void setSiteDomainName(String siteDomainName) {
        this.siteDomainName = siteDomainName;
    }

    public String getRequestReference() {
        return requestReference;
    }

    public void setRequestReference(String requestReference) {
        this.requestReference = requestReference;
    }

    public String getBankCbnCode() {
        return bankCbnCode;
    }

    public void setBankCbnCode(String bankCbnCode) {
        this.bankCbnCode = bankCbnCode;
    }

    public String getHashedPIN() {
        return hashedPIN;
    }

    public void setHashedPIN(String hashedPIN) {
        this.hashedPIN = hashedPIN;
    }

    public String getDeviceTerminalId() {
        return deviceTerminalId;
    }

    public void setDeviceTerminalId(String deviceTerminalId) {
        this.deviceTerminalId = deviceTerminalId;
    }

    public String getCardPan() {
        return cardPan;
    }

    public void setCardPan(String cardPan) {
        this.cardPan = cardPan;
    }



    private String siteDomainName;
    private String requestReference;
    private String bankCbnCode;
    private String hashedPIN;
    private String deviceTerminalId;
    private String cardPan;
    
    private String customerId;
    private String customerEmail;
    private String customerMobile;
    private String pageFlowValues;
    private String terminalId;
}
