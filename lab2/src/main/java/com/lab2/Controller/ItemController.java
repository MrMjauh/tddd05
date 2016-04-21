package com.lab2.Controller;

import com.lab2.config.Meta;
import com.lab2.model.Item;
import com.lab2.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rasmus on 4/21/16.
 */
@RestController
@RequestMapping(value = Meta.Domains.item)
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "",method = RequestMethod.POST, headers = "Accept=application/json")
    public Item addItem(@RequestBody Item item) {
        return item;
    }
}
