package com.interswitch.techquest.billers.dto;

public class BillerResponse {
    private Biller[] billers;

    public Biller[] getBiller() {
        return billers;
    }

    public void setBiller(Biller[] biller) {
        this.billers = biller;
    }
}
