package com.interswitch.techquest.billers.dto;

public class PaymentItemResponse {
    
    private PaymentItems[] paymentitems;

    public PaymentItems[] getPaymentitems() {
        return paymentitems;
    }

    public void setPaymentitems(PaymentItems[] paymentitems) {
        this.paymentitems = paymentitems;
    }
}
