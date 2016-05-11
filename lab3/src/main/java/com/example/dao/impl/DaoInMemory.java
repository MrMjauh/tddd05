package com.example.dao.impl;

import com.example.dao.IRecipeDao;
import com.example.model.Recipe;

import java.util.*;

/**
 * Created by rasmus on 2016-05-11.
 */
public class DaoInMemory implements IRecipeDao {

    private Map<String,Recipe> inMemoryDb;

    @Override
    public Recipe findOne(String s) {
        return inMemoryDb.get(s);
    }

    @Override
    public Iterator<Recipe> findAll() {
        return inMemoryDb.values().iterator();
    }

    @Override
    public boolean add(Recipe recipe) {
        if (!inMemoryDb.containsKey(recipe.getTitle())) {
            inMemoryDb.put(recipe.getTitle(),recipe);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(String s) {
        if (!inMemoryDb.containsKey(s)) {
            inMemoryDb.remove(s);
            return true;
        }
        return false;
    }

    @Override
    public Iterator<Recipe> getFromIngredient(Iterator<String> ingredients) {
        Iterator<Recipe> recipeIt = findAll();

        while (recipeIt.hasNext()) {
            Recipe recipe = recipeIt.next();
            List<String> ingredList = recipe.getIngredients();


        }
        return null;
    }

    public void setInMemoryDb(Map<String, Recipe> inMemoryDb) {
        this.inMemoryDb = inMemoryDb;
    }
}
