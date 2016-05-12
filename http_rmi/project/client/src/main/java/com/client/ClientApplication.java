package com.client;

import com.client.config.AppConfig;
import model.Recipe;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import service.IDrinkService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by rubendas on 2016-05-12.
 */
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication clientApp = new SpringApplication(AppConfig.class);
        clientApp.setWebEnvironment(false);

        ConfigurableApplicationContext context = clientApp.run(args);
        IDrinkService drinkService = (IDrinkService) context.getBean("drinkHttpInvoker");

        Recipe ginTonic = new Recipe();
        ginTonic.setTitle("Gin and Tonic");
        List<String> ingredients = new ArrayList<String>();
        ingredients.add("Gin");
        ingredients.add("Tonic");

        if (drinkService.addRecipe(ginTonic)) {
            System.out.println("Succesfully added GT");
        } else {
            System.out.println("Failed to add GT");
        }

        Map<String, Recipe> recipes = drinkService.findAll();

        System.out.println("Recipes:");
        for (String s : recipes.keySet()) {
            System.out.println(s);
        }
    }
}