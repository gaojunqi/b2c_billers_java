package sample;

import com.interswitch.billers.BillPayment;
import com.interswitch.billers.dto.Customer;
import com.interswitch.billers.dto.ValidateCustomerResponse;
import com.interswitch.techquest.auth.Interswitch;

public class ValidateCustomer extends BaseSample {

    public static void main(String[] args){
        
        String productCode = "628051045";
        String customerId = "23481073015869987766";
        
      //:compulsory
        BillPayment billPayment = new BillPayment(clientId, clientSecret, Interswitch.ENV_DEV);
        
        try {
            ValidateCustomerResponse resp = billPayment.validateCustomer(productCode, customerId);
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
