package com.zhoukaifan.ddddemo.infrastructure.service;

import com.zhoukaifan.ddddemo.domain.entity.Order;
import com.zhoukaifan.ddddemo.domain.service.PerformService;
import com.zhoukaifan.ddddemo.external.ExternalPerformService;
import org.springframework.beans.factory.annotation.Autowired;

public class PerformServiceFacadeImpl implements PerformService {
    @Autowired
    private ExternalPerformService externalPerformService;
    @Override
    public void notifyPerformCreateOrder(Order order) {
        //这里rpc调用履约服务 这种情况适用与下游服务在本服务视角中是用于业务逻辑触发的情况
        externalPerformService.createOrder(order.getId());
    }
}
