package com.example.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by rasmus on 2016-05-11.
 */
public class Recipe implements Serializable {

    private String title;
    private List<String> ingredients;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }
}
