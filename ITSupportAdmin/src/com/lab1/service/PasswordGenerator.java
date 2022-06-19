package com.lab1.service;

import java.util.Random;

/**
 * This method generates the random password. The output is a random password whose length is 8 characters  
 * and contains atlease one upper case letter, lower case letter, a number and a special character
 */
public class PasswordGenerator {
	
    public String generatePassword() {
    	
    	String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	String lowerCase = "abcdefghijklmnopqrstuvwxyz";
    	String numbers = "0123456789";
    	String specialChar = "^$*.[]{}()?-\"!@#%&/\\,><':;_";
    	
    	String allChar = upperCase + lowerCase + numbers + specialChar;
    	
    	Random rand = new Random();
    	
    	char[] password = new char[8];
    	for (int i = 0; i <8; i++) {
    		
    		password[i] = allChar.charAt(rand.nextInt(allChar.length()));
    	}
    	
    	return new String(password);
    	
    }


}
