package com.mobdev.backend.models;

public class CharacterModel {
	
	int id;
	String name;
	String status;
	String species;
	String type;
	int episodeCount;
	OriginPlanet origin;
	
	
	public CharacterModel(int id, String name, String status, String species, String type, int episodeCount,
			OriginPlanet origin) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
		this.species = species;
		this.type = type;
		this.episodeCount = episodeCount;
		this.origin = origin;
	}


	public CharacterModel() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getSpecies() {
		return species;
	}


	public void setSpecies(String species) {
		this.species = species;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getEpisodeCount() {
		return episodeCount;
	}


	public void setEpisodeCount(int episodeCount) {
		this.episodeCount = episodeCount;
	}


	public OriginPlanet getOrigin() {
		return origin;
	}


	public void setOrigin(OriginPlanet origin) {
		this.origin = origin;
	}


}
