package com.serializeAnnotation;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Employee Details")
public class JsonRootValueAnnotationPOJO {
	
	int id;
	String name;
	String place;
	List<String> Skills;
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
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public List<String> getSkills() {
		return Skills;
	}
	public void setSkills(List<String> skills) {
		Skills = skills;
	}
	
	

}
