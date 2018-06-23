package com.cdk.gist.strectural.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manager extends Employee {

	private List<Employee> employeeList = new ArrayList<>();

	public Manager(String name, double salary) {
		super(name, salary);
		
	}

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}

	public List<Employee> getEmployeeList() {
		return Collections.unmodifiableList(employeeList);
	}

	

}
