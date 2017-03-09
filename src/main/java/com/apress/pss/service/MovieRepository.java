package com.apress.pss.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.apress.pss.model.Movie;

public class MovieRepository {

	private Map<Long, Movie> movies = new ConcurrentHashMap<Long, Movie>();

	public MovieRepository() {

		Movie m1 = new Movie(14929l, "Arrival", new Date());
		Movie m2 = new Movie(14888l, "Jackie", new Date());
		Movie m3 = new Movie(1766l, "Lion", new Date());

		movies.put(m1.getId(), m1);
		movies.put(m2.getId(), m2);
		movies.put(m3.getId(), m3);

	}

	
	
	public List<Movie> getAll() {
		List<Movie> moviesList = new ArrayList<Movie>(movies.values());
		return moviesList;
	}
	
	
	public Movie get(Long id) {
		return movies.get(id);
	}

	public Long addMovie(String movieName) {
		Long id = System.currentTimeMillis();
		Movie m = new Movie(id, movieName, new Date());
		movies.put(id, m);
		return id;
	}
	
	public void deleteMovie(Long id){
		movies.remove(id);
	}

}
