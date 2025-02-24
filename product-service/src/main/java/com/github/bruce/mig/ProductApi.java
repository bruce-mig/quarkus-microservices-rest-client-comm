package com.github.bruce.mig;

import com.github.bruce.mig.dto.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductApi {

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") String id) {
        return new Product(id, "Mug", 2.39, 23);
    }

}
