package com.interviewconcepts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

//for interview purpose only 
public class RequestSpecBuilderExample {

	@Test
	public void ReqSpecBuilder() {

		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri("https://reqres.in/").setBasePath("api/users");
		RequestSpecification specification = builder.build(); // to change req spec builder to req spec..

		RestAssured
		.given()
		.spec(specification)
		.when()
		.get("/3")
		.prettyPrint();

//same as req sepcification but to know reqspec builder concept 
	}
}
