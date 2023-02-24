package com.serializeAnnotation;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(alphabetic = true)
//@JsonPropertyOrder({"id","email", "name"})
public class JsonPropertyPoJO {

	String name;
	int id;
	String email;
@JsonGetter(value="A Id")   //this will work first then JPOrder will work
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
