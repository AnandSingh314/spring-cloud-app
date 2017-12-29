package com.practice.spring;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class DemoSpringCloudAppZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringCloudAppZuulApplication.class, args);
	}

	@Autowired
	private Environment environment;

	@Bean
	public String[] profiles() {
		Stream.of(this.environment.getActiveProfiles()).forEach(e -> {
			System.err.println("ACTIVE PROFILE:" + e);
		});
		return this.environment.getActiveProfiles();
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}

	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}

	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}

	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
