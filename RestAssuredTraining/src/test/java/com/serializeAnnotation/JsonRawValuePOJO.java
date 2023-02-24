package com.serializeAnnotation;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonRawValue;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRawValuePOJO {
	
	int id;
	String name;
	String email;

	@JsonRawValue                    //instead of datatype it will print raw value
	String Skills= "{[java],[Selenium]}";  

	
	public String getSkills() {
		return Skills;
	}
	public void setSkills(String skills) {
		Skills = skills;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}

