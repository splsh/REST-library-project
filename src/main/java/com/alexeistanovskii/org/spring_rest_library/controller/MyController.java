package com.alexeistanovskii.org.spring_rest_library.controller;


import com.alexeistanovskii.org.spring_rest_library.json_data.Answer;
import com.alexeistanovskii.org.spring_rest_library.json_data.Author;
import com.alexeistanovskii.org.spring_rest_library.service.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Collections;

@Controller
@RequestMapping("/")
public class MyController {
    @Autowired
    private AuthorServiceImpl authorService;

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/authorSearch")
    public String searchAuthorsPage(Model model) {
        model.addAttribute("author", new Author());
        return "/author-search";
    }

    @GetMapping("/getAuthor")
    public String getAuthorByLastName(Model model, @RequestParam("lastName") String last) throws Exception {
        System.out.println(last);
        Answer answer = authorService.getAnswerByLastName(last);
        model.addAttribute(answer);
        System.out.println(answer);

        return "show-author-search-result";
    }
//    @GetMapping ("/getAuthor")
//    public String getAuthorByLastName(@ModelAttribute ("author") Author author, BindingResult bindingResult) throws IOException {
//        System.out.println(author.getLastName() + " 123");
//        Answer answer = authorService.getAnswerByLastName(author.getLastName());
//        System.out.println(answer);
//        author = answer.getAuthor();
//        if (bindingResult.hasErrors()) {
//            System.out.println(bindingResult.hasErrors());
//            return "first-view";
//        }
//
//        return "show-author-search-result";
//    }
//        URL url = new URL("https://reststop.randomhouse.com/resources/authors?lastName=Grisham");
//        HttpURLConnection con = (HttpURLConnection) url.openConnection();
//        InputStream is = con.getInputStream();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
//        String str;
//        while((str = reader.readLine()) != null) {
//            System.out.println(str);
//        }
//        reader.close();
//        return "show-author-search-result";


}
