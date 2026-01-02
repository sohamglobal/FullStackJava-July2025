package com.sohamglobal.mongodbrestapi14.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sohamglobal.mongodbrestapi14.model.Film;
import com.sohamglobal.mongodbrestapi14.repository.FilmRepository;

@Service
public class FilmService {
	
	@Autowired
	private FilmRepository filmRepo;
	
	public List<Film> getAllFilms()
	{
		return filmRepo.findAll();
	}
	
	public Film addNewFilm(Film film)
	{
		return filmRepo.save(film);
	}
	
	public List<Film> searchFilmOnYear(int relyr)
	{
		return filmRepo.findByReleaseyear(relyr);
	}

}
