package com.github.bruce.mig.client;

import com.github.bruce.mig.dto.ProductDto;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(configKey = "product-client")
public interface ProductClient {

    @GET
    @Path("/products/{id}")
    ProductDto getProductById(@PathParam("id") String id);
}
