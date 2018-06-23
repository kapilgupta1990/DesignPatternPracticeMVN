package com.cdk.gist.behavioral.crp;

public class Dispense5NominationNotes implements NominationNotes {
	private final int denominationValue=5;
	private NominationNotes nominationNotes;
	
	public void getDenominationNotes(RequestWrapper requestWrapper) {
		int numberOfNotes=requestWrapper.getAtm().fiveDenomination;
		int divOutput = requestWrapper.requiredAmount / denominationValue;
		if (numberOfNotes >= divOutput) {
			System.out.println("Dispensing notes of 5:" + divOutput);
			requestWrapper.requiredAmount = requestWrapper.requiredAmount - (denominationValue * divOutput);
			requestWrapper.getAtm().fiveDenomination = requestWrapper.getAtm().fiveDenomination - divOutput;
		} else {

			System.out.println("Dispensing notes of 5:" + requestWrapper.getAtm().fiveDenomination);
			requestWrapper.requiredAmount = requestWrapper.requiredAmount
					- (denominationValue * requestWrapper.getAtm().fiveDenomination);
			requestWrapper.getAtm().fiveDenomination = 0;
		}

		if (requestWrapper.requiredAmount == 0) {
			return;
		} else {
			//NominationNotes dispense2 = new Dispense2NominationNotes();
			nominationNotes.getDenominationNotes(requestWrapper);

		}

	}


	@Override
	public void nextChain(NominationNotes nominationNotes) {
		this.nominationNotes=nominationNotes;
		
	}
}
