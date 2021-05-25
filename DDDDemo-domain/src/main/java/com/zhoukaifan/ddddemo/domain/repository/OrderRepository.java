package com.zhoukaifan.ddddemo.domain.repository;

import com.zhoukaifan.ddddemo.domain.entity.Order;

public interface OrderRepository {
    void save(Order order);
    Order getById(Long id);
}
