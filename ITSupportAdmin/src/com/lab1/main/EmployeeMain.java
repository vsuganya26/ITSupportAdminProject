package com.lab1.main;

import java.util.Scanner;

import com.lab1.service.EmployeeCredentialService;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		
		EmployeeCredentialService ecs = new EmployeeCredentialService();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		int option = sc.nextInt();
		boolean status = false;
		
		switch(option) {
		
		case 1:
			ecs.generateCredentials("tech");
			status = true;
			break;
		case 2:
			ecs.generateCredentials("admin");
			status = true;
			break;
		case 3:
			ecs.generateCredentials("hr");
			status = true;
			break;
		case 4:
			ecs.generateCredentials("legal");
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
