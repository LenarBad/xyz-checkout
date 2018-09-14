package com.xyz.checkout.test.client.billing;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BillingAddressServiceClientConfig {

    @Autowired
    ResteasyClient httpClient;

    private static final String URL = "https://xyz.com/api";

    @Bean
    public BillingAddressService getBillingAddressServiceClient() {
        return httpClient
                .target(URL)
                .proxy(BillingAddressService.class);
    }

}
