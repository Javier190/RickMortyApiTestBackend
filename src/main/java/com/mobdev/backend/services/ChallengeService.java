package com.mobdev.backend.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ChallengeService implements IChallenge {
	
	
	public ResponseEntity<Object> getCharacterbyId(int id) {
		
		String uri = "https://rickandmortyapi.com/api/character/"+id; //esto podria ir en un archivo de local.properties
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
			//aqui falta evaluar como manejar la excepcion pero no por consola, para que el cliente sepa que paso.
			System.err.println("Request Failed");
		}
		
		return result;
		
	}

	public String simulaService (int id){
		return "";
	}
	
	
public ResponseEntity<Object> getLocations(int id) {
		
		String uri = "https://rickandmortyapi.com/api/location/"+id;
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
			//retornar un feedback al usuario que algo paso
		}
		
		return result;
		
	}
	
	
	
	
	

}
