package com.interswitch.techquest.billers.sample;

import com.interswitch.techquest.auth.Interswitch;
import com.interswitch.techquest.billers.BillPayment;

public class BaseSample {

    public final static String clientId = "IKIA2EFBE1EF63D1BBE2AF6E59100B98E1D3043F477A";
    public final static String clientSecret = "uAk0Amg6NQwQPcnb9BTJzxvMS6Vz22octQglQ1rfrMA=";
    
    //:compulsory
    static BillPayment billPayment = new BillPayment(clientId, clientSecret, Interswitch.ENV_DEV);
}
