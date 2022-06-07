package com.alexeistanovskii.org.spring_rest_library.controller;


import com.alexeistanovskii.org.spring_rest_library.json_data.Answer;
import com.alexeistanovskii.org.spring_rest_library.json_data.Author;
import com.alexeistanovskii.org.spring_rest_library.service.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;


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
    public String getAuthorByLastName(@Valid @ModelAttribute("author") Author author
            , BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "/author-search";
        }
        Answer answer = authorService.getAnswerByLastName(author.getLastName());
        model.addAttribute(answer);
        System.out.println(answer);
        return "show-author-search-result";
    }
}

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



