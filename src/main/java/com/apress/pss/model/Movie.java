package com.apress.pss.model;

import java.util.Date;

public class Movie {

	private Long id;
	private String name;
	private Date releaseDate;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public Movie(Long id, String name, Date releaseDate) {
		super();
		this.id = id;
		this.name = name;
		this.releaseDate = releaseDate;
	}

	
	
	
	
	
	
	
}
