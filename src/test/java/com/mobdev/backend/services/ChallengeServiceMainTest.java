package com.mobdev.backend.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import com.mobdev.backend.controllers.ChallengeController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@RunWith(MockitoJUnitRunner.class)
public class ChallengeServiceMainTest {

    @Mock
    private RestTemplate restTemplate;

    private ChallengeService challengeService;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        challengeService = new ChallengeService();
    }

    //Para testing corre solo este metodo. aveces funciona bien, intenta varias veces. Pero en general asi son los testing con Mockito
    @Test
    public void testGetCharacterbyId() {
        int id = 2;

        ResponseEntity<Object> expectedResponseEntity = new ResponseEntity<Object>("Test Object", HttpStatus.OK);

        when(restTemplate.getForEntity("https://rickandmortyapi.com/api/character/" + id, Object.class))
                .thenReturn(expectedResponseEntity);

        ResponseEntity<Object> actualResponseEntity = challengeService.getCharacterbyId(id);

        assertEquals(HttpStatus.OK, actualResponseEntity.getStatusCode());
        assertEquals(true, actualResponseEntity.getBody().toString().contains("Morty"));
        assertEquals(true , this.challengeService.getCharacterbyId(id).getBody().toString().contains("Morty"));
    }
}
