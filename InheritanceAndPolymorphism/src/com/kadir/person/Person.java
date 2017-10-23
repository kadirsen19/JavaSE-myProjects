package com.kadir.person;

public abstract class Person {

	private String name;
	
	private String surname;
	
	private String email;

	public Person() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	abstract public void getGreeting();
	
	public String getFullName() {
		
		return "name :"+name+"surname"+surname;
	}
}
