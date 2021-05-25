package com.zhoukaifan.ddddemo.domain.service;

import com.zhoukaifan.ddddemo.domain.entity.Order;

public interface PerformService {
    void notifyPerformCreateOrder(Order order);
}
