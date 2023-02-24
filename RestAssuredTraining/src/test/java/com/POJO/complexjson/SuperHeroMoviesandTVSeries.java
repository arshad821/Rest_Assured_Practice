package com.POJO.complexjson;

import java.util.List;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class SuperHeroMoviesandTVSeries {


	private String category;
	private List<String> acceptedfranchise;
	private List<String> genres;
	private List<Movies> movies;
	private List<TVSeries> tvseries;
	private other otherdetails;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public List<String> getAcceptedfranchise() {
		return acceptedfranchise;
	}
	public void setAcceptedfranchise(List<String> acceptedfranchise) {
		this.acceptedfranchise = acceptedfranchise;
	}
	public List<String> getGenres() {
		return genres;
	}
	public void setGenres(List<String> genres) {
		this.genres = genres;
	}
	public List<Movies> getMovies() {
		return movies;
	}
	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}
	public List<TVSeries> getTvseries() {
		return tvseries;
	}
	public void setTvseries(List<TVSeries> tvseries) {
		this.tvseries = tvseries;
	}
	public other getOtherdetails() {
		return otherdetails;
	}
	public void setOtherdetails(other otherdetails) {
		this.otherdetails = otherdetails;
	}







}
