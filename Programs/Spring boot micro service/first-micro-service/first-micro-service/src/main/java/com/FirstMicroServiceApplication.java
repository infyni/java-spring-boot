package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableDiscoveryClient
public class FirstMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstMicroServiceApplication.class, args);
		System.out.println("First micro service project up on port number 8080");
	}

}
