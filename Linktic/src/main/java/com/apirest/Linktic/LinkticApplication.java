package com.apirest.Linktic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
public class LinkticApplication {

	public static void main(String[] args) {
		SpringApplication.run(LinkticApplication.class, args);
	}
	
	@Bean
	public OpenAPI customOpenAPI() {
		
		return new OpenAPI().info(new Info()
				.title("linktic")
				.description("prueba linktic")
				);
	}

}

