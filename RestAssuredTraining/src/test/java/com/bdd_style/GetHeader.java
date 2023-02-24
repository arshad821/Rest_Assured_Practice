package com.bdd_style;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class GetHeader {
	//imp IQ to check header
	@Test
	public void getheader() {

		RequestSpecification requestspecifcation =	RestAssured
				.given()
				.baseUri("https://reqres.in/")
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"name\": \"Arsad\",\r\n"
						+ "    \"job\": \"coleader\"\r\n"
						+ "}");

		Response response =	requestspecifcation.post("api/users");


         //by using specificationQuerier class and query() we can get headers //important
		QueryableRequestSpecification queryableRequestSpecification = SpecificationQuerier.query(requestspecifcation);
		System.out.println(queryableRequestSpecification.getHeaders());
		System.out.println(queryableRequestSpecification.getBaseUri());


	}

}
