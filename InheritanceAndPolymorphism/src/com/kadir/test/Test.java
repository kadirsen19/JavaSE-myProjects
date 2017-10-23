package com.kadir.test;

import com.kadir.inheritance.Customer;
import com.kadir.inheritance.Employee;
import com.kadir.inheritance.Supplier;

public class Test {

	public static void main(String[] args) {
	
	
		
		
		
		Employee employee1 = new Employee();
		
		employee1.setEmployeeId(3);
		employee1.setName("Ahmet");
		employee1.setSurname("Altun");
		employee1.setEmployeeDepartment("sales");
		employee1.setEmail("ahmet@gmail.com");
		
		
		Supplier supplier1= new Supplier();
		
		supplier1.setSupplierId(2);
		supplier1.setSurname("berbero�lu");
		supplier1.setName("can");
		supplier1.setMainSector("software");
		supplier1.setEmail("can@gmail.com");
		
		Customer customer1= new Customer();
		customer1.setCustomerId(1);
		customer1.setName("Kadir");
		customer1.setSurname("�EN");
		customer1.setEmail("kadir@gmail.com");
		customer1.setTotalDebit(600);
		
		Mailer mailer = new Mailer();
		mailer.sendMail(customer1);
		mailer.sendMail(supplier1);
		mailer.sendMail(employee1);
		

	}

}
