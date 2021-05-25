package com.zhoukaifan.ddddemo.domain.vo;

import lombok.Data;

@Data
public class PriceVO {
    private final Integer totalPrice;
    private final Integer discountPrice;
    private final Integer payPrice;

    public PriceVO(Integer totalPrice, Integer discountPrice, Integer payPrice) {
        this.totalPrice = totalPrice;
        this.discountPrice = discountPrice;
        this.payPrice = payPrice;
    }
}
