package com.server.config;

import com.server.dao.IRecipeDao;
import com.server.dao.impl.DaoInMemory;
import com.shared.model.Recipe;
import com.shared.service.IDrinkService;
import com.server.service.impl.DrinkServiceImpl;
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
    public IRecipeDao daoInMemory() {
        DaoInMemory daoInMemory = new DaoInMemory();
        // inject with a specific map
        daoInMemory.setInMemoryDb(new HashMap<String,Recipe>());

        // add some cool recipes
        Recipe whiteRussian = new Recipe();
        whiteRussian.setTitle("White Russian");
        List<String> ingredients = new ArrayList<>();
        ingredients.add("Vodka");
        ingredients.add("Kahlua");
        ingredients.add("Milk");
        whiteRussian.setIngredients(ingredients);

        daoInMemory.add(whiteRussian);
        return daoInMemory;
    }

    @Bean
    public IDrinkService drinkService() {
        return new DrinkServiceImpl();
    }


    @Bean(name = "/drink")
    public HttpInvokerServiceExporter drinkServiceHttpInvoker() {
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();

        exporter.setService(drinkService());
        exporter.setServiceInterface(IDrinkService.class);
        return exporter;
    }

}
