package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com")
public class SpringBootSimpleRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSimpleRestApiApplication.class, args);
		System.out.println("Spring boot rest api up!");
	}

}
