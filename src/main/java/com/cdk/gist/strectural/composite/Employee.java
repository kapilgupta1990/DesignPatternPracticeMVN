package com.cdk.gist.strectural.composite;

public abstract class Employee {
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public abstract void addEmployee(Employee employee);
	
	public  Employee getEmployee(){
		return this;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [name=").append(name).append(", salary=").append(salary).append("]");
		return builder.toString();
	}

	public static void printEmployee(Employee emp){
		Employee root=emp;
		System.out.println(emp.getEmployee());
		if(root instanceof Manager){
			Manager manager=(Manager) root;
			for (Employee empTemp :manager.getEmployeeList()){
				printEmployee(empTemp);
			}
		}
		
	}

	
}
