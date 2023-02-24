package com.interviewconcepts;

import java.util.Map;

import com.POJO.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class Deserialization {

	String Json="{\r\n"
			+ "  \"email\" : \"arshadarsh98@gmail.com\",\r\n"
			+ "  \"skills\" : [ \"Java\", \"selenium\", \"TestNG\" ],\r\n"
			+ "  \"last_name\" : \"Kaleeth\",\r\n"
			+ "  \"first_name\" : \"Mohamed Arshad \"\r\n"
			+ "}";


	public void deserialUsingObjectMapper() throws JsonMappingException, JsonProcessingException {



		ObjectMapper mapper = new ObjectMapper();
		//we are mapping this json file to employee class in pojo package
		Employee employee = 	mapper.readValue(Json, Employee.class);

		System.out.println(employee.getEmail());
		System.out.println(employee.getFirst_name());
		System.out.println(employee.getLast_name());
		System.out.println(employee.getSkills());
		System.out.println("********************************");
	}

	public void UsingJawayJsonPath() {

		//JMP is used to map json to pojo class
		JacksonMappingProvider mappingProvider = new JacksonMappingProvider();

		Configuration configuration = Configuration.defaultConfiguration();

		Configuration configuration2 =	configuration.mappingProvider(mappingProvider);

		Employee employee =	JsonPath.using(configuration2).parse(Json).read("$",Employee.class);

		System.out.println(employee.getEmail());
		System.out.println(employee.getFirst_name());
		System.out.println(employee.getLast_name());
		System.out.println(employee.getSkills());
		System.out.println("********************************");

	}

	public void UsingRestAssuredjsonPath() {

		//since we are using RAJP only for this method its showing like this
		io.restassured.path.json.JsonPath jsonpath = io.restassured.path.json.JsonPath.from(Json);

		Employee employee = 	jsonpath.getObject("$", Employee.class);

		System.out.println(employee.getEmail());
		System.out.println(employee.getFirst_name());
		System.out.println(employee.getLast_name());
		System.out.println(employee.getSkills());
		System.out.println("********************************");
	}

	public void UsingAsFunction() {

		Map<String, Object> response =	RestAssured
				.given()
				.baseUri("https://reqres.in/")
				.when()
				.get("api/users/7")
				.then()
				.extract()
				.as(new TypeRef <Map<String,Object>>() {
				}); //important line to remember imp IQ
		
		System.out.println(response);
		System.out.println(response.get("first_name"));
		System.out.println(response.get("lasst_name"));  //problem in website so its printing null
		System.out.println(response.get("email"));    //if we vant single value means by giving key name we can get that.
		System.out.println("********************************");
	}


	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		Deserialization deserialization = new Deserialization();
		deserialization.deserialUsingObjectMapper();
		deserialization.UsingJawayJsonPath();
		deserialization.UsingRestAssuredjsonPath();
		deserialization.UsingAsFunction();


	}

}
