package com.mobdev.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mobdev.backend.services.ChallengeService;

@RestController
public class ChallengeController {
	
	@Autowired
	ChallengeService challengeService;
	
	@RequestMapping("/hello")
	public String testHello() {
		return "Metodo de prueba funciona!";
	}
	
	@RequestMapping("/getAllCharacters")
	public String getAllCharacters() {
		
		String uri = "https://rickandmortyapi.com/api/character";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		
		return result;
		
	}
	//Este funciona pero no es buen practica
	@GetMapping("/getCharacterbyIds/{id}")
	public String getCharacterbyIds(@PathVariable int id) {
		
		String uri = "https://rickandmortyapi.com/api/character/"+id;
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(uri, String.class);
		
		return result;
	}
	
	
	
	//reemplazando por servicio
	@GetMapping("/getCharacterbyId/{id}")
	public ResponseEntity<Object> getCharacterbyId(@PathVariable int id) {
		return challengeService.getCharacterbyId(id);
	}

	

}