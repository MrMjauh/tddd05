package com.lab2.dao.impl;

import com.lab2.dao.RecipeDao;
import com.lab2.dto.RecipeDto;
import com.lab2.entity.Recipe;
import org.springframework.stereotype.Repository;

/**
 * Created by rasmus on 4/21/16.
 */
@Repository
public class RecipeRepository implements RecipeDao<RecipeDto,Recipe> {

    public Recipe addRecipe(RecipeDto recipe) {
        throw new DaoExceptions.CouldNotBeAddedException();
    }

    public Recipe getRecipe(int id) {
        throw new DaoExceptions.CouldNotBeFoundException();
    }

    @Override
    public Recipe update(RecipeDto recipeDto, int pk) {
        return null;
    }

    @Override
    public Recipe get(int pk) {
        return null;
    }

    @Override
    public Recipe add(RecipeDto recipeDto) {
        return null;
    }

    @Override
    public Boolean del(int pk) {
        return null;
    }
}
