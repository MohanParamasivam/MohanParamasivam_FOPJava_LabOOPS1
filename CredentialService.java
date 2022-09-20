package com.email.service;

import java.util.Random;

public class CredentialService {
	
	public String generatePassword()
	{
		String numbers = "0123456789";
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$%^*<>?/.;";
		String values = capitalLetters+smallLetters+numbers+specialCharacters;
		
		Random random = new Random();
		
		String password = "";
		
		for (int i = 0; i<8; i++)
		{
			password = password + values.charAt(random.nextInt(values.length()));
		}
		
		return password;
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department)
	{
		return firstName+lastName+"@"+department+".abc.com";
	}
	
	public void showCredentials(String firstName, String email, String pwd)
	
	{
		System.out.println("Dear "+ firstName + " your generated credentials are as follows: ");
		System.out.println("Email      ---> "+ email);
		System.out.println("Password   ---> "+ pwd) ;
	}

}