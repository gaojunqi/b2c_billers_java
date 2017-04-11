package sample;

import com.interswitch.billers.BillPayment;
import com.interswitch.billers.dto.Customer;
import com.interswitch.billers.dto.ValidateCustomerResponse;
import com.interswitch.techquest.auth.Interswitch;

public class ValidateCustomer extends BaseSample {

    public static void main(String[] args){
        
        /**
         * Check GetPaymentItems for code to get a paymentCode
         */
        String paymentCode = "628051045";//glo recharge test
        
        //sample customerId for the above paymentCode
        String customerId = "234810730158";
        
      //:compulsory
        BillPayment billPayment = new BillPayment(clientId, clientSecret, Interswitch.ENV_DEV);
        
        try {
            ValidateCustomerResponse resp = billPayment.validateCustomer(paymentCode, customerId);
            if(resp instanceof ValidateCustomerResponse) {
                
                Customer[] customersArray = resp.getCustomers();
                
                Customer customer = customersArray[0];
                
                String fullName = customer.getFullName();
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
