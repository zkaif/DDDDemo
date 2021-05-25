package com.zhoukaifan.ddddemo.domain.repository;

import com.zhoukaifan.ddddemo.domain.entity.User;

public interface UserRepository {
    User getById(Long id);
}
