package com.lab2.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by rasmus on 4/21/16.
 */
public class Base {

    @ApiModelProperty(hidden = true)
    private int id = -1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
