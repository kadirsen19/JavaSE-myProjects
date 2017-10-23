package com.kadir.inheritance;

import com.kadir.person.Person;

public class Agent extends Person{

	private long agentId;
	private String agentRecion;
	
	
	


	public long getAgentId() {
		return agentId;
	}


	public void setAgentId(long agentId) {
		this.agentId = agentId;
	}


	public String getAgentRecion() {
		return agentRecion;
	}


	public void setAgentRecion(String agentRecion) {
		this.agentRecion = agentRecion;
	}


	@Override
	public void getGreeting() {
		
		System.out.println("Agent Hello");
		
	}
	@Override
	public String getFullName() {
		
		return "Agent"+"name -->"+getName()+"surname-->"+getSurname();
	}
	
}
