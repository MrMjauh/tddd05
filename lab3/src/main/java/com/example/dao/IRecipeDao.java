package com.example.dao;

import com.example.model.Recipe;

import java.util.Iterator;

/**
 * Created by rasmus on 2016-05-11.
 */
public interface IRecipeDao extends IDao<Recipe,String> {

    public Iterator<Recipe> getFromIngredient(Iterator<String> ingredients);
}
