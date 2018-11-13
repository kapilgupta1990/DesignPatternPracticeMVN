package com.cdk.gist.strectural.adapter;

public class EmployeeLdapAdapter implements Employee {

	private EmployeeLdapImpl employeeLdap;

	public EmployeeLdapAdapter(EmployeeLdapImpl employeeLdap) {
		super();
		this.employeeLdap = employeeLdap;
	}

	@Override
	public String getId() {
		return employeeLdap.getCn();
	}

	@Override
	public String getFirstName() {
		return employeeLdap.getGivenName();
	}

	@Override
	public String getLastName() {
		return employeeLdap.getSurname();
	}

	@Override
	public String getEmail() {
		return employeeLdap.getMail();
	}

	@Override
	public String toString() {
		return "EmployeeLdapAdapter [employeeLdap=" + employeeLdap + "]";
	}

}
