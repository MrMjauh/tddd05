package com.server.impl;

import com.server.dao.IRecipeDao;
import model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import service.IDrinkService;

import java.util.List;
import java.util.Map;

/**
 * Created by rasmus on 2016-05-11.
 */
public class DrinkServiceImpl implements IDrinkService {

    @Autowired
    IRecipeDao recipeDao;


    public boolean addRecipe(Recipe recipe) {
        return recipeDao.add(recipe);
    }

    public Recipe getRecipeByTitle(String title) {

        return recipeDao.findOne(title);
    }

    public List<Recipe> getRecipeByIngredient(List<String> ingredients) {
        throw new UnsupportedOperationException();
    }

    public Map<String, Recipe> findAll() {
        return recipeDao.findAll();
    }
}
