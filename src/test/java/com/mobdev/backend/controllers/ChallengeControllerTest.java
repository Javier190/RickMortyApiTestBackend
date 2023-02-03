package com.mobdev.backend.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.mobdev.backend.services.ChallengeService;

class ChallengeControllerTest {
	
	@Autowired
	ChallengeService challengeService;

	@Test
	void helloTest() {
		
		int val1 = 3;
		int val2 = 9;
		
		assertEquals(12, val1+val2);
	}
	
	@Test
	void testGetCharacterbyIdMorty() {
		
		challengeService = new ChallengeService();
	
		assertEquals(true, this.challengeService.getCharacterbyId(2).getBody().toString().contains("Morty"));	
	}
	
	@Test
	void testGetCharacterbyJerry() {
		
		challengeService = new ChallengeService();
		
		assertEquals(true, this.challengeService.getCharacterbyId(5).getBody().toString().contains("Jerry Smith"));	
	}

}
