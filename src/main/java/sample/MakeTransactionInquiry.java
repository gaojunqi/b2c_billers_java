package sample;

import com.interswitch.techquest.billers.Constants;
import com.interswitch.techquest.billers.dto.TransactionInquiryResponse;

public class MakeTransactionInquiry extends BaseSample {

    public static void main(String[] args){
        
        /**
         * To do payment code,
         * check out the GetPaymentItems.java sample code
         */
        String paymentCode = "40201";
        
        String customerId = "07030241757";
        
        try {
            TransactionInquiryResponse response= billPayment.transactionInquiry(paymentCode, customerId);
            if(response instanceof TransactionInquiryResponse && response.getResponseCode().equals(Constants.SUCCESS)) {
                
                /**
                 *  Transaction reference is used to make the actual payment
                 */
                String transactionRefernce = response.getTransactionRef();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
