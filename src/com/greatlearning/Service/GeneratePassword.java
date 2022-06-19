package com.greatlearning.Service;
import java.util.Random;
public class GeneratePassword 
{
	public char[] generatePassword()
	{
		String symbol = "!@#$%";
		String capitalletter = "ABCDEFGHIJKIMNOPORSTUVWXYZ";
		String smallletter = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String values = capitalletter + smallletter + numbers + symbol;
		
		Random random = new Random();
		
		char[] password = new char[10];
		
		for (int i = 0; i < 10; i++)
		{
			password[i] = values.charAt(random.nextInt(values.length()));
		}
		return password;
	}
}

