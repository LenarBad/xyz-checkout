package com.xyz.checkout.test.client.billing;

import com.xyz.checkout.test.model.BillingAddressDto;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/checkout/billing")
public interface BillingAddressService {

    public static final String APPLICATION_JSON = "application/json";

    @GET
    @Path("/{orderId}")
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    BillingAddressDto getBillingAddress(
            @PathParam("orderId") String orderId,
            @CookieParam("token") String token);

    @PUT
    @Path("/{orderId}")
    @Consumes(APPLICATION_JSON)
    @Produces(APPLICATION_JSON)
    void updateBillingAddress(
            @PathParam("orderId") String orderId,
            BillingAddressDto billingAddressDto,
            @CookieParam("token") String token);

}