package com.server.dao.impl;

import com.server.dao.IRecipeDao;
import model.Recipe;

import java.util.*;

/**
 * Created by rasmus on 2016-05-11.
 */
public class DaoInMemory implements IRecipeDao {

    private Map<String,Recipe> inMemoryDb;

    public Recipe findOne(String s) {
        return inMemoryDb.get(s);
    }

    public Map<String, Recipe> findAll() {
        return inMemoryDb;
    }

    public boolean add(Recipe recipe) {
        if (!inMemoryDb.containsKey(recipe.getTitle())) {
            inMemoryDb.put(recipe.getTitle(),recipe);
            return true;
        }
        return false;
    }

    public boolean delete(String s) {
        if (!inMemoryDb.containsKey(s)) {
            inMemoryDb.remove(s);
            return true;
        }
        return false;
    }

    public List<Recipe> getFromIngredient(List<String> ingredients) {
        return null;
    }

    public void setInMemoryDb(Map<String, Recipe> inMemoryDb) {
        this.inMemoryDb = inMemoryDb;
    }
}
