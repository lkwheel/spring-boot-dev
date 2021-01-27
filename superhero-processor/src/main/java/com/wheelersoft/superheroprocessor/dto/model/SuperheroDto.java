package com.wheelersoft.superheroprocessor.dto.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.Nulls;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SuperheroDto {
    /**
     * e.g. "id": "70"
     */
    private Integer id;
    private String response;
    /**
     * e.g. "name": "Batman"
     */
    private String name;
    private PowerstatsDto powerstats;
    private BiographyDto biography;
    private AppearanceDto appearance;
    private WorkDto work;
    private ConnectionsDto connections;
    private ImageDto image;
}
