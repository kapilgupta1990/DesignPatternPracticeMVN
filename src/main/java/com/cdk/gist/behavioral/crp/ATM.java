package com.cdk.gist.behavioral.crp;

public class ATM {
	public int singleDenomination = 50;
	public int doubleDenomination = 20;
	public int fiveDenomination = 6;
	int totalAmountAvailable = 100;

	public ATM() {
		int totalValueOf5NominationCurrency = 5 * fiveDenomination;
		int totalValueOf2NominationCurrency = 2 * doubleDenomination;
		int totalValueOf1NominationCurrency = 1 * singleDenomination;
	}

	@Override
	public String toString() {
		return "ATM [singleDenomination=" + singleDenomination + ", doubleDenomination=" + doubleDenomination
				+ ", fiveDenomination=" + fiveDenomination + ", totalAmountAvailable=" + totalAmountAvailable + "]";
	}
	
	
}
