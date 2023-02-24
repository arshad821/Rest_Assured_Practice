package com.authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

//openweathermap.com problem in website so not getting desired op.
public class APIkeyAuthExample {


	//https://api.openweathermap.org/data/2.5/weather?q=exton&appid=ab9323419ef69575d2c7ef4aabf6438c
	@Test(enabled=false)
	public void apikeyauth() {
		RestAssured
		.given()
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather?q=exton&appid=1a1f0308f21cb89e7be2f51b507351d7")
		.prettyPrint(); 

	}
	//both methods are doing same work but this is good and preferred way..
	@Test(enabled=true)
	public void apikeysusingparams() {

		RestAssured
		.given()
		.queryParam("q", "Chennai")
		.queryParam("appid", "1a1f0308f21cb89e7be2f51b507351d7")
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather")
		.then()
		.log().body(); //pretty print and log is same 
	}

	
	@Test(enabled=false)
	public void apikeysusingheader() {

		RestAssured
		.given()
		.header("q", "Chennai")                //both are same but to know...
		.header("appid", "1a1f0308f21cb89e7be2f51b507351d7")
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather")
		.then()
		.log().body(); //pretty print and log is same 
	}
}
