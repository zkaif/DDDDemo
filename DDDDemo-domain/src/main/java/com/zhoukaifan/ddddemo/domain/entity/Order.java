package com.zhoukaifan.ddddemo.domain.entity;

import com.zhoukaifan.ddddemo.domain.vo.PriceVO;
import lombok.Data;

import java.util.List;

@Data
public class Order {
    private Long id;
    private List<OrderItem> orderItem;
    private Integer status;
    private PriceVO price;
    private User buyer;
    private User seller;
}
