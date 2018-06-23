package com.cdk.gist.creational.prototype;

public class Person implements Cloneable{

	private String name;
	private String fatherName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public Person(String name, String fatherName) {
		super();
		this.name = name;
		this.fatherName = fatherName;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=").append(name).append(", fatherName=").append(fatherName).append("]");
		return builder.toString();
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
