package com.email.model;

public class Employee {
	
	// variables of Employee class
	private String firstName;
	private String lastName;

	//parameterized constructor
	public Employee (String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//setters
	public String getFirstName() 
	{
		return firstName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	//getters
	public String getLastName() 
	{
		return lastName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
}