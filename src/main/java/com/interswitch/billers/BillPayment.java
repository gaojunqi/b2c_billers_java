package com.interswitch.billers;

import java.util.HashMap;

import com.google.gson.Gson;
import com.interswitch.billers.dto.BillerResponse;
import com.interswitch.billers.dto.CategoryResponse;
import com.interswitch.billers.dto.PaymentItemResponse;
import com.interswitch.billers.dto.TransactionInquiryRequest;
import com.interswitch.billers.dto.TransactionInquiryResponse;
import com.interswitch.billers.dto.ValidateCustomerRequest;
import com.interswitch.billers.dto.ValidateCustomerResponse;
import com.interswitch.techquest.auth.Interswitch;

public class BillPayment {

    private Interswitch interswitch;

    public BillPayment(String clientId, String clientSecret) {
        this(clientId, clientSecret, Interswitch.ENV_SANDBOX);
    }

    public BillPayment(String clientId, String clientSecret, String env) {
        if (clientId == null) {
            throw new IllegalArgumentException("CliendId is empty");
        }
        if (clientSecret == null) {
            throw new IllegalArgumentException("CliendSecret is empty");
        }

        if (env == null) {
            env = Interswitch.SANDBOX_BASE_URL;
        }

        interswitch = new Interswitch(clientId, clientSecret, env);
    }

    /**
     * Get billers
     * @return
     * @throws Exception 
     */
    public BillerResponse getBillers() throws Exception {

        HashMap<String, String> extraHeaders = new HashMap<String, String>();
        HashMap<String, String> response = interswitch.send(Constants.GET_BILLERS_URL, Constants.GET, "", extraHeaders);
        String responseCode = response.get(Interswitch.RESPONSE_CODE);
        String msg = response.get(Interswitch.RESPONSE_MESSAGE);
        Gson g = new Gson();
        BillerResponse resp = g.fromJson(msg, BillerResponse.class);
        return resp;
    }

    public CategoryResponse getCategorys() throws Exception {

        HashMap<String, String> extraHeaders = new HashMap<String, String>();
        HashMap<String, String> response = interswitch.send(Constants.GET_CATEGORY_URL, Constants.GET, "", extraHeaders);
        String responseCode = response.get(Interswitch.RESPONSE_CODE);
        String msg = response.get(Interswitch.RESPONSE_MESSAGE);
        Gson g = new Gson();
        CategoryResponse resp = g.fromJson(msg, CategoryResponse.class);
        return resp;

    }

    public BillerResponse getCategoryBillers(String id) throws Exception {

        HashMap<String, String> extraHeaders = new HashMap<String, String>();
        HashMap<String, String> response = interswitch.send(Constants.GET_CATEGORY_BILLERS_PREFIX + id + Constants.GET_CATEGORY_BILLERS_SUFFIX, Constants.GET, "", extraHeaders);
        String responseCode = response.get(Interswitch.RESPONSE_CODE);
        String msg = response.get(Interswitch.RESPONSE_MESSAGE);
        Gson g = new Gson();
        BillerResponse resp = g.fromJson(msg, BillerResponse.class);
        return resp;

    }

    public PaymentItemResponse getBillerPaymentItems(String billerId) throws Exception {
        HashMap<String, String> extraHeaders = new HashMap<String, String>();
        HashMap<String, String> response = interswitch.send(Constants.GET_CATEGORY_BILLERS_PAYMENTITEMS_PREFIX + billerId + Constants.GET_CATEGORY_BILLERS_PAYMENTITEMS_SUFFIX, Constants.GET, "", extraHeaders);
        String responseCode = response.get(Interswitch.RESPONSE_CODE);
        String msg = response.get(Interswitch.RESPONSE_MESSAGE);
        Gson g = new Gson();
        PaymentItemResponse resp = g.fromJson(msg, PaymentItemResponse.class);
        return resp;

    }

    public ValidateCustomerResponse validateCustomer(String productCode, String customerId) throws Exception {

        // create the dtos

        if (productCode == null) {

            throw new IllegalArgumentException("product code is null");
        }
        if (customerId == null) {

            throw new IllegalArgumentException("customerId is null");
        }

        ValidateCustomerRequest customerRequest = new ValidateCustomerRequest(productCode, customerId);

        Gson g = new Gson();

        String request = g.toJson(customerRequest);

        HashMap<String, String> extraHeaders = new HashMap<String, String>();
        HashMap<String, String> response = null;

        response = interswitch.send(Constants.CUSTOMER_VALIDATION_RESOURCE_URL, Constants.POST, request, extraHeaders);

        String responseCode = response.get(Interswitch.RESPONSE_CODE);
        String msg = response.get(Interswitch.RESPONSE_MESSAGE);

        ValidateCustomerResponse resp = g.fromJson(msg, ValidateCustomerResponse.class);

        return resp;

    }

    public TransactionInquiryResponse transactionInquiry(String paymentCode, String customerId) throws Exception {

        if (paymentCode == null) {

            throw new IllegalArgumentException("product code is null");
        }
        if (customerId == null) {

            throw new IllegalArgumentException("customerId is null");
        }

        TransactionInquiryRequest inquiryRequest = new TransactionInquiryRequest();
        inquiryRequest.setPaymentCode(paymentCode);
        inquiryRequest.setCustomerId(customerId);

        Gson g = new Gson();

        String request = g.toJson(inquiryRequest);

        HashMap<String, String> extraHeaders = new HashMap<String, String>();
        HashMap<String, String> response = null;

        response = interswitch.send(Constants.TRANSACTION_INQUIRY_RESOURCE_URL, Constants.POST, request, extraHeaders);
        
        String responseCode = response.get(Interswitch.RESPONSE_CODE);
        String msg = response.get(Interswitch.RESPONSE_MESSAGE);

        TransactionInquiryResponse resp = g.fromJson(msg, TransactionInquiryResponse.class);

        return resp;
        
    }
}
