package com.springlearn.address_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.springlearn.controller", "com.springlearn.service" })
@EntityScan("com.springlearn.entity")
@EnableJpaRepositories("com.springlearn.repository")
/**
 * The AddressServiceApplication class is the entry point for running the
 * address service application
 * in Java.
 */
public class AddressServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressServiceApplication.class, args);
	}

}
