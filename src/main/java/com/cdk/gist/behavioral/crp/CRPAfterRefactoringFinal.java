package com.cdk.gist.behavioral.crp;

import java.util.Scanner;

public class CRPAfterRefactoringFinal {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		ATM atm=new ATM();
		while (true) {
			System.out.println("Enter Amount :");
			System.out.println("type exit to QUIT:");
			String str = scanner.next();

			if (str.equals("exit")) {
				System.exit(0);
			}
			int requiredAmount = Integer.parseInt(str);

			RequestWrapper requestWrapper = new RequestWrapper(atm,
					requiredAmount);

			System.out.println("Before Withdrawl" + requestWrapper);

			if (requestWrapper.getRequiredAmount() > atm.totalAmountAvailable) {
				System.out.println("Required Amount not available");
				continue;
			}

			ATMDispenserChain dispenser = new ATMDispenserChain();
			dispenser.getNominationNotes().getDenominationNotes(requestWrapper);

			System.out.println("After Withdrawl" + requestWrapper);

		}

	}

}
