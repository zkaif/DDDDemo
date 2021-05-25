package com.zhoukaifan.ddddemo.application;

import com.zhoukaifan.ddddemo.domain.entity.Order;
import com.zhoukaifan.ddddemo.domain.entity.OrderDraft;
import com.zhoukaifan.ddddemo.domain.entity.User;
import com.zhoukaifan.ddddemo.domain.factory.OrderFactory;
import com.zhoukaifan.ddddemo.domain.repository.ItemRepository;
import com.zhoukaifan.ddddemo.domain.repository.OrderRepository;
import com.zhoukaifan.ddddemo.domain.repository.UserRepository;
import com.zhoukaifan.ddddemo.domain.service.PerformService;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderApplication {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private PerformService performService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ItemRepository itemRepository;

    public void createOrder(){
    }

    public Order getById(Long id){
        if (id==null){
            return null;
        }
        return orderRepository.getById(id);
    }

    public void save(OrderDraft orderDraft) {
        User buyer = userRepository.getById(orderDraft.getBuyerId());
        User seller = userRepository.getById(orderDraft.getSellerId());
//        itemRepository.getById(orderDraft.);
        orderDraft.setBuyer(buyer);
        orderDraft.setSeller(seller);
        //填充数据后再调用工厂
        Order order = OrderFactory.createOrder(orderDraft);
        orderRepository.save(order);
        performService.notifyPerformCreateOrder(order);
    }
}
