package com.sohamglobal.mongodbrestapi14.model;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="films")
public class Film {
	
	private int filmid;
	private String filmname;
	private int releaseyear;
	private String genre;
	private String director;
	private List<String> starcast;
	private String music;
	private double imdbrating;
	
	public int getFilmid() {
		return filmid;
	}
	public void setFilmid(int filmid) {
		this.filmid = filmid;
	}
	public String getFilmname() {
		return filmname;
	}
	public void setFilmname(String filmname) {
		this.filmname = filmname;
	}
	public int getReleaseyear() {
		return releaseyear;
	}
	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public List<String> getStarcast() {
		return starcast;
	}
	public void setStarcast(List<String> starcast) {
		this.starcast = starcast;
	}
	public String getMusic() {
		return music;
	}
	public void setMusic(String music) {
		this.music = music;
	}
	public double getImdbrating() {
		return imdbrating;
	}
	public void setImdbrating(double imdbrating) {
		this.imdbrating = imdbrating;
	}
	

	

}
