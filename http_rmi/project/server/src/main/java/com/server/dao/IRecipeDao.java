package com.server.dao;

import model.Recipe;

import java.util.List;

/**
 * Created by rasmus on 2016-05-11.
 */
public interface IRecipeDao extends IDao<Recipe,String> {

    List<Recipe> getFromIngredient(List<String> ingredients);
}
