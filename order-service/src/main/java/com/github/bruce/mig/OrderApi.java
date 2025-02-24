package com.github.bruce.mig;

import com.github.bruce.mig.client.ProductClient;
import com.github.bruce.mig.dto.OrderDto;
import com.github.bruce.mig.dto.ProductDto;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderApi {

    @RestClient
    private ProductClient productClient;

    @PostMapping
    public OrderDto createOrder(@RequestBody OrderDto order) {
        ProductDto product = productClient.getProductById(order.productId());
        System.out.println(product);

        return order;
    }
}
