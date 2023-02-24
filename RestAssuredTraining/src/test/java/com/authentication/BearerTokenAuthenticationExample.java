package com.authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BearerTokenAuthenticationExample {
	
	@Test
	public void bearertokenAuth() {
		
		String token = "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";  //from my github website
		
		RestAssured
		.given()
		.header("Authentication" , "Bearer "+token)  //this line based on postman..
		.when()
		.get("https://api.github.com/users/repos")
		.then()
		.log().body();
	}

}
