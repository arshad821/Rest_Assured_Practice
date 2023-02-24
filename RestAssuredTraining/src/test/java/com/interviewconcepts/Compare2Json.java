package com.interviewconcepts;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

//very very imp iQ
public class Compare2Json {

	public void comparejson() throws JsonMappingException, JsonProcessingException {

		String json1 = "{\r\n"
				+ "    \"name\": \"Arsad\",\r\n"
				+ "    \"job\": \"Software developer\"\r\n"
				+ "}";


		String json2 = "{\r\n"
				+ "    \"name\": \"Arsad\",\r\n"
				+ "    \"job\": \"Software developer\"\r\n"
				+ "}";

		ObjectMapper mapper = new ObjectMapper();
		JsonNode jsonnode1=	mapper.readTree(json1);

		JsonNode jsonnode2 = mapper.readTree(json2);

		System.out.println(jsonnode1.equals(jsonnode2));

		//in root level order doesnt matter - return true;
		//in array if order not same means it will return false
	}

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		Compare2Json compare2Json = new Compare2Json();
		compare2Json.comparejson();


	}

}
