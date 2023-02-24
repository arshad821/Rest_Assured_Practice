package com.bdd_style;

import java.io.File;
import java.util.List;

import org.testng.annotations.Test;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

import io.restassured.RestAssured;

public class GetAllEmployeesBDD {

	@Test(enabled = true)
	public void getallemployeesBDD() {

		RestAssured
		.given()
		.baseUri("https://reqres.in/")
		.when()
		.get("api/users?page=2")
		.prettyPrint(); // to print neatly as json format

		//Configuration configuration = Configuration.defaultConfiguration();

		//List<Object> result=	JsonPath.using(configuration).parse("api/users?page=2").read("$.data[*].id");
		//System.out.println(result);
	}

	@Test(enabled = false)
	public void createanemployeeBDD() {

		RestAssured
		.given()
		.baseUri("https://reqres.in/")
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"name\": \"Arsad\",\r\n"
				+ "    \"job\": \"coleader\"\r\n"
				+ "}")
		.when()
		.post("api/users")
		.prettyPrint();
	}

	@Test(enabled=false)
	public void updateanemployeeBDD() {

		RestAssured
		.given()
		.baseUri("https://reqres.in/")
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "    \"name\": \"Arsad\",\r\n"
				+ "    \"job\": \"Software developer\"\r\n"
				+ "}")
		.when()
		.put("api/users/687")
		.prettyPrint();
	}

	@Test(enabled = false)
	public void deleteanemployeeBDD() {
		RestAssured
		.given()
		.baseUri("https://reqres.in/")
		.when()
		.delete("api/users/912")
		.prettyPrint();
	}

	@Test(enabled = false)
	public void createanemployeefromJSONfileBDD() {

		File jsonFile = new File("PostData.json");
		RestAssured
		.given()
		.baseUri("https://reqres.in/")
		.header("Content-Type","application/json")
		.body(jsonFile)
		.when()
		.post("api/users")
		.prettyPrint();

	}

}
