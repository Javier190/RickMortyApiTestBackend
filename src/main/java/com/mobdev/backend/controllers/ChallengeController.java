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
	
	RestTemplate restTemplate = new RestTemplate();
	
	@RequestMapping("/hello")
	public String testHello() {
		return "Metodo de prueba";
	}
	
	@RequestMapping("/getAllCharacters")
	public String getAllCharacters() {
		
		String uri = "https://rickandmortyapi.com/api/character";
		String result = restTemplate.getForObject(uri, String.class);
		
		return result;
		
	}

	@GetMapping("/getCharacterbyIds/{id}")
	public String getCharacterbyIds(@PathVariable int id) {
		
		String uri = "https://rickandmortyapi.com/api/character/"+id;
		String result = restTemplate.getForObject(uri, String.class);
		
		return result;
	}
	
	//Mismo metodo de arriba pero llamando service
	@GetMapping("/characterById/{id}")
	public ResponseEntity<Object> getCharacterbyId(@PathVariable int id) {
		return challengeService.getCharacterbyId(id);
	}
	
	@GetMapping("/locationById/{id}")
	public ResponseEntity<Object> getLocationbyId(@PathVariable int id) {
		return challengeService.getLocations(id);
	}

	

}
