package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.entity")
@EnableJpaRepositories(basePackages = "com.repository")
public class SpringBootProductRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProductRestApiApplication.class, args);
		System.out.println("spring boot product rest api up!");
	}

}
