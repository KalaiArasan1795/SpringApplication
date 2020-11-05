package com.bookcatalouge.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.demo.dao")
@SpringBootApplication
public class BookCatalogueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookCatalogueServiceApplication.class, args);
	}

}
