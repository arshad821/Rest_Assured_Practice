package com.serializeAnnotation;

import java.util.Arrays;
import java.util.List;

import org.codehaus.groovy.ast.AnnotatedNode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializationAnnotationSerialization {

	public void jsonserialize() throws JsonProcessingException {

		JsonSerializerPOJO annotationSerialization = new JsonSerializerPOJO();
		annotationSerialization.setFirst_Name("Nazriya");
		annotationSerialization.setLast_Name("Fahad");
		annotationSerialization.setEmail("nazriyafahad@gmail.com");
		annotationSerialization.setSkills(Arrays.asList("Acting","Singing","Dancing"));
		
		Devices device = new Devices();
		device.setLaptop("Macbook Pro Max");
		device.setMobile("Apple Iphone 13");
		
		annotationSerialization.setDevices(device);

		ObjectMapper mapper = new ObjectMapper();
		String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(annotationSerialization);
		System.out.println(result);

	}

	public static void main(String[] args) throws JsonProcessingException {
		
		JsonSerializationAnnotationSerialization annotationSerialize = new JsonSerializationAnnotationSerialization();
		annotationSerialize.jsonserialize();



	}



}
