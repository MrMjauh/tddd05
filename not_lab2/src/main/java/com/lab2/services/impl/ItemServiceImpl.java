package com.lab2.services.impl;

import com.lab2.dao.impl.ItemRepository;
import com.lab2.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rasmus on 4/21/16.
 */
@Service
public class ItemServiceImpl {

    @Autowired
    ItemRepository itemRepository;

    public Item addItem(String name) {
        return itemRepository.addItem(name);
    }
}
