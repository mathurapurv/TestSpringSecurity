package com.apress.pss.terrormovies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.apress.pss.service.MovieRepository;

@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	
	
	private MovieRepository repository = new MovieRepository();
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/listMovies")
	public String listMovies(Model model){
		model.addAttribute("movies", repository.getAll());
		return "movies";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/createMovie")
	@ResponseBody
	public String createMovie(@RequestBody String movie) {
		System.out.println("Adding movie!! " + movie);
		repository.addMovie(movie);
		return "created";
	}

}
