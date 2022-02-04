package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication is a convenience annotation that adds:
// @Configuration: Tags the class as a source of bean definitions for the application context.
// @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings,other beans, and various property settings.
// @ComponentScan: Tells Spring to look for other components, configurations, and services in the com/example package, letting it find the controllers.
@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestServiceApplication.class, args);
	}

}
