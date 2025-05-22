package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringBootAppApplication.class, args);
		System.err.println("Spring boot up!");
	}

}
