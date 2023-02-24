package com.deserializeAnnotation;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class JsonCreatorPOJO {
	
	int id;
	String name;
	String email;
	
	@JsonCreator
	public JsonCreatorPOJO(
			@JsonProperty("Employee_id")
			int id,
			@JsonProperty("name")
			String name,
			@JsonProperty("email")
			String email
			) {
		this.id=id;
		this.email=email;
		this.name=name;	
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	
	
}
