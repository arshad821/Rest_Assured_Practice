package com.deserializeAnnotation;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class JacksonInjectDeserialize {

	public static void main(String[] args) throws IOException {

		String employjson= "{\r\n"
				+ "  \"email\" : \"kdjddh12@gmail.com\",\r\n"
				+ "  \"id\" : 6767\r\n"
				+ "}";

//inject value
		InjectableValues injectableValues = new InjectableValues.Std().addValue(String.class, "Arshad");
		ObjectMapper mapper = new ObjectMapper();
		//reading that injected value..
		ObjectReader reader=	mapper.reader(injectableValues);
		
		JacksonInjectPOJO pojo = 	reader.readValue(employjson, JacksonInjectPOJO.class);
		System.out.println(pojo.getId());
		System.out.println(pojo.getName());
		System.out.println(pojo.getEmail());

	}


}
