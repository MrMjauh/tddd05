package com.example.config;

import com.example.dao.impl.DaoInMemory;
import com.example.model.Recipe;
import com.example.service.IDrinkService;
import com.example.service.impl.DrinkServiceImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by rasmus on 2016-05-11.
 */
@Profile("dev")
@Configuration
public class DevConfig {

    @Bean
    public DaoInMemory daoInMemory() {
        DaoInMemory daoInMemory = new DaoInMemory();
        // inject with a specific map
        daoInMemory.setInMemoryDb(new HashMap<>());

        // add some cool recipes
        Recipe sand = new Recipe();
        sand.setTitle("sand");
        List<String> ingredients = new ArrayList<>();
        ingredients.add("sand");
        ingredients.add("dust");
        sand.setIngredients(ingredients);

        daoInMemory.add(sand);
        return new DaoInMemory();
    }

    @Bean
    public IDrinkService drinkService() {
        return new DrinkServiceImpl();
    }


    @Bean
    public HttpInvokerServiceExporter drinkServiceHttpInvoker() {
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();

        exporter.setService(drinkService());
        exporter.setServiceInterface(IDrinkService.class);
        return exporter;
    }

}
