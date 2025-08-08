package com.sharayu.revision;

//Every java class internally inherits a class "Object"
public class Country {
	private int countryCode;
	private String continent;
	private String countryName;
	private String language;
	private double population;
	
	public Country(int countryCode, String continent, String countryName, String language, double population) {
		super();
		this.countryCode = countryCode;
		this.continent = continent;
		this.countryName = countryName;
		this.language = language;
		this.population = population;
	}

	public int getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}
	
	
	
	
	
	

}
