package com.lab2.controller;

import com.lab2.entity.Item;
import com.lab2.services.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rasmus on 4/21/16.
 */
@RestController
public class ItemController {

    @Autowired
    private ItemServiceImpl itemService;

    @RequestMapping(value = "",method = RequestMethod.POST, headers = "Accept=application/json")
    public Item addItem(@RequestParam String name) {
        return itemService.addItem(name);
    }
}
