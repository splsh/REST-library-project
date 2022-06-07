package com.alexeistanovskii.org.spring_rest_library.json_data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Answer {
    @SerializedName("author")
    private List<Author> authorList;
}
