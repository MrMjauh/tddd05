package com.lab2.controller;

import com.lab2.config.Meta;
import com.lab2.dto.RecipeDto;
import com.lab2.entity.Recipe;
import com.lab2.services.impl.RecipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rasmus on 4/21/16.
 */
@RestController
@RequestMapping(value = Meta.Domains.recipe)
public class RecipeController {

    @Autowired
    private RecipeServiceImpl recipeService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recipe addRecipe(@RequestBody RecipeDto recipe) {

        Recipe returnedRecipe = recipeService.addRecipe(recipe);
        return returnedRecipe;
    }

    @RequestMapping(value = "",method = RequestMethod.PUT)
    public Recipe updateRecipe(@RequestBody RecipeDto recipe, @RequestParam(value="id") Integer id) {

        //Recipe returnedRecipe = recipeService.updateRecipe(recipe);
        return null;
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public Recipe getRecipe(@RequestBody Integer id) {

        //Recipe returnedRecipe = recipeService.getRecipe(id);
        return null;
    }
}
