package com.cdk.gist.behavioral.stretegy;

public class CreaditCard {

	private String number;
	private String date;
	private String cvvNo;
	private ValidationStrategy strategy;

	public CreaditCard(ValidationStrategy strategy) {
		this.strategy = strategy;
	}

	public boolean isValid() {
		return strategy.isValid(this);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCvvNo() {
		return cvvNo;
	}

	public void setCvvNo(String cvvNo) {
		this.cvvNo = cvvNo;
	}

	public ValidationStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(ValidationStrategy strategy) {
		this.strategy = strategy;
	}
	
}
