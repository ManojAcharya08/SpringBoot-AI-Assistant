package com.SpringBootAI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringBootAIApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAIApplication.class, args);
		System.out.println("Spring Boot AI Application started successfully...");
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
