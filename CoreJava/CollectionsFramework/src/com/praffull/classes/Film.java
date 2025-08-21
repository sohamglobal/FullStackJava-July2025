package com.praffull.classes;

public class Film {
	private String filmName;
	private int releaseYear;
	private String genre;
	private String language;
	private double imdbRating;
	
	public Film(String filmName, int releaseYear, String genre, String language, double imdbRating) {
		super();
		this.filmName = filmName;
		this.releaseYear = releaseYear;
		this.genre = genre;
		this.language = language;
		this.imdbRating = imdbRating;
	}

	@Override
	public String toString() {
		return "Film [filmName=" + filmName + ", releaseYear=" + releaseYear + ", genre=" + genre + ", language="
				+ language + ", imdbRating=" + imdbRating + "]";
	}

	public String getFilmName() {
		return filmName;
	}
	
	
	
	

}
