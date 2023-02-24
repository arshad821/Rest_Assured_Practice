package com.interviewconcepts;

import io.restassured.RestAssured;

public class DefaultHostAndPort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured
		.given()
		.log()
		.all()
		.when()
		.get();
  //by default if we dont give any uri means RA will go to "localhost:8080"
		//imp IQ
	}

}
