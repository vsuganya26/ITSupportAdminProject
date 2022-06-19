package com.lab1.main;

import java.util.Scanner;

import com.lab1.model.Employees;
import com.lab1.service.EmployeeCredentialService;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		String firstName;
		String lastName;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first name");
		firstName = sc.nextLine();
		
		System.out.println("Enter the last name");
		lastName = sc.nextLine();
		
		Employees emp = new Employees(firstName, lastName);		
		EmployeeCredentialService ecs = new EmployeeCredentialService();
		
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int option = sc.nextInt();
		boolean status = false;
		
		switch(option) {
		
		case 1:
			ecs.generateCredentials(emp.getFirstName(), emp.getLastName(),"tech");
			status = true;
			break;
		case 2:
			ecs.generateCredentials(emp.getFirstName(), emp.getLastName(),"admin");
			status = true;
			break;
		case 3:
			ecs.generateCredentials(emp.getFirstName(), emp.getLastName(),"hr");
			status = true;
			break;
		case 4:
			ecs.generateCredentials(emp.getFirstName(), emp.getLastName(),"legal");
			status = true;
			break;
		default:
			System.out.println("Please enter valid value");
		}
		
		if (status == true) {
			ecs.displayCredentials();
		}
		sc.close();
	}

}
