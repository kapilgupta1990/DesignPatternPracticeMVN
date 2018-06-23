package com.cdk.gist.behavioral.stretegy;

public abstract class ValidationStrategy {

	public abstract boolean isValid(CreaditCard creditCard);
	protected boolean passesLuhn(String creditNumber){
		return false;
	}
}
