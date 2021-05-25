package com.zhoukaifan.ddddemo.infrastructure.repository.convert;

import com.zhoukaifan.ddddemo.domain.entity.User;
import com.zhoukaifan.ddddemo.external.vo.ExternalUser;
import org.springframework.beans.BeanUtils;

public class UserConvert {
    public static User toDomain(ExternalUser externalUser) {
        User user = new User();
        BeanUtils.copyProperties(externalUser,user);
        return user;
    }
}
