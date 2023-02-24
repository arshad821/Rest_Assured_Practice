package com.POJO.complexjson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializer {

	public static void main(String[] main) throws IOException {

		SuperHeroMoviesandTVSeries heroMoviesandTVSeries = new SuperHeroMoviesandTVSeries();
		heroMoviesandTVSeries.setCategory("Super Hero Movies And TV Shows");	
		heroMoviesandTVSeries.setAcceptedfranchise(Arrays.asList("DC","Marvel"));
		heroMoviesandTVSeries.setGenres(Arrays.asList("Action","Adventure","Dark","Funny","horror","Heroic"));


		Movies batman = new Movies();
		batman.setTitle("Batman:The Dark Knight");
		batman.setYear(2008);
		batman.setCast(Arrays.asList("Christ Bale","Heath Ledger"));

		Movies justiceleage = new Movies();
		justiceleage.setTitle("Justice League:Synder Cut");
		justiceleage.setYear(2021);
		justiceleage.setCast(Arrays.asList("Henry Cavill","Gal Gadot"));

		Movies avengers = new Movies();
		avengers.setTitle("The Avengers");
		avengers.setYear(2012);
		avengers.setCast(Arrays.asList("Iron Man","Peter Parker"));



		Movies ultron = new Movies();
		ultron.setTitle("Avengers:Age of Ultron");
		ultron.setYear(2015);
		ultron.setCast(Arrays.asList("Robert Downey Jr","Chris Evans"));

		heroMoviesandTVSeries.setMovies(Arrays.asList(batman,justiceleage,avengers,ultron));


		TVSeries flash = new TVSeries();
		flash.setTitle("Flash");
		flash.setYear(2014);

		TVSeries gotham = new TVSeries();
		gotham.setTitle("Gotham");
		gotham.setYear(2014);

		TVSeries supergirl = new TVSeries();
		supergirl.setTitle("SuperGirl");
		supergirl.setYear(2015);

		heroMoviesandTVSeries.setTvseries(Arrays.asList(flash,gotham));


		other otherdetail = new other();
		otherdetail.setCountry("Only USA");
		otherdetail.setLanguage("English");

		heroMoviesandTVSeries.setOtherdetails(otherdetail);


		ObjectMapper mapper = new ObjectMapper();
		String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(heroMoviesandTVSeries);
		System.out.println(result);
		//also we are writing it in a file
		File superjson = new File("Complex.json");
		mapper.writerWithDefaultPrettyPrinter().writeValue(superjson, heroMoviesandTVSeries);

	}

}
