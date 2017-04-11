package sample;

import com.interswitch.billers.BillPayment;
import com.interswitch.billers.dto.Biller;
import com.interswitch.billers.dto.BillerResponse;
import com.interswitch.billers.dto.PaymentItemResponse;
import com.interswitch.billers.dto.PaymentItems;
import com.interswitch.techquest.auth.Interswitch;

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
