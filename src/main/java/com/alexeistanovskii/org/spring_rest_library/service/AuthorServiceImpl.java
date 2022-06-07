package com.alexeistanovskii.org.spring_rest_library.service;

import com.alexeistanovskii.org.spring_rest_library.json_data.Answer;
import com.alexeistanovskii.org.spring_rest_library.json_data.Author;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

@Service
public class AuthorServiceImpl implements AuthorService{

    private RestTemplate restTemplate;
    String url ="https://reststop.randomhouse.com/resources/authors?lastName=";
    @Autowired
    public AuthorServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
//        HttpEntity<String> entity = new HttpEntity<>(url,httpHeaders);
    }

    @Override
    public void getAuthorByName(String name) {
    }

    public Answer getAnswerByLastName(String lastName) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(url, httpHeaders);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url+lastName, HttpMethod.GET, entity, String.class);
        String result = responseEntity.getBody();
        System.out.println("123 " + result);

        Gson gson = new Gson();
        Answer answer = gson.fromJson(result, Answer.class);
        System.out.println(answer);
        return gson.fromJson(result, Answer.class);
    }
//    public void getAnswerByLastName(String lastName) throws Exception{
//        URL url = new URL("https://reststop.randomhouse.com/resources/authors?lastName=Grisham");
//        HttpURLConnection con = (HttpURLConnection) url.openConnection();
//        InputStream is = con.getInputStream();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//        Gson gson = new Gson().;
//        Answer answer =gson.fromJson(reader,Answer.class);
//        System.out.println(answer);
//        String str;
//        while((str = reader.readLine()) != null) {
//            System.out.println(str);
//        }
//    }

//    public void getAnswerByLastName(String lastName){
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
//        HttpEntity<String> entity = new HttpEntity<>(url,httpHeaders);
//        String result =  restTemplate.exchange(url, HttpMethod.GET, entity, String.class)
//                .toString().replace("<200,", "").;
//        System.out.println("123 " + result);
//
//        Gson gson = new Gson();
//        Answer answer =gson.fromJson(result,Answer.class);
//        System.out.println(answer);

//        return restTemplate.getForObject
//                ("https://reststop.randomhouse.com/resources/authors?lastName={lastName}", Answer.class, lastName);
//    }
}
