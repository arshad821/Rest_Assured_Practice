package com.json_path_with_Java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.accessibility.AccessibleAction;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

import groovyjarjarantlr4.runtime.EarlyExitException;

public class InlinePredicateExample {



	public static void inlinepredicate() throws IOException {

		File jsonfile = new File("src/test/resources/BookStore.json");

		Configuration configration =  Configuration.defaultConfiguration();

		List<Object> pricelist =JsonPath.using(configration).parse(jsonfile).read("$.store.book[*].[?(@.price<10)]");

		for (Object pricelessten : pricelist) {
			System.out.println(pricelessten);     //without for loop also we can print
		}
		System.out.println("************************************************");

		//price < 10 and category==fiction     $.store.book[*].[?(@.price<10 && @.category == "fiction")]

		List<Object> andoperatorresult =JsonPath.using(configration).parse(jsonfile)
				.read("$.store.book[*].[?(@.price<10 && @.category == \"fiction\")]");
		System.out.println(andoperatorresult);
		System.out.println("************************************************");

		//price > 10 or(||) category = reference   

		List<Object> oroperatorresult =JsonPath.using(configration).parse(jsonfile)
				.read("$.store.book[*].[?(@.price > 10 || @.category == \"reference\") ]");
		for (Object or_result : oroperatorresult) {
			System.out.println(or_result);
		}
		System.out.println("************************************************");
		
		//not operator $.store.book[*].[?(!@.price < 10 && @.category == "reference") ]
		
		List<Object> notoperatorresult =JsonPath.using(configration).parse(jsonfile)
				.read("$.store.book[*].[?(!@.price < 10 && @.category == \"reference\") ]");
		for (Object not_result : notoperatorresult) {
			System.out.println(not_result);
		}
	}



	public static void  main(String[] args) throws IOException {

		inlinepredicate();




	}

}
