package com.wheelersoft.superheroprocessor.dto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PowerstatsDto {
    // The Superhero information
    private Integer id;
    private String name;
    // Stats information
    /**
     * e.g. "intelligence": "100"
     */
    private Integer intelligence;
    /**
     * e.g. "strength": "26"
     */
    private Integer strength;
    /**
     * e.g. "speed": "27"
     */
    private Integer speed;
    /**
     * e.g. "durability": "50"
     */
    private Integer durability;
    /**
     * e.g. "power": "47"
     */
    private Integer power;
    /**
     * e.g. "combat": "100"
     */
    private Integer combat;
}
