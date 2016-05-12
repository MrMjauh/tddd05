package com.client.config;

import service.IDrinkService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

/**
 * Created by rubendas on 2016-05-12.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class AppConfig {
    @Bean(name="drinkHttpInvoker")
    public HttpInvokerProxyFactoryBean httpInvokerProxy() {
        HttpInvokerProxyFactoryBean httpInvokerProxy = new HttpInvokerProxyFactoryBean();
        httpInvokerProxy.setServiceInterface(IDrinkService.class);
        httpInvokerProxy.setServiceUrl("http://localhost:8080/drink");

        return httpInvokerProxy;
    }
}
