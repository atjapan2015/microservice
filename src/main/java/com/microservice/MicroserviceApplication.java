package com.microservice;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// @SpringBootConfiguration
// 该注解也是一个复合注解，其中最重要的注解是@Configuration，指明了该类由Spring容积管理。
// @EnableAutoConfiguration 该注解用于启动服务的自动配置功能。
// @ComponentScan 该注解用于扫描类。
public class MicroserviceApplication {

	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(MicroserviceApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
