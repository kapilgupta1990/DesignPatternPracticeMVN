package com.cdk.gist.strectural.adapter;

public class EmployeeDB implements Employee {

	private String id;
	private String firstName;
	private String lastName;
	private String emailID;

	public EmployeeDB(String id, String firstName, String lastName, String emailID) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailID = emailID;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public String getEmail() {
		return this.emailID;
	}

	@Override
	public String toString() {
		return "EmployeeDB [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailID=" + emailID
				+ "]";
	}

}
