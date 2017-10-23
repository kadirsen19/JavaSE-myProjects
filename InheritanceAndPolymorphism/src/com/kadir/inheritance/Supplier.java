package com.kadir.inheritance;

import com.kadir.person.Person;

public class Supplier extends Person {

	private long supplierId;
	private String mainSector;
	
	
	
	public long getSupplierId() {
		return supplierId;
	}


	public void setSupplierId(long supplierId) {
		this.supplierId = supplierId;
	}


	public String getMainSector() {
		return mainSector;
	}


	public void setMainSector(String mainSector) {
		this.mainSector = mainSector;
	}


	@Override
	public void getGreeting() {
		
		System.out.println("Supplier hello ");
		
	}


	@Override
	public String getFullName() {
		
		return "Supplier"+"surname-->"+getSurname()+"name-->"+getName();
	}
	

}
