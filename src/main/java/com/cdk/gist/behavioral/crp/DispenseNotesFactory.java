package com.cdk.gist.behavioral.crp;

public class DispenseNotesFactory {

	public static NominationNotes getNominationNotes(CurrencyType currencyYype) {
		switch (currencyYype) {
		case ONE:
			return new Dispense1NominationNotes();
		case TWO:
			return new Dispense2NominationNotes();
		case FIVE:	
			return new Dispense5NominationNotes();
		 default :
			throw new IllegalArgumentException("Invalid currency type "+currencyYype);
		}
	}
}
