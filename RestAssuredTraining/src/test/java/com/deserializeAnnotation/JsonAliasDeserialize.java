package com.deserializeAnnotation;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAliasDeserialize {
	
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		String employjson= "{\r\n"
				+ "  \"name\" : \"Arsh\",\r\n"
				+ "  \"email\" : \"kdjddh12@gmail.com\",\r\n"
				+ "  \"Employee_id\" : 6767\r\n"
				+ "}";

		ObjectMapper mapper = new ObjectMapper();
		JsonAliasPOJO pojo = 	mapper.readValue(employjson, JsonAliasPOJO.class);
		System.out.println(pojo.getId());
		
		
		
	}

}
