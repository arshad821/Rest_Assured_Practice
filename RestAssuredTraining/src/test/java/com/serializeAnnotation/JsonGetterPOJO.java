package com.serializeAnnotation;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonGetter;

public class JsonGetterPOJO {

	int id;
	String name;
	String email;

	@JsonGetter(value = "Employee ID")  // this change the name without doing any changes in code..
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
