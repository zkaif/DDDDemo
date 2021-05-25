package com.zhoukaifan.ddddemo.infrastructure.dao;

import lombok.Data;

@Data
public class OrderDO {
    private Long id;
    private Integer status;
    private Integer price;
    private Long buyerId;
    private Long sellerId;
}
