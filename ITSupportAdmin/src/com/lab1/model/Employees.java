package com.lab1.model;

public class Employees {
	
	private String firstName;
	private String lastName;
	private String userName;
	private String passWord;

	public Employees() {
		
	}
	
	public Employees(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
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

	public void setPassWord(String passWord) {
		this.passWord = passWord;
		
	}

}
