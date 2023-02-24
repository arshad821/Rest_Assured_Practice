package com.deserializeAnnotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonCreaterDeserialier {
	
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		String employjson= "{\r\n"
				+ "  \"name\" : \"Arsh\",\r\n"
				+ "  \"email\" : \"kdjddh12@gmail.com\",\r\n"
				+ "  \"Employee_id\" : 6767\r\n"
				+ "}";

		ObjectMapper mapper = new ObjectMapper();
		JsonCreatorPOJO pojo = 	mapper.readValue(employjson, JsonCreatorPOJO.class);
		System.out.println(pojo.getId());
		System.out.println(pojo.getName());
		System.out.println(pojo.getEmail());
		
	}

}
