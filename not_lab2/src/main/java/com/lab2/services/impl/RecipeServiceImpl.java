package com.lab2.services.impl;

import com.lab2.dao.RecipeDao;
import com.lab2.dto.RecipeDto;
import com.lab2.entity.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by rasmus on 4/21/16.
 */
@Service
public class RecipeServiceImpl {

    @Autowired
    private RecipeDao recipeDao;

    public Recipe addRecipe(RecipeDto recipe) {
        return recipeDao.add(recipe);
    }
}
