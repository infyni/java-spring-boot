package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")  // enable @Controller, @Service, @Repository 
@EntityScan(basePackages = "com.bean")		// enable @Entity class 
@EnableJpaRepositories(basePackages = "com.orm")	// enable spring jpa data features 
public class SpringBootJpaDataWithRelationshipApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaDataWithRelationshipApplication.class, args);
		System.out.println("Spring boot with spring jpa data relationship examples up!");
	}

}
