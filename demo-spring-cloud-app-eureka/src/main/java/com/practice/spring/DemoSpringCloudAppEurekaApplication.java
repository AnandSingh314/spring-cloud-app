package com.practice.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoSpringCloudAppEurekaApplication {
	/**
	 * http://127.0.0.1:8761/info
	 * http://127.0.0.1:8761/health
	 * http://127.0.0.1:8761/metrics
	 * */
	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudAppEurekaApplication.class, args);
	}
}
