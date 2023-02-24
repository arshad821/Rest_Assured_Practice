package com.serializeAnnotation;import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonFormat.Feature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonRootvalueserialization {


	public void Jsonrootseialization() throws JsonProcessingException {

		JsonRootValueAnnotationPOJO rootannotationPOJO  = new JsonRootValueAnnotationPOJO();
		rootannotationPOJO.setId(2143925);
		rootannotationPOJO.setName("Arshad");
		rootannotationPOJO.setPlace("Coimabatore");
		rootannotationPOJO.setSkills(Arrays.asList("Selenium","JAVA"));


		ObjectMapper mapper = new ObjectMapper();
		
		mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);//will give json root name
		
		String employejson=	mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootannotationPOJO);
		System.out.println(employejson);




	}

	public static void main(String[] args) throws JsonProcessingException {
 
		JsonRootvalueserialization jsonRootvalueserialization = new JsonRootvalueserialization();
		jsonRootvalueserialization.Jsonrootseialization();


		

	}

}
