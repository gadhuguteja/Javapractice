package com.collection.assignment;

public class Student {
	
	private String firstName;
	private String lastName;
	
	public Student(String fn, String ln) {
		
		firstName = fn;
		lastName = ln;
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student | firstName=" + firstName + " "
				+ "| lastName=" + lastName + "]";
	}
	
	

}
