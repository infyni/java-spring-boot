package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.entity")
@EnableJpaRepositories(basePackages = "com.repository")
@EnableDiscoveryClient
public class GpayMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GpayMicroServiceApplication.class, args);
		System.out.println("Gpay micro service up on port number 8383");
	}
	
	@Bean
	public RestTemplate restTemplate() {
		System.out.println("Rest Template object created...");
		return new RestTemplate();
	}

}
