package com.serializeAnnotation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnyGetterSerialization {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub

		JsonAnyGetterPOJO anyGetterPOJO = new JsonAnyGetterPOJO();

		Map<String, Object> mapvalues = new LinkedHashMap<String, Object>();
		mapvalues.put("first_name", "Dulqar");
		mapvalues.put("Last_name", "Salman");
		mapvalues.put("email", "msknxkwnd@gmail.com");
		mapvalues.put("Skills", Arrays.asList("Python","Rest Assured"));

		anyGetterPOJO.setEmployeeproperties(mapvalues);

		ObjectMapper mapper = new ObjectMapper();
		String employejson =	mapper.writerWithDefaultPrettyPrinter().writeValueAsString(anyGetterPOJO);
		System.out.println(employejson);

	}

}
