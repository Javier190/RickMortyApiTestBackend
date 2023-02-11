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

//Como feedback:
//faltaria agregar las URL en un archivo local.properties pero nose si debo crearlo y donde. Pend
//Mostrar el catch como feed para el cliente, no solo una impresion x consola. Pero filo con esto. 
//Corregido lo de inyectar Interface en vez del servicio directo. Inyectar interfaz es algo mas generico y mejor que una clase concreta como un service
//Esta prueba consistia en una consulta doble o llamada doble a la API una para el personaje, y otra para la locacion. No quise ver mas de esto porque obviamente ya quede fuera del proceso,
//pero aun asi considerlo comentarlo.

//Para arranque instale java 19.0.2 aqui y cree el proyecto de la pagina springboot con la ayuda del video de Udemy del Guzman.
//rutas postman http://localhost:8080/characterById/1
//              http://localhost:8080/locationById/1