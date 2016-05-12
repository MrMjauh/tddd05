package com.server.dao;

import com.shared.model.Recipe;

import java.util.Iterator;
import java.util.List;

/**
 * Created by rasmus on 2016-05-11.
 */
public interface IRecipeDao extends IDao<Recipe,String> {

    public List<Recipe> getFromIngredient(List<String> ingredients);
}
