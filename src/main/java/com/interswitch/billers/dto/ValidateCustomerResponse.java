package com.interswitch.billers.dto;

public class ValidateCustomerResponse {

    
    //capital letter, the request is small letter
    private Customer[] Customers;
    
    public Customer[] getCustomers() {
        return Customers;
    }

    public void setCustomers(Customer[] customers) {
        Customers = customers;
    }

    public String getResponseDescription() {
        return ResponseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        ResponseDescription = responseDescription;
    }

    private String ResponseDescription;
}
