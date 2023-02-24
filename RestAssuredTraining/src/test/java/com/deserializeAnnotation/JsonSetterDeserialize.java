package com.deserializeAnnotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSetterDeserialize {
	
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		String employjson= "{\r\n"
				+ "  \"name\" : \"Arsh\",\r\n"
				+ "  \"email\" : \"kdjddh12@gmail.com\",\r\n"
				+ "  \"Employee_id\" : 6767\r\n"
				+ "}";

		ObjectMapper mapper = new ObjectMapper();
		JsonSetterPOJO pojo = 	mapper.readValue(employjson, JsonSetterPOJO.class);
		System.out.println(pojo.getId());
		
		
		
	}

}
