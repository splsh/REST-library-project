package com.alexeistanovskii.org.spring_rest_library.service;

import com.alexeistanovskii.org.spring_rest_library.json_data.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


public interface AuthorService {

     Answer getAnswerByLastName(String lastName);
     void getAuthorByName(String name);
}