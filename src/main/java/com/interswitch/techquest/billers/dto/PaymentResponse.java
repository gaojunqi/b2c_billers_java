package com.interswitch.techquest.billers.dto;

public class PaymentResponse {

    private String transactionRef;

    public String getTransactionRef() {
        return transactionRef;
    }

    public void setTransactionRef(String transactionRef) {
        this.transactionRef = transactionRef;
    }

    public String getRechargePIN() {
        return rechargePIN;
    }

    public void setRechargePIN(String rechargePIN) {
        this.rechargePIN = rechargePIN;
    }

    public String getTransferCode() {
        return transferCode;
    }

    public void setTransferCode(String transferCode) {
        this.transferCode = transferCode;
    }

    public String getPhcnTokenDetails() {
        return phcnTokenDetails;
    }

    public void setPhcnTokenDetails(String phcnTokenDetails) {
        this.phcnTokenDetails = phcnTokenDetails;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getMiscData() {
        return miscData;
    }

    public void setMiscData(String miscData) {
        this.miscData = miscData;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    private String rechargePIN;
    private String transferCode;
    private String phcnTokenDetails;
    private String recipientName;
    private String miscData;
    private String balance;
    private String requestReference;

    public String getRequestRef() {
        return requestReference;
    }

    public void setRequestRef(String requestRef) {
        this.requestReference = requestRef;
    }
}
