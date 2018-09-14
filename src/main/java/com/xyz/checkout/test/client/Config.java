package com.xyz.checkout.test.client;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ResteasyClient getHttpClient() {
        return new ResteasyClientBuilder()
                .disableTrustManager()
                .connectionPoolSize(20).build();
    }

}
