package com.nonbdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEMployees {



	@Test(enabled = false)
	public void getallemployees() {


		//we are giving base uri
		RestAssured.baseURI= "https://reqres.in/";
		//we are giving req specification..
		RequestSpecification requestspecification =	RestAssured.given();
		//request() func will hit request and giving first paraametr as what type of method and second param. is path of base URL
		Response response = requestspecification.request(Method.GET, "api/users?page=2");
		//we cant print response by default so we are converting it to string
		System.out.println(response.asPrettyString());

		System.out.println(response.getStatusLine());
	}


	@Test(enabled=false)
	public void CreateAnemployee() {

		RestAssured.baseURI= "https://reqres.in/";
		//same as get method but here additionaly we are giving content type and json body
		RequestSpecification requestspecification =	
				RestAssured.given().header("Content-Type","application/json").
				body("{\r\n"
						+ "    \"name\": \"Arshad\",\r\n"
						+ "    \"job\": \"co-leader\"\r\n"
						+ "}");

		Response response = requestspecification.request(Method.POST, "api/users");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}

	@Test(enabled=false)
	public void UpdateAnEmployee() {

		RestAssured.baseURI="https://reqres.in/";

		RequestSpecification requestSpecification = RestAssured
				.given()
				.header("Content-Type", "application/json")
				.body("{\r\n"
						+ "    \"name\": \"ArshadArsh\",\r\n"
						+ "    \"job\": \"QA Engineer\"\r\n"
						+ "}");

		Response response =	requestSpecification.request(Method.PUT, "api/users/3");

		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());

	}
	
	@Test(enabled = false)
	public void DeleteEmployee() {

		RestAssured.baseURI="https://reqres.in/";

		RequestSpecification requestSpecification=  RestAssured.given();

		Response response =	requestSpecification.request(Method.DELETE,"api/users/2");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}
	
	@Test
	public void getSingleEmployee() {

		RestAssured.baseURI="https://reqres.in/";

		RequestSpecification requestSpecification=  RestAssured.given();

		Response response =	requestSpecification.request(Method.GET,"api/users/3");
		
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}

}
