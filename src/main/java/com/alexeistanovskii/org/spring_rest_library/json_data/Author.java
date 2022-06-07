package com.alexeistanovskii.org.spring_rest_library.json_data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Author implements Serializable {

//    @JsonProperty
//    char approved;
    @JsonProperty
    @SerializedName("authorfirst")
    String firstName;
    @JsonProperty
    @SerializedName("authorlast")
    String lastName;
//    @JsonProperty
//    @SerializedName("works")
//    List<Long> titles;
    @JsonProperty
    @SerializedName("authorid")
    int id;
}
