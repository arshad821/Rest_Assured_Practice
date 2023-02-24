package com.interviewconcepts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;


//this example is same as Req.Spec.Example we are simplifying code by adding additional methods
public class RequestSepcModifiedExample {    
	
	RequestSpecification reqspec;

	@BeforeTest                  
	public void SetupReqSpecif() {
		reqspec =	RestAssured
				.with()                            
				.baseUri("https://reqres.in/")
				.basePath("api/users");
		
		RestAssured.requestSpecification=reqspec;  //this line will spcifiy default req. spec. and sent with each request.
	}

	@Test(enabled=true)
	public void getallemployeesBDD() {

		RestAssured
		.given()          //here we are not giving .spec(); bcoz by default req.sepc. will work 
		.when()
		.get("?page=2")
		.prettyPrint(); 
	}

	@Test(enabled=true)
	public void getSingleEmployee() {

		RestAssured
		.given()
		.when()
		.get("/3")
		.prettyPrint(); 
	}
	@Test
	public void createanemployeeBDD() {
		//explicitly adding req spec for this method so that req spec wont work in this method.
		RequestSpecification specification = RestAssured
		.given()
		.baseUri("https://reqres.in/")
		.basePath("api/users")
		.contentType(ContentType.JSON);

		RestAssured
		.given()
		.spec(specification)
		.body("{\r\n"
				+ "    \"name\": \"Arsad\",\r\n"
				+ "    \"job\": \"coleader\"\r\n"
				+ "}")
		.when()
		.post()
		.prettyPrint();
	}
	
	

}
