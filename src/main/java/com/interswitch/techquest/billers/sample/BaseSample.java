package com.interswitch.techquest.billers.sample;

import com.interswitch.techquest.auth.Interswitch;
import com.interswitch.techquest.billers.BillPayment;

/**
 * 
 * @author 
 * You can get your sample clientId and clientSecret
 * from developer.interswitchng.com
 *
 */
public class BaseSample {

    /**
     * Sample Development Credentials
     */
    // public final static String clientId = "IKIA2EFBE1EF63D1BBE2AF6E59100B98E1D3043F477A";
    // public final static String clientSecret = "uAk0Amg6NQwQPcnb9BTJzxvMS6Vz22octQglQ1rfrMA=";

    // static BillPayment billPayment = new BillPayment(clientId, clientSecret, Interswitch.ENV_DEV);

    /**
     * Sample Sandbox Credentials
     */

    private final static String clientId = "IKIA6570778A3484D6F33BC7E4165ADCA6CF06B2860A";
    private final static String clientSecret = "DXfUwpuIvMAKN84kv38uspqGOsStgFS0oZMjU7bPwpU=";

    static BillPayment billPayment = new BillPayment(clientId, clientSecret, Interswitch.ENV_SANDBOX);
}
