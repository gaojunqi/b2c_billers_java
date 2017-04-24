package com.interswitch.techquest.billers.sample;

import com.interswitch.techquest.billers.dto.PaymentResponse;

public class MakePayment extends BaseSample {

    public static void main(String[] args) {
        /**
         * To know payment codes,
         * check out the GetPaymentItems.java sample code
         */
        
        String paymentCode = "40201";

        String customerId = "07030241757";

        String amount = "500"; // amount is in minor format.
        
        /**
         * The referencePrefix is a unique 4-sequence code for each Biller
         * You can get your own when you are set up as a merchant on our platform
         * It is not mandatory to have one
         * We strongly advice you get one because it will reduce the chances of reference collisions.
         * 
         * In the example below, we will be using "test" as out referencePrefix
         */
        String referencePrefix = "test"; //
        
        String requestRef = String.valueOf((int)(100000000*Math.random())); //unique request reference

        requestRef = referencePrefix + requestRef;
        
        try {

            PaymentResponse response =  billPayment.makePayment(amount, customerId, paymentCode, requestRef);
            
            if(response instanceof PaymentResponse) {
                
                String transactionRef = response.getTransactionRef();
                
                System.out.println(transactionRef);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
