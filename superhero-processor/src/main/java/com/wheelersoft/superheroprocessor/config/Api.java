package com.wheelersoft.superheroprocessor.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "api")
@Data
public class Api {
    private String key;
}
