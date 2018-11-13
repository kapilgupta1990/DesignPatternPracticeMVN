package com.cdk.gist.strectural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();
		Employee employeeeFromDB = new EmployeeDB("1234", "kapil", "gupta", "kapil.gupta@cdk.com");
		employeeList.add(employeeeFromDB);
		
		//This will not work this is where adapter pattern will come into picture
		//Employee employeeeFromLdap = new EmployeeLdap("5678", "gupta", "ravi", "ravi.gupta@cdk.com");

		
		EmployeeLdapImpl employeeeFromLdap = new EmployeeLdapImpl("5678", "gupta", "ravi", "ravi.gupta@cdk.com");
		employeeList.add(new EmployeeLdapAdapter(employeeeFromLdap));
		
		
		EmployeeCSV employeeFromCSV=new EmployeeCSV("123,suresh,gupta,sureshgupta@gmail.com");
		employeeList.add(new EmployeeCSvAdapter(employeeFromCSV));
		return employeeList;
	}

	public static void main(String[] args) {

		EmployeeClient employeeClient=new EmployeeClient();
		System.out.println(employeeClient.getEmployeeList());
	}
}
