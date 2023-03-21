package com.example.gotogether.product.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ProductStatus {
    FOR_SALE("판매중"), HIDING("숨김");

    private final String value;

}
