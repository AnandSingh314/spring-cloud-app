package com.practice.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DemoSpringCloudAppRestaurantServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudAppRestaurantServiceApplication.class, args);
	}
}
