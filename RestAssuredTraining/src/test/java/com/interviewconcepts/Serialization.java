package com.interviewconcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Serialization {
	
	//assume that data is obtained
	@Test
	public void serialization() {
		
		
		Map<String, Object> jsonBody= new LinkedHashMap<String, Object>();
		
		jsonBody.put("First-Name", "Mohamed Arshad ");
		jsonBody.put("Last_Name", "Kaleeth");
		jsonBody.put("email", "Arshad1234@gmail.com");
		
		//its preferred to add (mao,list,set) in starting of the method
		List<String> skills = new LinkedList<String>();
		skills.add("Java");
		skills.add("Cucumber");
		skills.add("Selenium");
		//since put() will accept only string we changing map value to Object.(i.e) Java Object can accept all datatypes.
		jsonBody.put("Skills", skills);
		
		//it will print in Java map format but we need it in Json file format so this is not correct video..
		System.out.println(jsonBody);
		
		RestAssured
		.given()
		   .baseUri("https://reqres.in/")
		   .header("Content-Type", "application/json")
		.body(jsonBody)
		   .log().all()   // it will print all details which happen in request side
		.when()
		   .post("api/users")
		.then()
		   .log().all();  // it will print all details which happen in response side
		
		//it will result in illegal state exception since java object cant be converted to json
		//for that jackson dependency is added in "pom.xml" now automatically converted.
		
		
	}

}
