package com.cdk.gist.strectural.adapter;

public class EmployeeLdapImpl implements EmployeeLdap {

	private String cn;
	private String surname;
	private String givenName;
	private String mail;

	public EmployeeLdapImpl(String cn, String surname, String givenName, String mail) {
		super();
		this.cn = cn;
		this.surname = surname;
		this.givenName = givenName;
		this.mail = mail;
	}

	public String getCn() {
		return cn;
	}

	public String getSurname() {
		return surname;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getMail() {
		return mail;
	}

	@Override
	public String toString() {
		return "EmployeeLdap [cn=" + cn + ", surname=" + surname + ", givenName=" + givenName + ", mail=" + mail + "]";
	}

}
