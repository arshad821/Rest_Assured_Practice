package com.serializeAnnotation;

import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnoreserialize {

	public void jsonignore() throws JsonProcessingException {


		JsonIgnorePOJO ignorePOJO = new JsonIgnorePOJO();
		ignorePOJO.setId(123);
		ignorePOJO.setName(null);  //json inlcude willl ignore this..
		ignorePOJO.setEmail("Arshadarsh08@gmail.com");
		ignorePOJO.setAge(0);

		Date date = new Date();
		ignorePOJO.setDateofbirth(date);

		ObjectMapper mapper = new ObjectMapper();
		String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ignorePOJO);
		System.out.println(result);


	}

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub

		JsonIgnoreserialize ignoreserialize = new JsonIgnoreserialize();
		ignoreserialize.jsonignore();



	}

}
