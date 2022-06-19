package com.greatlearning.Service;

import com.greatlearning.Service.GeneratePassword;

public class GenerateEmail
{
	GeneratePassword generatePassword = new GeneratePassword ();
	
	public void technical(String firstName, String lastName)
	{
		System.out.println("Email	: " + firstName.toLowerCase() + lastName.toLowerCase() + "@tech.greatlearning.com");
		System.out.println("Password	: " + generatePassword.generatePassword());
	}
	
	public void admin(String firstName, String lastName)
	{
		System.out.println("Email	: " + firstName.toLowerCase() + lastName.toLowerCase() + "@adm.greatlearning.com");
		System.out.println("Password	: " + generatePassword.generatePassword());
	}
	
	public void humanResource(String firstName, String lastName)
	{
		System.out.println("Email	: " + firstName.toLowerCase() + lastName.toLowerCase() + "@hr.greatlearning.com");
		System.out.println("Password	: " + generatePassword.generatePassword());
	}
	
	public void legal(String firstName, String lastName)
	{
		System.out.println("Email	: " + firstName.toLowerCase() + lastName.toLowerCase() + "@lgl.greatlearning.com");
		System.out.println("Password	: " + generatePassword.generatePassword());
	}
	
	public void exit()
	{
		System.out.println("Thank You!");
	}
}
