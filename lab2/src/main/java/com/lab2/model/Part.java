package com.lab2.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by rasmus on 4/21/16.
 */
public class Part extends Base{


    @Autowired
    private Item item,unit;
    private float quantity;

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Item getUnit() {
        return unit;
    }

    public void setUnit(Item unit) {
        this.unit = unit;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
