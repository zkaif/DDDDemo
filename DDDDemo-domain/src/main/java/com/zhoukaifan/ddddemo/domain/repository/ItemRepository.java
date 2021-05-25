package com.zhoukaifan.ddddemo.domain.repository;

import com.zhoukaifan.ddddemo.domain.entity.Item;

public interface ItemRepository {
    Item getById(Long id);
}
