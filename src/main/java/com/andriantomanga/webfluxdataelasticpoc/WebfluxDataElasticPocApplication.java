package com.andriantomanga.webfluxdataelasticpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.andriantomanga.webfluxdataelasticpoc.config.WebfluxDataElasticPocApplicationConfig;

@SpringBootApplication
@Import({ WebfluxDataElasticPocApplicationConfig.class })
public class WebfluxDataElasticPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxDataElasticPocApplication.class, args);
	}

}
