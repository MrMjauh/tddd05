package com.lab2.dao;

import com.lab2.model.Recipe;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by rasmus on 4/21/16.
 */
@Repository
public class RecipeRepository {

    @ResponseStatus(value= HttpStatus.BAD_REQUEST, reason="Recipe could not be added, " +
            "check there is not already a recipe with that name")
    private class RecipeCouldNotBeAdded extends RuntimeException {}

    public Recipe addRecipe(Recipe recipe) {
        throw new RecipeCouldNotBeAdded();
    }
}
