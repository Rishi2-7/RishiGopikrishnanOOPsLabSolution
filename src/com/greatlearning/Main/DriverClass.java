package com.greatlearning.Main;

import java.util.Scanner;

import com.greatlearning.Models.Employee;
import com.greatlearning.Service.GenerateEmail;

public class DriverClass
{
	public static void main(String[] args)
	{
		Employee employee1 = new Employee();
		GenerateEmail generateEmail1 = new GenerateEmail();
		Scanner SC = new Scanner (System.in);
		String firstName;
		String lastName;
		System.out.println ("Welcome to IT Support Portal!") ;
		System.out.println();
		System.out.println("Please Enter Your First Name :");
		firstName = SC.nextLine();
		System.out.println("Please Enter Your Last Name :");
		lastName = SC.nextLine();
		employee1.setfirstName(firstName);
		employee1.setlastName(lastName);
		int option;
		do
		{
			System.out.println();
			System.out.println("Please Enter The Department From The Following:");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			System.out.println("0. Exit");
			option = SC.nextInt();
			switch (option)
			{
				case 0:
				{
					generateEmail1.exit();
					break;
				}
				case 1:
				{
					generateEmail1.technical(firstName, lastName);
				}
				break;
				case 2:
				{
					generateEmail1.admin(firstName, lastName);
				}
				break;
				case 3:
				{
					generateEmail1.humanResource(firstName, lastName);
				}
				break;
				case 4:
				{
					generateEmail1.legal(firstName, lastName);
				}
				break;
				default:
				System.out.println("Kindly Enter a Valid Option");
			}
		}
		while (option != 0);
	}



}
