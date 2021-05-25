package com.zhoukaifan.ddddemo.client;

public interface OrderInterface {
    void save(SaveOrderParam saveOrderParam);
    OrderDTO getById(Long id);
}
