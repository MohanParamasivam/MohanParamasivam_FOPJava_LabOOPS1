package com.email.main;

import java.util.Scanner;
import com.email.model.Employee;
import com.email.service.CredentialService;

public class CredentialApp {
	
	public static void main(String [] args){
		
	Employee employee = new Employee("mohan", "paramasivam");
	CredentialService credentialservice = new CredentialService();
	String generatedEmail = null;
	String generatedPwd = null; 
	
	System.out.println("Please enter your department from the following: ");
	System.out.println("1.Technical");
	System.out.println("2.Admin");
	System.out.println("3.Human Resources");
	System.out.println("4.Legal");
	
	Scanner sc = new Scanner(System.in);
	int option = sc.nextInt();

	if (option == 1)
	{
		generatedEmail = credentialservice.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "tech");
	}
	
	else if (option == 2)
	{
		generatedEmail = credentialservice.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "admin");
	}
	
	else if (option == 3)
	{
		generatedEmail = credentialservice.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "hr");
	}
	
	else if (option == 4)
	{
		generatedEmail = credentialservice.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "legal");
	}
	
	else 
	{
		System.out.println("Enter a valid option");
		sc.close();
		System.exit(-1);
	}
	
	
	generatedPwd = credentialservice.generatePassword();
	credentialservice.showCredentials(employee.getFirstName(), generatedEmail, generatedPwd);
	
	sc.close();

	}

	
}
	