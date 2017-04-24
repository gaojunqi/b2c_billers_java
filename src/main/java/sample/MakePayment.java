package sample;

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
        
        String billerReferencePrefix = ""; //()biller specific prefix. This is a 4-digit code
        
        String requestRef = String.valueOf((int)(100000000*Math.random())); //unique request reference

        requestRef = billerReferencePrefix + requestRef;
        
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
