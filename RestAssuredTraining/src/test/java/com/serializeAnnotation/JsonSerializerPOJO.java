package com.serializeAnnotation;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


@JsonPropertyOrder({"Last_Name","First_Name", "Email", "Skills", "devices"})
@JsonSerialize(using = CustomSerializer.class)
public class JsonSerializerPOJO {


    private String First_Name;
	private String Last_Name;
	private String Email;
	private List<String> Skills;
	private Devices devices;
	
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public List<String> getSkills() {
		return Skills;
	}
	public void setSkills(List<String> skills) {
		Skills = skills;
	}
	public Devices getDevices() {
		return devices;
	}
	public void setDevices(Devices devices) {
		this.devices = devices;
	}
	
	






}
