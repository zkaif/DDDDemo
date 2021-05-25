package com.zhoukaifan.ddddemo.interfaces;

import com.zhoukaifan.ddddemo.application.OrderApplication;
import com.zhoukaifan.ddddemo.client.OrderDTO;
import com.zhoukaifan.ddddemo.client.OrderInterface;
import com.zhoukaifan.ddddemo.client.SaveOrderParam;
import com.zhoukaifan.ddddemo.domain.entity.Order;
import com.zhoukaifan.ddddemo.domain.entity.OrderDraft;
import com.zhoukaifan.ddddemo.domain.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderInterfaceImpl implements OrderInterface {

    @Autowired
    private OrderApplication orderApplication;

    @Override
    public void save(SaveOrderParam saveOrderParam) {
        try {
            OrderDraft orderDraft = Convert.toDomain(saveOrderParam);
            orderApplication.save(orderDraft);
        } catch (Exception e){
            //统一的异常处理
        }
    }

    @Override
    public OrderDTO getById(Long id) {
        try {
            Order byId = orderApplication.getById(id);
            return Convert.toDTO(byId);
        } catch (Exception e){
            //统一的异常处理
            return null;
        }
    }
}
