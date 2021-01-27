package com.wheelersoft.superheroprocessor.controller;

import com.wheelersoft.superheroprocessor.config.Api;
import com.wheelersoft.superheroprocessor.dto.model.SuperheroApiQueryResults;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Log4j2
@RestController
@RequestMapping("/hero")
public class SuperheroController {

    private static final String URI_TEMPLATE = "https://www.superheroapi.com/api.php/%s";
    private static final String SEARCH_TEMPLATE = URI_TEMPLATE + "/search/%s";
    private final Api api;
    private final RestTemplate restTemplate;

    public SuperheroController(Api api, RestTemplate restTemplate) {
        this.api = api;
        this.restTemplate = restTemplate;
    }

    @GetMapping("/search")
    public SuperheroApiQueryResults findSuperhero(
            @RequestParam(value = "name", defaultValue = "batman") String name
    ) {
        final String uri =
                String.format(SEARCH_TEMPLATE, api.getKey(), name);
        log.debug("Querying uri: {}", uri);
        ResponseEntity<SuperheroApiQueryResults> responseEntity =
                restTemplate.exchange(uri,
                        HttpMethod.GET,
                        null,
                        new ParameterizedTypeReference<SuperheroApiQueryResults>() {}
                );
        SuperheroApiQueryResults results = responseEntity.getBody();
        return results;
    }
}
