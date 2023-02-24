package com.validatingjsonschema;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion.VersionFlag;
import com.networknt.schema.ValidationMessage;

public class NetworkNTJsonSchemaValidation {

    @Test
	public void networkNTjsonSchemaValidator() throws IOException {

		File inputjson = new File("src/test/resources/input.json");

		InputStream inputschema = new FileInputStream("src/test/resources/Schema.json");

		ObjectMapper mapper = new ObjectMapper();

		//jsfac. used to acces schema file and giving version as V4(its taken from schema file draft-04)
		JsonSchemaFactory factory =	JsonSchemaFactory.getInstance(VersionFlag.V4);

		//.readtreec can accept file,string,byte whatever
		JsonNode jsonNode =	mapper.readTree(inputjson);

		//getschema will not accept file it will accept string,input,etcc..
		JsonSchema schema =	factory.getSchema(inputschema);
		//validating schema file
		Set<ValidationMessage> result  =	schema.validate(jsonNode);

		//if there is any entry in set means there is error..
		if(result.isEmpty()) {
			System.out.println("No Validation error");
		}
		else {
			for (ValidationMessage message : result) {
				System.out.println("Yes there is Validation error: " + message);
			}
		}



	}

}
