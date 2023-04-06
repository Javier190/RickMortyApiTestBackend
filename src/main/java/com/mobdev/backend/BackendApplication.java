package com.mobdev.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
		System.out.println("Hello World");
		 
	}
}


//En java 19.0.2. Proyecto creado desde la pagina springboot con la Clases de A. Guzman
//Rutas raw postman http://localhost:8080/characterById/1
//              http://localhost:8080/locationById/1