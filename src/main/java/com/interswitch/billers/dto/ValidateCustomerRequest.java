package com.interswitch.billers.dto;

public class ValidateCustomerRequest {
    
    public ValidateCustomerRequest(String paymentCode, String customerId) {
        
        Customer customer = new Customer();
        customer.setCustomerId(customerId);
        customer.setPaymentCode(paymentCode);
        Customer[] c = new Customer[1];
        c[0] = customer;
        this.setCustomers(c);
    }
    
    private Customer[] customers;

    public Customer[] getCustomers() {
        return customers;
    }

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }
}
