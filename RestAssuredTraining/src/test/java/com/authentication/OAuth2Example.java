package com.authentication;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class OAuth2Example {

	@Test
	public void oautheg() {

		String token = "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";  

		RestAssured
		.given()
		.auth()
		.oauth2(token)
		.when()
		.get("https://api.github.com/users/repos")
		.then()
		.log().body();

	}

}
