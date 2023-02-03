package com.mobdev.backend.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ChallengeService {
	
	
	public ResponseEntity<Object> getCharacterbyId(int id) {
		
		String uri = "https://rickandmortyapi.com/api/character/"+id;
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Object> result = null;
		
		try {
			
			result = restTemplate.getForEntity(uri, Object.class);
			
			if (result.hasBody() && result.getStatusCode() == HttpStatus.OK ) {
				
				return result;
			} else {
				System.err.println("Conection failed" + result.getStatusCode());
				return null;
			}
			
		} catch (Exception e) {
			System.err.println("Request Failed");
		}
		
		return result;
		
	}
	

}
