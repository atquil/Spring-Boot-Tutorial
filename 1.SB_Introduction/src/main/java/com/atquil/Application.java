package com.atquil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication - it is the entry point of the application
 *   - @Configure : look for bean files (Employee pojo : Name , Age , id)
 *     @EnableAutoConfiguration: Load the bean on configuration
 *     @ComponentScan: it will tell the application to look for diff components like @controller  
 * 
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Hi this is Spring Boot App");
		
		
	}

}
