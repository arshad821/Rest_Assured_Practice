package com.json_path_with_Java;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;

public class FilterPredicateExample {

//u can follow any method....
	public static void filterpredicateexample() throws IOException {

		File jsonfile = new File("src/test/resources/BookStore.json");
		//lesthan10
		Filter firstquery =	Filter.filter(Criteria.where("price").lt(10));

		Configuration config =	Configuration.defaultConfiguration();

		List<Object>  result1 =	JsonPath.using(config).parse(jsonfile).read("$.store.book[*].[?]", firstquery);

		System.out.println(result1);
		System.out.println("************************************************");

		Filter Secondquery = Filter.filter(Criteria.where("price").lt(10).and("category").is("fiction"));
		
		List<Object>  result2 =	JsonPath.using(config).parse(jsonfile).read("$.store.book[*].[?]", Secondquery);

		System.out.println(result2);
		System.out.println("************************************************");

	}


	public static void main (String [] args) throws IOException {


		filterpredicateexample();


	}

}
