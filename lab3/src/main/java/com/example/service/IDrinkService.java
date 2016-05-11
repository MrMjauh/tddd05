package com.example.service;

import com.example.model.Recipe;

import java.util.Iterator;
import java.util.List;

/**
 * Created by rasmus on 2016-05-11.
 */
public interface IDrinkService {

    boolean addRecipe(Recipe recipe);
    Recipe getRecipeByTitle(String title);
    Iterator<Recipe> getRecipeByIngredient(Iterator<String> ingredients);
}
