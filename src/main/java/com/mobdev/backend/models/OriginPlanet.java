package com.mobdev.backend.models;

public class OriginPlanet {
	
	String planetName;
	String planetUrl;
	String dimension;
	String [] residentCharUrl;
	
	
	public OriginPlanet(String planetName, String planetUrl, String dimension, String[] residentCharUrl) {
		
		this.planetName = planetName;
		this.planetUrl = planetUrl;
		this.dimension = dimension;
		this.residentCharUrl = residentCharUrl;
	}


	public OriginPlanet() {
		
	}


	public String getPlanetName() {
		return planetName;
	}


	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}


	public String getPlanetUrl() {
		return planetUrl;
	}


	public void setPlanetUrl(String planetUrl) {
		this.planetUrl = planetUrl;
	}


	public String getDimension() {
		return dimension;
	}


	public void setDimension(String dimension) {
		this.dimension = dimension;
	}


	public String[] getResidentCharUrl() {
		return residentCharUrl;
	}


	public void setResidentCharUrl(String[] residentCharUrl) {
		this.residentCharUrl = residentCharUrl;
	}
	
	
	
	
	
	
	
	

}
