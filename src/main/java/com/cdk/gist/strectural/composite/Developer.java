package com.cdk.gist.strectural.composite;

public class Developer extends Employee{

	public Developer(String name, double salary) {
		super(name,salary);
	}

	@Override
	public void addEmployee(Employee employee) {
		 throw new IllegalArgumentException("");
		
	}

}
