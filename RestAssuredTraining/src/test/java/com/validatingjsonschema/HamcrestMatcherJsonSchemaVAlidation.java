package com.validatingjsonschema;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class HamcrestMatcherJsonSchemaVAlidation {

	@Test
	public void hamcrestmatcherjsonschemavalidator() throws IOException {

		
		File inputjson = new File("src/test/resources/input.json");
		//we are converting file to string using filutils class and readfiletosrting in apache common io...and foramt as "UTF-8"
		String jsoncontent =	FileUtils.readFileToString(inputjson, "UTF-8");

		File Schemajson = new File("src/test/resources/Schema.json");


		//assertthat() 1st parametr will accept only String
		MatcherAssert.assertThat(jsoncontent, JsonSchemaValidator.matchesJsonSchema(Schemajson));


	}

}
