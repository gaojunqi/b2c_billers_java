package sample;

import com.interswitch.billers.dto.PaymentResponse;

public class MakePayment extends BaseSample {

    public static void main(String[] args) {
        /**
         * To do payment code,
         * check out the GetPaymentItems.java sample code
         */
        String paymentCode = "40201";

        String customerId = "07030241757";

        String amount = "500"; // amount is in minor format.

        try {

            PaymentResponse response =  billPayment.makePayment(amount, customerId, paymentCode);
            
            if(response instanceof PaymentResponse) {
                
                String transactionRef = response.getTransactionRef();
                
                System.out.println(transactionRef);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
