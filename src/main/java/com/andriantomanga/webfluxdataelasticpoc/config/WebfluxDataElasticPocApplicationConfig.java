package com.andriantomanga.webfluxdataelasticpoc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(value = "com.andriantomanga.webfluxdataelasticpoc")
@Import({ SwaggerConfig.class })
public class WebfluxDataElasticPocApplicationConfig {

}
