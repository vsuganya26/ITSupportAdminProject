package com.lab1.service;

import com.lab1.model.Employees;

public class EmployeeCredentialService {

	String firstName = "Suganya";
	String lastName = "Vaidyanathan";
	String companyName = "gl";

	Employees isa = new Employees(firstName, lastName);
	PasswordGenerator pg = new PasswordGenerator();

	public void generateCredentials(String department) {
		String userName = firstName + lastName + "@" + department + "." + companyName + ".com";
		String passWord = PasswordGenerator.generatePassword(8);

		isa.setUserName(userName);
		isa.setPassWord(passWord);
	}

	public void displayCredentials() {
		System.out.println("Dear" + " " + firstName + " " + "your generated credentials are as follows");
		System.out.println("Email --->" + " "+ isa.getUserName());
		System.out.println("Password --->" + " "  + isa.getPassWord());
	}

}
