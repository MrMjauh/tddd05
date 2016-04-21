package com.lab2.services;

import com.lab2.dao.RecipeRepository;
import com.lab2.model.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rasmus on 4/21/16.
 */
@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    public Recipe addRecipe(Recipe recipe) {
        return recipeRepository.addRecipe(recipe);
    }


}
