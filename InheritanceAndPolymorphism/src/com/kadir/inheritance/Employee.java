package com.kadir.inheritance;

import com.kadir.person.Person;

public class Employee extends Person{
	
	private long employeeId;
	private String employeeDepartment;

	
	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	@Override
	public void getGreeting() {
		System.out.println("Employee Hello");
		
	}

	@Override
	public String getFullName() {
		
		return "Employee"+"name -->"+getName()+"surname-->"+getSurname();
	}
	


}
