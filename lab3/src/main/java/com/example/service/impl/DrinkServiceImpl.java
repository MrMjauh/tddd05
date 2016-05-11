package com.example.service.impl;

import com.example.dao.IRecipeDao;
import com.example.model.Recipe;
import com.example.service.IDrinkService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Iterator;

/**
 * Created by rasmus on 2016-05-11.
 */
public class DrinkServiceImpl implements IDrinkService {

    @Autowired
    IRecipeDao recipeDao;

    @Override
    public boolean addRecipe(Recipe recipe) {
        return recipeDao.add(recipe);
    }

    @Override
    public Recipe getRecipeByTitle(String title) {
        return recipeDao.findOne(title);
    }

    @Override
    public Iterator<Recipe> getRecipeByIngredient(Iterator<String> ingredients) {
        return recipeDao.getFromIngredient(ingredients);
    }
}
