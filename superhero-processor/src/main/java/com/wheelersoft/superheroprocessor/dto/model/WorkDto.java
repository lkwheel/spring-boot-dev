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
public class WorkDto {
    // The Superhero information
    private Integer id;
    private String name;
    // Work information
    /**
     * e.g. "occupation": "Businessman"
     */
    private String occupation;
    /**
     * e.g. "base": "Batcave, Stately Wayne Manor, Gotham City; Hall of Justice, Justice League Watchtower"
     */
    private String base;
}
