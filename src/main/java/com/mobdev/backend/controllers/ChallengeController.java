package com.mobdev.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.mobdev.backend.services.ChallengeService;
import com.mobdev.backend.services.IChallenge;

@RestController
public class ChallengeController {
	
	@Autowired
	private IChallenge iChallenge;
	//private ChallengeService challengeService;	//En vez del service podria haber inyectado una interface aqui y asi se desacopla mas el codigo. Corregido

	
	RestTemplate restTemplate = new RestTemplate();

	public ChallengeController() {
	}

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

	@GetMapping("/getCharacterbyIds/{id}")	//la ruta no deberia tener el get, pero lo dejo para entender
	public String getCharacterbyIds(@PathVariable int id) {
		
		String uri = "https://rickandmortyapi.com/api/character/"+id;
		String result = restTemplate.getForObject(uri, String.class);
		
		return result;
	}
	
	//Mismo metodo de arriba pero con Service
	@GetMapping("/characterById/{id}")	
	public ResponseEntity<Object> getCharacterbyId(@PathVariable int id) {
		return iChallenge.getCharacterbyId(id);
	}
	
	@GetMapping("/locationById/{id}")
	public ResponseEntity<Object> getLocationbyId(@PathVariable int id) {
		return iChallenge.getLocations(id);
	}


}
