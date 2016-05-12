package service;

import model.Recipe;

import java.util.List;
import java.util.Map;

/**
 * Created by rasmus on 2016-05-11.
 */
public interface IDrinkService {

    boolean addRecipe(Recipe recipe);
    Recipe getRecipeByTitle(String title);
    List<Recipe> getRecipeByIngredient(List<String> ingredients);
    Map<String, Recipe> findAll();
}
