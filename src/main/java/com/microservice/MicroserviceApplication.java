package com.microservice;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @SpringBootConfiguration
// @EnableAutoConfiguration
// @ComponentScan
public class MicroserviceApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(MicroserviceApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
