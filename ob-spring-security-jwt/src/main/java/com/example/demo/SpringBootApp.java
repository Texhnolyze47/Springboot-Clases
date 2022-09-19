package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase punto de entrada app Spring Boot
 */
@SpringBootApplication
public class SpringBootApp {

	/**
	 * Metodo main punto de entrada
	 * @param args
	 */

	public static void main(String[] args) {
		// contenedor de beans
		SpringApplication.run(SpringBootApp.class, args);
	}

}
