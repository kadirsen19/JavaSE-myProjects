package com.kadir.test;

import com.kadir.person.Person;

public class Mailer{

	
	public void sendMail(Person person) {
		System.out.println(person.getFullName());
		System.out.println(person.getEmail());
		person.getGreeting();
		
	}
	
}
