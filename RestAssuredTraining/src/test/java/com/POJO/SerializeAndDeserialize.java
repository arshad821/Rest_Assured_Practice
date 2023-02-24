package com.POJO;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class SerializeAndDeserialize {
	
	
	ObjectMapper mapper = new ObjectMapper();
	XmlMapper xmlmap = new XmlMapper(); //xml format
	
	
	public void serialize() throws JsonProcessingException {
		
		Employee employee1 = new Employee();
		employee1.setFirst_name("Mohamed Arshad ");
		employee1.setLast_name("Kaleeth");
		employee1.setEmail("arshadarsh98@gmail.com");
		employee1.setSkills(Arrays.asList("Java", "selenium", "TestNG"));

		//important interview qns...
	
		String employee1detailsformatedinjson =	mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);
		System.out.println(employee1detailsformatedinjson);
		System.out.println("********************************");
		
		
		String employee1detailsformatedinxml =	xmlmap.writerWithDefaultPrettyPrinter().writeValueAsString(employee1);
		System.out.println(employee1detailsformatedinxml);
		System.out.println("********************************");
		
		
	}

	public void desrialize() throws JsonMappingException, JsonProcessingException {
		
		String empjson= "{\r\n"
				+ "  \"email\" : \"arshadarsh98@gmail.com\",\r\n"
				+ "  \"skills\" : [ \"Java\", \"selenium\", \"TestNG\" ],\r\n"
				+ "  \"first_name\" : \"Mohamed Arshad \",\r\n"
				+ "  \"last_name\" : \"Kaleeth\"\r\n"
				+ "}";
		Employee employee = 	mapper.readValue(empjson, Employee.class);
		System.out.println(employee.getEmail());
		System.out.println(employee.getFirst_name());
		System.out.println(employee.getLast_name());
		System.out.println(employee.getSkills());
		System.out.println("********************************");
		
	}


	public static void main(String args[]) throws JsonProcessingException {


		SerializeAndDeserialize serialandDeserialize = new SerializeAndDeserialize();
		serialandDeserialize.serialize();
		serialandDeserialize.desrialize();
	}
}
