package com.deserializeAnnotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnySetterdeserialize {

	public void Jsonanysetter() throws JsonMappingException, JsonProcessingException {


		String empjson= "{\r\n"
				+ "  \"email\" : \"arshadarsh98@gmail.com\",\r\n"
				+ "  \"skills\" : [ \"Java\", \"selenium\", \"TestNG\" ],\r\n"
				+ "  \"first_name\" : \"Mohamed Arshad \",\r\n"
				+ "  \"last_name\" : \"Kaleeth\"\r\n"
				+ "}";

		ObjectMapper mapper = new ObjectMapper();
		JsonAnySetterPOJO pojo = 	mapper.readValue(empjson, JsonAnySetterPOJO.class);
		System.out.println(pojo.getEmployee());


	}




	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		JsonAnySetterdeserialize anySetterdeserialize = new JsonAnySetterdeserialize();
		anySetterdeserialize.Jsonanysetter();

	}

}
