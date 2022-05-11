package com.example.demo.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	
	String resourcename;
	String fieldname;
	int fieldvalue;
	public ResourceNotFoundException(String resourcename, String fieldname, int fieldvalue) {
		super(String.format("%s not found with %s : %d",resourcename,  fieldname,  fieldvalue));
		this.resourcename = resourcename;
		this.fieldname = fieldname;
		this.fieldvalue = fieldvalue;
	}
	public String getResourcename() {
		return resourcename;
	}
	public void setResourcename(String resourcename) {
		this.resourcename = resourcename;
	}
	public String getFieldname() {
		return fieldname;
	}
	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}
	public int getFieldvalue() {
		return fieldvalue;
	}
	public void setFieldvalue(int fieldvalue) {
		this.fieldvalue = fieldvalue;
	}
	 
}
