package com.xyz.checkout.test.client.billing;

import com.xyz.checkout.test.model.BillingAddressDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BillingAddressServiceClient {

    @Autowired
    BillingAddressService billingAddress;

    public void updateBillingAddress(String orderId, BillingAddressDto billingAddressDto, String token) {
        billingAddress.updateBillingAddress(orderId, billingAddressDto, token);
    }

    public BillingAddressDto getBillingAddress(String orderId, String token) {
        return billingAddress.getBillingAddress(orderId, token);
    }
}