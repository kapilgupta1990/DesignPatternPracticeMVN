package com.cdk.gist.behavioral.stretegy;

public class VisaStrategy extends ValidationStrategy {

	@Override
	public boolean isValid(CreaditCard creditCard) {
		boolean isValid=false;
		isValid=creditCard.getNumber().startsWith("37")|| creditCard.getNumber().startsWith("47");
		if(isValid){
			isValid=creditCard.getNumber().length()==15;
		}
		
		if(isValid){
			isValid=passesLuhn(creditCard.getNumber());
		}
		return isValid;
	}

}
