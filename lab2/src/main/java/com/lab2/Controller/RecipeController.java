package com.lab2.Controller;

import com.lab2.config.Meta;
import com.lab2.model.Recipe;
import com.lab2.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rasmus on 4/21/16.
 */
@RestController
@RequestMapping(value = Meta.Domains.recipe)
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recipe addRecipe(@RequestBody Recipe recipe) {

        Recipe returnedRecipe = recipeService.addRecipe(recipe);
        return returnedRecipe;
    }
}
