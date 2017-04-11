package sample;

import com.interswitch.billers.BillPayment;
import com.interswitch.billers.dto.Biller;
import com.interswitch.billers.dto.BillerResponse;
import com.interswitch.techquest.auth.Interswitch;

public class GetBillers {

    private final static String clientId = "IKIA2EFBE1EF63D1BBE2AF6E59100B98E1D3043F477A";
    private final static String clientSecret = "uAk0Amg6NQwQPcnb9BTJzxvMS6Vz22octQglQ1rfrMA=";

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
