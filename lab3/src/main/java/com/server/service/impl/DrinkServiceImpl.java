package com.server.service.impl;

import com.server.dao.IRecipeDao;
import com.shared.model.Recipe;
import com.shared.service.IDrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

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
    public List<Recipe> getRecipeByIngredient(List<String> ingredients) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map<String, Recipe> findAll() {
        return recipeDao.findAll();
    }
}
