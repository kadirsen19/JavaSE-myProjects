package com.kadir.inheritance;

import com.kadir.person.Person;

public class Customer extends Person{

	private long customerId;
	private double totalDebit;
	
	
	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public double getTotalDebit() {
		return totalDebit;
	}

	public void setTotalDebit(double totalDebit) {
		this.totalDebit = totalDebit;
	}

	@Override
	public void getGreeting() {
		
		System.out.println("Customer Hello");
		
	}

	@Override
	public String getFullName() {
		
		return "Customer"+"name -->"+getName()+"surname-->"+getSurname();
	}
	
	
}
