package com.serializeAnnotation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonPropertySerializer {
	
	public static void main(String[] args) throws JsonProcessingException {


		JsonPropertyPoJO ser_employee = new JsonPropertyPoJO();
		ser_employee.setId(667);
		ser_employee.setName("Arsh");
		ser_employee.setEmail("kdjddh12@gmail.com");



		ObjectMapper mapper = new ObjectMapper();
		String employeejson =	mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ser_employee);
		System.out.println(employeejson);
	}
}
