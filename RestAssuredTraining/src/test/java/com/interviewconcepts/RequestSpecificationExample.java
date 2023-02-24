package com.interviewconcepts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationExample {


	RequestSpecification reqspec;

	@BeforeTest                   //just simplyfiying the code by giving single baseuri and basepath
	public void SetupReqSpecif() {
		reqspec =	RestAssured
				.with()                                //we can use given also both are same..
				.baseUri("https://reqres.in/")
				.basePath("api/users");
	}

	@Test(enabled=true)
	public void getallemployeesBDD() {

		RestAssured
		.given()
		.spec(reqspec)     //accesing that baseuri through .spec() funct.
		.when()
		.get("?page=2")
		.prettyPrint(); 
	}

	@Test(enabled=true)
	public void getSingleEmployee() {

		RestAssured
		.given()
		.spec(reqspec)
		.when()
		.get("/3")
		.prettyPrint(); 
	}




}
