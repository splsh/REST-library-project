package com.alexeistanovskii.org.spring_rest_library.controller;

import com.alexeistanovskii.org.spring_rest_library.json_data.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//@RestController
public class MyRestController {




////    @GetMapping("https://reststop.randomhouse.com/resources/authors?lastName={lastname}")
//        public Author getAuthorByLastName ( String lastName){
////            HttpHeaders httpHeaders = restTemplate
////                    .headForHeaders("https://reststop.randomhouse.com/resources/authors?lastName={lastname}");
//            System.out.println(lastName);
////        Author author = restTemplate.getForObject
////                ("https://reststop.randomhouse.com/resources/authors?lastName={lastname}", Author.class, lastName);
////            System.out.println(author);
//    return restTemplate.getForObject
//            ("https://reststop.randomhouse.com/resources/authors?lastName={lastname}", Author.class, lastName);
//        }

}
