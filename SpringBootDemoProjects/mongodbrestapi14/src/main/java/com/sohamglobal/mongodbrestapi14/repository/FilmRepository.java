package com.sohamglobal.mongodbrestapi14.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sohamglobal.mongodbrestapi14.model.Film;

@Repository
public interface FilmRepository extends MongoRepository<Film, Integer> {

	List<Film> findByReleaseyear(int releaseyear);
	Film findByFilmid(int filmid);
}
