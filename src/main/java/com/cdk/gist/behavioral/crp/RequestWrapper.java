package com.cdk.gist.behavioral.crp;

public class RequestWrapper {
	ATM atm;
	int requiredAmount = 0;

	public RequestWrapper(ATM atm, int requiredAmount) {
		super();
		this.atm = atm;
		this.requiredAmount = requiredAmount;
	}

	public int getRequiredAmount() {
		return requiredAmount;
	}

	public void setRequiredAmount(int requiredAmount) {
		this.requiredAmount = requiredAmount;
	}

	public ATM getAtm() {
		return atm;
	}

	public void setAtm(ATM atm) {
		this.atm = atm;
	}

	@Override
	public String toString() {
		return "RequestWrapper [atm=" + atm + ", requiredAmount=" + requiredAmount + "]";
	}

}
