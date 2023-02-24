package com.validatingjsonschema;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;



public class RestAssuredJsonschemavalidation {
	
	@Test(enabled = false)
	public void JsonschemavalidationByclaspath() {
		
		File inputJson = new File("src/test/resources/input.json");
		
		RestAssured
		.given()
		.baseUri("https://reqres.in/")
		.header("Content-Type", "application/json")
		.body(inputJson)
		.when()
		.post("api/users")
		.then()                    //matchesJsonSchemaInClasspath() method will be used only if Schema file is available under resources folder..
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schema.json"));
		
	}
	@Test
	public void jsonschemavalidationbyfile() {
		
		File inputjson = new File("src/test/resources/input.json");
		File Schemajson = new File("src/test/resources/Schema.json"); //assume we storing file in outside project
		
		
		RestAssured
		.given()
		.baseUri("https://jsonplaceholder.typicode.com/")
		.header("Content-Type", "application/json")
		.body(inputjson)
		.when()
		.post("/posts")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(Schemajson));
		//desired result is not gtting but its working fine problem is in the wbesite..
	}

}
