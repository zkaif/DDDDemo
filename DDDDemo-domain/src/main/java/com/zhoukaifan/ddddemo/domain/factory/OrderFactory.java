package com.zhoukaifan.ddddemo.domain.factory;

import com.zhoukaifan.ddddemo.domain.entity.Order;
import com.zhoukaifan.ddddemo.domain.entity.OrderDraft;

public class OrderFactory {
    public static Order createOrder(OrderDraft orderDraft){
        Order order = new Order();
        //这里构造Order对象，工厂不能去资源库查必须上游查好给它
        return order;
    }
}
