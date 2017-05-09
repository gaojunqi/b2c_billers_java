package com.interswitch.techquest.billers.sample;

import com.interswitch.techquest.billers.dto.Customer;
import com.interswitch.techquest.billers.dto.ValidateCustomerResponse;

public class ValidateCustomer extends BaseSample {

    public static void main(String[] args) {

        /**
         * Check GetPaymentItems.java inside the sample folder 
         * for code to get a paymentCode.
         * 
         * A paymentCode is a payable. It is one of the several items a customer
         * can pay for under a Biller.
         * e.g A University can have several payables such as 
         * 1. School Fees, masters program.
         * 2. School Fees, Undergraduate
         * 3. Admission Fees.
         * 
         * The three payables above can each be have a paymentCode under a single university(Biller)
         */
        String paymentCode = "40201";// glo recharge test

        // sample customerId for the above paymentCode
        String customerId = "07030241757";

        try {
            ValidateCustomerResponse resp = billPayment.validateCustomer(paymentCode, customerId);
            if (resp instanceof ValidateCustomerResponse) {

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
