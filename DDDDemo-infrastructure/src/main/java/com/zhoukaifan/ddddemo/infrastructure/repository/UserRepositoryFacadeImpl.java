package com.zhoukaifan.ddddemo.infrastructure.repository;

import com.zhoukaifan.ddddemo.domain.entity.User;
import com.zhoukaifan.ddddemo.domain.repository.UserRepository;
import com.zhoukaifan.ddddemo.external.ExternalUserService;
import com.zhoukaifan.ddddemo.external.vo.ExternalUser;
import com.zhoukaifan.ddddemo.infrastructure.repository.convert.UserConvert;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryFacadeImpl implements UserRepository {
    @Autowired
    private ExternalUserService externalUserService;

    @Override
    public User getById(Long id) {
        ExternalUser externalUser = externalUserService.getById(id);
        return UserConvert.toDomain(externalUser);
    }
}
