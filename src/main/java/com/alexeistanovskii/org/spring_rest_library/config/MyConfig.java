package com.alexeistanovskii.org.spring_rest_library.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

@Configuration
@PropertySource("classpath:application.properties")
public class MyConfig {

    @Bean
    @Scope("prototype")
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
