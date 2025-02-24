package com.github.bruce.mig.dto;

public record Product(
        String id,
        String name,
        Double price,
        Integer stock
) {
}
