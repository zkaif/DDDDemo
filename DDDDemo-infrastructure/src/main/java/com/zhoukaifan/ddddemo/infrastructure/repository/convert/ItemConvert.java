package com.zhoukaifan.ddddemo.infrastructure.repository.convert;

import com.zhoukaifan.ddddemo.domain.entity.Item;
import com.zhoukaifan.ddddemo.external.vo.ExternalItem;

public class ItemConvert {
    public static Item toDomain(ExternalItem externalItem) {
        Item item = new Item();
        item.setId(externalItem.getId());
        item.setName(externalItem.getName());
        item.setUnitPrice(externalItem.getUnitPrice());
        return item;
    }
}
