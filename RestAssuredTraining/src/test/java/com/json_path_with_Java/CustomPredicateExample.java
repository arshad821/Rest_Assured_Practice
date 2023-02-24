package com.json_path_with_Java;

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Predicate;
import com.jayway.jsonpath.Predicate.PredicateContext;

public class CustomPredicateExample {

	
	
	//dont go through confusing....
	//just for knowledge
	public static void customprediacte() throws IOException {
		File jsonfile = new File("src/test/resources/BookStore.json");

		Predicate bookswithISBN = new Predicate() {


			@Override
			public boolean apply(PredicateContext ctx) {
				// TODO Auto-generated method stub
				boolean predicate = ctx.item(Map.class).containsKey("isbn");
				return predicate;
			}
		};
	//List<Object>	result = JsonPath.parse(jsonfile).read("$.store.book[*].[?]",List.class, bookswithISBN);


	}

	public static void main(String[] args) throws IOException {

		customprediacte();

	}

}
