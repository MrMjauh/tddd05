package com.lab2.config;

import com.lab2.model.Item;
import com.lab2.model.Part;
import com.lab2.model.Recipe;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfig for creating the beans in the context it is running in
 */
@Configuration
public class AppConfig {

    @Bean
    public Item item() {
        return new Item();
    }

    @Bean
    public Part part() {return new Part(); }

    @Bean
    public Recipe recipe() {return new Recipe();}

}
