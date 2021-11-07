package com.syntax.class12;

public class ContactInfo {
	// Create a method createEmail(). Based on values of users name, lastName and
	// email type, your method should return complete email Address. Example:
	// createEmail(John, Snow, gmail) → johnsnow@gmail.com

	
	String CreatEmail (String name, String LastName, String EmailType) {
		
		String contact = name + LastName +"@"+EmailType+".com";
		return contact;
	}
	
	
	

}