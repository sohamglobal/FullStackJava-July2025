package com.sohamglobal.classes;

public class Player {
	private String playerName;
	private int age;
	private String country;
	private String club;
	
	//to assign values to private fields -
	//1. parameterized contructor
	//2. setter methods of each field
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setClub(String club) {
		this.club = club;
	}
	//-----------
	
	public String getPlayerName() {
		return playerName;
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
	public String getClub() {
		return club;
	}
	
	
	
	
	

}
