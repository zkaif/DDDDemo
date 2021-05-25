package com.zhoukaifan.ddddemo.domain.entity;

import lombok.Data;

@Data
public class OrderItem {
    private Integer count;
    private Integer price;
    private Item item;
}
