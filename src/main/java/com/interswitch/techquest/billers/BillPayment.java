package com.interswitch.techquest.billers;

import java.net.URLEncoder;
import java.util.HashMap;

import com.google.gson.Gson;
import com.interswitch.techquest.auth.Interswitch;
import com.interswitch.techquest.billers.dto.BillerResponse;
import com.interswitch.techquest.billers.dto.CategoryResponse;
import com.interswitch.techquest.billers.dto.Payment;
import com.interswitch.techquest.billers.dto.PaymentItemResponse;
import com.interswitch.techquest.billers.dto.PaymentResponse;
import com.interswitch.techquest.billers.dto.TransactionInquiryRequest;
import com.interswitch.techquest.billers.dto.TransactionInquiryResponse;
import com.interswitch.techquest.billers.dto.TransactionStatusResponse;
import com.interswitch.techquest.billers.dto.ValidateCustomerRequest;
import com.interswitch.techquest.billers.dto.ValidateCustomerResponse;

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

    public PaymentResponse makePayment(String amount, String customerId, String paymentCode, String requestRef) throws Exception {
        if (paymentCode == null) {

            throw new IllegalArgumentException("product code is null");
        }
        if (customerId == null) {

            throw new IllegalArgumentException("customerId is null");
        }

        Payment payment = new Payment();
        payment.setAmount(amount);
        payment.setPaymentCode(paymentCode);
        payment.setCustomerId(customerId);
        payment.setRequestRef(requestRef);

        Gson g = new Gson();

        String request = g.toJson(payment);

        HashMap<String, String> extraHeaders = new HashMap<String, String>();
        HashMap<String, String> response = null;

        response = interswitch.send(Constants.PAYMENT_INQUIRY_RESOURCE_URL, Constants.POST, request, extraHeaders);

        String responseCode = response.get(Interswitch.RESPONSE_CODE);
        String msg = response.get(Interswitch.RESPONSE_MESSAGE);

        PaymentResponse resp = g.fromJson(msg, PaymentResponse.class);

        return resp;

    }

    public TransactionStatusResponse getTransactionStatus(String requestReference) throws Exception {

        HashMap<String, String> extraHeaders = new HashMap<String, String>();
        
        extraHeaders.put("requestReference", requestReference);

        HashMap<String, String> response = interswitch.send(Constants.TRANSACTION_STATUS_RESOURCE_URL, Constants.GET, "", extraHeaders);
        
        String responseCode = response.get(Interswitch.RESPONSE_CODE);
        String msg = response.get(Interswitch.RESPONSE_MESSAGE);
        Gson g = new Gson();
        TransactionStatusResponse resp = g.fromJson(msg, TransactionStatusResponse.class);

        return resp;

        
    }
}
