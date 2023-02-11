package com.mobdev.backend.services;

import org.springframework.http.ResponseEntity;

public interface IChallenge {
	
	public ResponseEntity<Object> getCharacterbyId(int id);
	
	public ResponseEntity<Object> getLocations(int id);

}
