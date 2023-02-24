package com.json_path_with_Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.InvalidJsonException;
import com.jayway.jsonpath.JsonPath;



public class ReadingJsonDocument {

	public static void ParseMultipleTime() throws IOException {

		File jsonfile = new File("src/test/resources/BookStore.json");

		List<Object> priceList =  JsonPath.read(jsonfile, "$..price");

		for (Object price : priceList) {
			System.out.println(price);
		}

		System.out.println("************************************************");
	}

	//correct way..
	public static void parsesingletime() throws InvalidJsonException, IOException {

		//.parse of will accept only string,inputstream..
		InputStream jsonfile = new FileInputStream("src/test/resources/BookStore.json");

		Object parsedjsondocument =	Configuration.defaultConfiguration().jsonProvider().parse(jsonfile.readAllBytes());

		List<Object> categorylist = JsonPath.read(parsedjsondocument, "$..category");

		for (Object Category : categorylist) {
			System.out.println(Category);
		}
		System.out.println("************************************************");

	}

	public static void FluentAPI() throws IOException {


		File jsonfile = new File("src/test/resources/BookStore.json");

		Configuration configuration =Configuration.defaultConfiguration();

		List<Object> authorlist =	JsonPath.using(configuration).parse(jsonfile).read("$..author");

		for (Object author : authorlist) {
			System.out.println(author);
		}
		System.out.println("************************************************");
	}

	//same concept
	public static void Knowwhatyourjsonreturning() throws IOException {

		File jsonfile = new File("src/test/resources/BookStore.json");

		Configuration configuration =Configuration.defaultConfiguration();
        //definite path- return one vlaue
		String isbnnumber = JsonPath.using(configuration).parse(jsonfile).read("$.store.book[3].isbn");
		System.out.println(isbnnumber);

		//indefinite path - return list of value (1.deep scan,2. expression, 3.array index)
		List<Object>  titlelist =	JsonPath.using(configuration).parse(jsonfile).read("$..title");
		
		for (Object title : titlelist) {
			System.out.println(title);
		}
		System.out.println("************************************************");
	}

	public static void main(String[] args) throws IOException {

		//ReadingJsonDocument jsondocument  = new ReadingJsonDocument();
		ParseMultipleTime();
		parsesingletime();
		FluentAPI();
		Knowwhatyourjsonreturning();
	}

}
