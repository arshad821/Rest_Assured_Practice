package com.serializeAnnotation;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGetterSerialization {

	public static void main(String[] args) throws JsonProcessingException {


		JsonGetterPOJO ser_employee = new JsonGetterPOJO();
		ser_employee.setId(6767);
		ser_employee.setName("Arsh");
		ser_employee.setEmail("kdjddh12@gmail.com");



		ObjectMapper mapper = new ObjectMapper();
		String employeejson =	mapper.writerWithDefaultPrettyPrinter().writeValueAsString(ser_employee);
		System.out.println(employeejson);

	}

}
