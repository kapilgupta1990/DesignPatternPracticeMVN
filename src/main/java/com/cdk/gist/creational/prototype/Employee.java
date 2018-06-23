package com.cdk.gist.creational.prototype;

public class Employee extends Person{

	private String standard;
	private double fees;
	public Employee(String name, String fatherName) {
		super(name, fatherName);
		
	}
	
	public Employee(String name, String fatherName, String standard, double fees) {
		super(name, fatherName);
		this.standard = standard;
		this.fees = fees;
	}

	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return super.toString()+String.format("Employee [standard=%s, fees=%s]", standard, fees);
	}

	

}
