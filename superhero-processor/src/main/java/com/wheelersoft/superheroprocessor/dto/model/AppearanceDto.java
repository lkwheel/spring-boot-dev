package com.wheelersoft.superheroprocessor.dto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppearanceDto {
    // The Superhero information
    private Integer id;
    private String name;
    // Appearance information
    /**
     * e.g. "gender": "Male",
     */
    private String gender;
    /**
     * e.g. "race": "Human"
     */
    private String race;
    /**
     * e.g. "height": [ "6'2", "188 cm" ]
     */
    private List<String> height;
    /**
     * e.g. "weight": [ "210 lb", "95 kg" ]
     */
    private List<String> weight;
    /**
     * e.g. "eye-color": "blue"
     */
    @JsonProperty("eye-color")
    private String eyeColor;
    /**
     * e.g. "hair-color": "black"
     */
    @JsonProperty("hair-color")
    private String hairColor;
}
