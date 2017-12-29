package com.practice.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoSpringCloudAppConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudAppConfigServerApplication.class, args);
	}
}
