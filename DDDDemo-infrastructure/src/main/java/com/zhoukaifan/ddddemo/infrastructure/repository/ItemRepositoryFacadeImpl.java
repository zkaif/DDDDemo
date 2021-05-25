package com.zhoukaifan.ddddemo.infrastructure.repository;

import com.zhoukaifan.ddddemo.domain.entity.Item;
import com.zhoukaifan.ddddemo.domain.repository.ItemRepository;
import com.zhoukaifan.ddddemo.external.ExternalItemService;
import com.zhoukaifan.ddddemo.external.vo.ExternalItem;
import com.zhoukaifan.ddddemo.infrastructure.repository.convert.ItemConvert;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemRepositoryFacadeImpl implements ItemRepository {
    @Autowired
    private ExternalItemService externalItemService;
    @Override
    public Item getById(Long id) {
        ExternalItem externalItem = externalItemService.getById(id);
        return ItemConvert.toDomain(externalItem);
    }
}
