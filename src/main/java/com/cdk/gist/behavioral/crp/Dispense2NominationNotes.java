package com.cdk.gist.behavioral.crp;

public class Dispense2NominationNotes implements NominationNotes {
	private NominationNotes nominationNotes;

	public void getDenominationNotes(RequestWrapper requestWrapper) {

		int divOutput = requestWrapper.requiredAmount / 2;
		if (requestWrapper.getAtm().doubleDenomination >= divOutput) {
			System.out.println("Dispensing notes of 2:" + divOutput);
			requestWrapper.requiredAmount = requestWrapper.requiredAmount - (2 * divOutput);
			requestWrapper.getAtm().doubleDenomination = requestWrapper.getAtm().doubleDenomination - divOutput;
		} else {

			System.out.println("Dispensing notes of 2:" + requestWrapper.getAtm().doubleDenomination);
			requestWrapper.requiredAmount = requestWrapper.requiredAmount
					- (2 * requestWrapper.getAtm().doubleDenomination);
			requestWrapper.getAtm().doubleDenomination = 0;
		}

		if (requestWrapper.requiredAmount == 0) {
			return;
		} else {
			//NominationNotes dispense1 = new Dispense1NominationNotes();
			nominationNotes.getDenominationNotes(requestWrapper);

		}
	}

	@Override
	public void nextChain(NominationNotes nominationNotes) {
		this.nominationNotes = nominationNotes;
	}
}
