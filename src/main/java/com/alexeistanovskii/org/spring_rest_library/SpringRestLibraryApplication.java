package com.alexeistanovskii.org.spring_rest_library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringRestLibraryApplication /*extends SpringBootServletInitializer*/ {

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(SpringRestLibraryApplication.class);
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringRestLibraryApplication.class, args);
    }


}
