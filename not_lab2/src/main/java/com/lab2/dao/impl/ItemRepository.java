package com.lab2.dao.impl;

import com.lab2.entity.Item;
import org.springframework.stereotype.Repository;

/**
 * Created by rasmus on 4/21/16.
 */
@Repository
public class ItemRepository {

    public Item addItem(String item) {
        throw new DaoExceptions.CouldNotBeAddedException();
    }
}
