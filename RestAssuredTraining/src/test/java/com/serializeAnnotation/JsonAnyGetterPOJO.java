package com.serializeAnnotation;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class JsonAnyGetterPOJO {
	
	public Map<String, Object> employeeproperties;

	@JsonAnyGetter
	public Map<String, Object> getEmployeeproperties() {
		return employeeproperties;
	}

	public void setEmployeeproperties(Map<String, Object> employeeproperties) {
		this.employeeproperties = employeeproperties;
	}

}
