package com.sohamglobal.mongodbrestapi14.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sohamglobal.mongodbrestapi14.model.Film;
import com.sohamglobal.mongodbrestapi14.service.FilmService;

@RestController
@RequestMapping("/film")
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
	@GetMapping("/all")
	public List<Film> allFilms()
	{
		return filmService.getAllFilms();
	}
	
	@PostMapping("/add")
	public Film addFilm(@RequestBody Film film)
	{
		return filmService.addNewFilm(film);
	}
	
	@GetMapping("/search/{relyr}")
	public List<Film> searchFilms(@PathVariable("relyr") int relyr)
	{
		return filmService.searchFilmOnYear(relyr);
	}

}
