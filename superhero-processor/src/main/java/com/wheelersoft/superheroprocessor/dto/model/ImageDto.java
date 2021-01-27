package com.wheelersoft.superheroprocessor.dto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ImageDto {
    // The Superhero information
    private Integer id;
    private String name;
    // Connections information
    /**
     * e.g. "url": "https://www.superherodb.com/pictures2/portraits/10/100/639.jpg"
     */
    private String url;
}
