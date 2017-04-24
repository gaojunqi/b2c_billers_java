package com.interswitch.techquest.billers.sample;

import com.interswitch.techquest.auth.Interswitch;
import com.interswitch.techquest.billers.BillPayment;
import com.interswitch.techquest.billers.dto.Biller;
import com.interswitch.techquest.billers.dto.BillerResponse;
import com.interswitch.techquest.billers.dto.PaymentItemResponse;
import com.interswitch.techquest.billers.dto.PaymentItems;

public class GetPaymentItems extends BaseSample {

    public static void main(String[] args) {

        // :compulsory
        BillPayment billPayment = new BillPayment(clientId, clientSecret, Interswitch.ENV_DEV);

        try {
            BillerResponse billers = billPayment.getBillers();
            if (billers instanceof BillerResponse && billers.getBiller() != null) {

                Biller[] billerArray = billers.getBiller();

                Biller firstBiller = billerArray[0];

                String billerId = firstBiller.getBillerid();

                //get all payment items for this biller
                
                PaymentItemResponse resp = billPayment.getBillerPaymentItems(billerId);
                
                if(resp instanceof PaymentItemResponse) {
                    
                    PaymentItems[] paymentItemsArray = resp.getPaymentitems();
                    
                    PaymentItems first = paymentItemsArray[0];
                    
                    String id = first.getPaymentitemid();
                    
                    String name = first.getPaymentitemname();
                    
                    String amount = first.getAmount();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
