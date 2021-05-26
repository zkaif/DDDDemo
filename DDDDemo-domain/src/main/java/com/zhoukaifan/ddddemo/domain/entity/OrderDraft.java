package com.zhoukaifan.ddddemo.domain.entity;

import lombok.Data;

import java.util.List;

@Data
public class OrderDraft {
    private Long id;
    private List<OrderItemDraft> orderItemDrafts;
    private Integer status;
    private Long buyerId;
    private Long sellerId;
    private User buyer;
    private User seller;

    public boolean checkXXX() {
        return false;
    }
}
