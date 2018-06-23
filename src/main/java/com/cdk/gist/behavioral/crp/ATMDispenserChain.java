package com.cdk.gist.behavioral.crp;

public class ATMDispenserChain {

	private NominationNotes nominationNotes;

	public ATMDispenserChain() {

		this.nominationNotes = DispenseNotesFactory.getNominationNotes(CurrencyType.FIVE);
		NominationNotes notes2 = DispenseNotesFactory.getNominationNotes(CurrencyType.TWO);
		NominationNotes notes1= DispenseNotesFactory.getNominationNotes(CurrencyType.ONE);
		this.nominationNotes.nextChain(notes2);
		notes2.nextChain(notes1);

	}

	public NominationNotes getNominationNotes() {
		return nominationNotes;
	}
	
	
}
