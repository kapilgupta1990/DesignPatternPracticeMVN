package com.cdk.gist.behavioral.crp;

public class Dispense1NominationNotes implements NominationNotes {
	private NominationNotes nominationNotes;

	public void getDenominationNotes(RequestWrapper requestWrapper) {
		int divOutput = requestWrapper.requiredAmount / 1;
		if (requestWrapper.getAtm().singleDenomination >= divOutput) {
			System.out.println("Dispensing notes of 1:" + divOutput);
			requestWrapper.requiredAmount = requestWrapper.requiredAmount - (1 * divOutput);
			requestWrapper.getAtm().singleDenomination = requestWrapper.getAtm().singleDenomination - divOutput;
		} else {

			System.out.println("Dispensing notes of 1:" + requestWrapper.getAtm().singleDenomination);
			requestWrapper.requiredAmount = requestWrapper.requiredAmount
					- (1 * requestWrapper.getAtm().singleDenomination);
			requestWrapper.getAtm().singleDenomination = 0;
		}
		return;
	}

	@Override
	public void nextChain(NominationNotes nominationNotes) {
		this.nominationNotes = nominationNotes;
	}
}
