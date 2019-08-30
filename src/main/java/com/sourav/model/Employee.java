package com.sourav.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {
	
	@JacksonXmlProperty(localName = "EmployeeId")
	private String empId;
	
	@JacksonXmlProperty(localName = "Name")
	private String name;
	
	@JacksonXmlProperty(localName = "Designation")
	private String designation;
	
	@JacksonXmlProperty(localName = "Salary")
	private double salary;

}
