package com.lab2.model;

import org.springframework.context.annotation.Bean;

/**
 * Created by rasmus on 4/21/16.
 */

public class Item extends Base{


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
