package com.interswitch.techquest.billers.sample;

import com.interswitch.techquest.billers.Constants;
import com.interswitch.techquest.billers.dto.PaymentResponse;
import com.interswitch.techquest.billers.dto.TransactionStatusResponse;

public class TransactionStatus extends BaseSample {

    public static void main(String[] args) {

        /**
         * Purpose: To get the status of a transaction after making a payment.
         * 
         * 1. Make Payment with a unique requestReference
         * 2. Query for the transaction
         */

        String paymentCode = "90101";//paymentCode for test="40201", paymentCode for sandbox=90101

        String customerId = "07030241757";

        String amount = "500"; // amount is in minor format.

        String billerReferencePrefix = "1456"; // ()biller specific prefix. This is a 4-digit code

        String requestRef = String.valueOf((int) (100000000 * Math.random())); // unique request reference

        requestRef = billerReferencePrefix + requestRef;

        try {
            // 1. Make Payment
            PaymentResponse response = billPayment.makePayment(amount, customerId, paymentCode, requestRef);

            // Query Transaction
            TransactionStatusResponse transactionStatus = billPayment.getTransactionStatus(requestRef);

            if (transactionStatus instanceof TransactionStatusResponse) {

                if (transactionStatus.getResponseCode() instanceof String && transactionStatus.getResponseCode()
                    .equals(Constants.SUCCESS)) {

                    String status = transactionStatus.getStatus(); // COMPLETE, INPROGRESS

                    System.out.println(status);

                } else {

                    String errorMessage = transactionStatus.getError()
                        .getMessage();

                    String errorCode = transactionStatus.getError()
                        .getCode();

                    System.out.println(errorMessage + " : " + errorCode);

                }

            }
        } catch (Exception ex) {

            ex.printStackTrace();

        }
    }
}
