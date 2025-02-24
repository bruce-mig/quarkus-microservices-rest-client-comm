package com.github.bruce.mig.dto;

public record ProductDto(
        String id,
        String name,
        Double price,
        Integer stock
) {
}
