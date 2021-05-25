package com.zhoukaifan.ddddemo.infrastructure.repository;

import com.zhoukaifan.ddddemo.domain.entity.Order;
import com.zhoukaifan.ddddemo.domain.entity.OrderItem;
import com.zhoukaifan.ddddemo.domain.entity.User;
import com.zhoukaifan.ddddemo.domain.repository.ItemRepository;
import com.zhoukaifan.ddddemo.domain.repository.OrderRepository;
import com.zhoukaifan.ddddemo.domain.repository.UserRepository;
import com.zhoukaifan.ddddemo.infrastructure.dao.OrderDO;
import com.zhoukaifan.ddddemo.infrastructure.dao.OrderDao;
import com.zhoukaifan.ddddemo.infrastructure.dao.OrderItemDO;
import com.zhoukaifan.ddddemo.infrastructure.dao.OrderItemDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class OrderRepositoryDaoImpl implements OrderRepository {
    @Autowired
    private OrderDao orderDao;
    @Autowired
    private OrderItemDao orderItemDao;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public void save(Order order) {
        OrderDO orderDO = null;
        List<OrderItemDO> orderItemDOS = null;
        //把order转换成OrderDO与OrderItemDO
        orderDao.insert(orderDO);
        orderItemDao.insertList(orderItemDOS);
    }

    @Override
    public Order getById(Long id) {
        Order order = new Order();
        OrderDO orderDO = orderDao.getById(id);
        List<OrderItemDO> orderItemDOList = orderItemDao.getByOrderId(id);
        User buyer = userRepository.getById(orderDO.getBuyerId());
        User seller = userRepository.getById(orderDO.getSellerId());
//        List<OrderItem> orderItems = orderItemDOList.forEach();
        //这样构造出Order对象
        //order.set.........
        //order.set.........
        //order.set.........
        return order;
    }
}
