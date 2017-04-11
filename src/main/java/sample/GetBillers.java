package sample;

import com.interswitch.billers.BillPayment;
import com.interswitch.billers.dto.Biller;
import com.interswitch.billers.dto.BillerResponse;
import com.interswitch.techquest.auth.Interswitch;

public class GetBillers extends BaseSample {

    
    public static void main(String[] args) {
        
        //:compulsory
        BillPayment billPayment = new BillPayment(clientId, clientSecret, Interswitch.ENV_DEV);

        try {
            BillerResponse billers = billPayment.getBillers();
            if (billers instanceof BillerResponse && billers.getBiller() != null) {

                
                Biller[] billerArray = billers.getBiller();
                
                Biller firstBiller = billerArray[0];

                String billerId = firstBiller.getBillerid();

                String billername = firstBiller.getBillername();
                
                System.out.println("biller id is: "+billerId);
                System.out.println("biller name is "+billername);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
