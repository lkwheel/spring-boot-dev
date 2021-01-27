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
public class BiographyDto {
    // The Superhero information
    private Integer id;
    private String name;
    // Biography information
    /**
     * e.g. "full-name": "Bruce Wayne"
     */
    @JsonProperty("full-name")
    private String fullName;

    /**
     * e.g. "alter-egos": "No alter egos found."
     */
    @JsonProperty("alter-egos")
    private String alterEgos;
    /**
     * e.g. "aliases": [ "Insider", "Matches Malone" ]
     */
    private String[] aliases;
    /**
     * e.g. "place-of-birth": "Crest Hill, Bristol Township; Gotham County"
     */
    @JsonProperty("place-of-birth")
    private String placeOfBirth;
    /**
     * e.g. "first-appearance": "Detective Comics #27"
     */
    @JsonProperty("first-appearance")
    private String firstAppearance;
    /**
     * e.g. "publisher": "DC Comics"
     */
    private String publisher;
    /**
     * e.g. "alignment": "good"
     */
    private String alignment;

//    public void setAlterEgos(String[] alterEgos) {
//        if (alterEgos != null && alterEgos.length == 1 && alterEgos[0].equals("No alter egos found.")) {
//            this.alterEgos = null;
//        } else {
//            this.alterEgos = alterEgos;
//        }
//    }
}
