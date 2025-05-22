package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com") // enable @Controller, @Service, @Repository 
public class SpringBootWithJdbcTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithJdbcTemplateApplication.class, args);
		System.err.println("spring boot up");
	}

}
