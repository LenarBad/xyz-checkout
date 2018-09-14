package com.xyz.checkout.test.billing;

import com.xyz.checkout.test.BaseIT;
import com.xyz.checkout.test.client.billing.BillingAddressServiceClient;
import com.xyz.checkout.test.model.BillingAddressDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BillingAddressIT extends BaseIT {

    @Autowired
    BillingAddressServiceClient billing;

    @Test
    public void updateBillingAddressTest() {
        String token = "affes23wklds721ds12dd32";
        String orderId = "123456789";

        BillingAddressDto billingAddress = new BillingAddressDto("John", "Doe", "123 Lost Street, Nowhere City, Nowhereland");

        billing.updateBillingAddress(orderId, billingAddress, token);
        BillingAddressDto updatedAddress = billing.getBillingAddress(orderId, token);

        Assert.assertEquals(updatedAddress.getFirstName(), billingAddress.getFirstName());
        Assert.assertEquals(updatedAddress.getLastName(), billingAddress.getLastName());
        Assert.assertEquals(updatedAddress.getAddress(), billingAddress.getAddress());
    }


}
