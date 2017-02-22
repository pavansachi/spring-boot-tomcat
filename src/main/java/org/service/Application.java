package org.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author pavansachi
 *
 */

@SpringBootApplication
@ComponentScan(basePackages={"org.controllers"})
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);		
	}

}