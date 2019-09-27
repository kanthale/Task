package com.innova.java;

public class Person {
	private String name;
	private int empId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=");
		builder.append(name);
		builder.append(", empId=");
		builder.append(empId);
		builder.append("]");
		return builder.toString();
	}	
}
