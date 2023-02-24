package com.json_path_with_Java;

import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class ConfigurationExample {

	public static void pathleaftonull() {

		String json = "[\r\n"
				+ "   {\r\n"
				+ "      \"name\" : \"john\",\r\n"
				+ "      \"gender\" : \"male\"\r\n"
				+ "   },\r\n"
				+ "   {\r\n"
				+ "      \"name\" : \"ben\"\r\n"
				+ "   }\r\n"
				+ "]";

		Configuration configuration = Configuration.defaultConfiguration();

		configuration = configuration.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL); 
		//itwill return null insted of throwing an exception if no key is found in given json

		String result =	JsonPath.using(configuration).parse(json).read("$[1].gender");
		System.out.println(result);
		System.out.println("************************************************");
	}

	public static void alwaysreturnlist() {

		String json = "[\r\n"
				+ "   {\r\n"
				+ "      \"name\" : \"john\",\r\n"
				+ "      \"gender\" : \"male\"\r\n"
				+ "   },\r\n"
				+ "   {\r\n"
				+ "      \"name\" : \"ben\"\r\n"
				+ "   }\r\n"
				+ "]";

		Configuration configuration = Configuration.defaultConfiguration();

		configuration = configuration.addOptions(Option.ALWAYS_RETURN_LIST); 
		//it will return in list even when it return single string

		List<String> result =	JsonPath.using(configuration).parse(json).read("$[0].gender");
		System.out.println(result);
		System.out.println("************************************************");
	}

	public static void supress() {

		String json = "[\r\n"
				+ "   {\r\n"
				+ "      \"name\" : \"john\",\r\n"
				+ "      \"gender\" : \"male\"\r\n"
				+ "   },\r\n"
				+ "   {\r\n"
				+ "      \"name\" : \"ben\"\r\n"
				+ "   }\r\n"
				+ "]";

		Configuration configuration = Configuration.defaultConfiguration();

		configuration = configuration.addOptions(Option.ALWAYS_RETURN_LIST); 
		configuration = configuration.addOptions(Option.SUPPRESS_EXCEPTIONS);
		//it will return in list even when it return single string and will return empty list when no value found

		List<String> result =	JsonPath.using(configuration).parse(json).read("$[1].gender");
		System.out.println(result);
		System.out.println("************************************************");
	}
	
	public static void requireproperties() {

		String json = "[\r\n"
				+ "   {\r\n"
				+ "      \"name\" : \"john\",\r\n"
				+ "      \"gender\" : \"male\"\r\n"
				+ "   },\r\n"
				+ "   {\r\n"
				+ "      \"name\" : \"ben\"\r\n"
				+ "   }\r\n"
				+ "]";

		Configuration configuration = Configuration.defaultConfiguration();

		
		configuration = configuration.addOptions(Option.REQUIRE_PROPERTIES);
		//it is used when we are uisng indefi ite path..

		List<String> result =	JsonPath.using(configuration).parse(json).read("$[*].gender");
		System.out.println(result);
		System.out.println("************************************************");
	}





	public static void main(String[] args) {

		pathleaftonull();
		alwaysreturnlist();
		supress();
		requireproperties();


	}

}
