package com.serializeAnnotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRawValueSerializer {
	
	public static void main(String [] args) throws JsonProcessingException {
	
	JsonRawValuePOJO rawser = new JsonRawValuePOJO();
	rawser.setId(78867);
	rawser.setName("Arsh");
	rawser.setEmail("kdjddh12@gmail.com");
	



	ObjectMapper mapper = new ObjectMapper();
	String employeejson =	mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rawser);
	System.out.println(employeejson);

}}
