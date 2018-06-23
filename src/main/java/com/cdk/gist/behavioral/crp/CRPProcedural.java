package com.cdk.gist.behavioral.crp;

public class CRPProcedural {

	public static void main(String[] args) throws Exception {
		
		int totalAmountAvailable=100;
		
		
		int requiredAmount=37;
		
		int singleDenomination=50;
		int doubleDenomination=20;
		int fiveDenomination=6;
	
		
		if(requiredAmount>totalAmountAvailable){
			throw new Exception();
		}
		
		int totalValueOf5NominationCurrency=5*fiveDenomination;
		int totalValueOf2NominationCurrency=2*doubleDenomination;
		int totalValueOf1NominationCurrency=1*singleDenomination;
		
		
		int remainingBalance=requiredAmount;
	
		int divOutput=remainingBalance/5;
		if(fiveDenomination>=divOutput){
			System.out.println("Dispensing notes of 5:"+divOutput);
			remainingBalance=remainingBalance-(5*divOutput);
			fiveDenomination=fiveDenomination-divOutput;
		}else{

			System.out.println("Dispensing notes of 5:"+fiveDenomination);
			remainingBalance=remainingBalance-(5*fiveDenomination);
			fiveDenomination=0;
		}
		System.out.println("Remaining balance "+remainingBalance);
		if(remainingBalance==0){
			System.exit(1);
		}
		
		
		 divOutput=remainingBalance/2;
		if(doubleDenomination>=divOutput){
			System.out.println("Dispensing notes of 2:"+divOutput);
			remainingBalance=remainingBalance-(2*divOutput);
			doubleDenomination=doubleDenomination-divOutput;
		}else{

			System.out.println("Dispensing notes of 2:"+doubleDenomination);
			remainingBalance=remainingBalance-(2*doubleDenomination);
			doubleDenomination=0;
		}
		System.out.println("Remaining balance "+remainingBalance);
		if(remainingBalance==0){
			System.exit(1);
		}
		
		
		 divOutput=remainingBalance/1;
		if(singleDenomination>=divOutput){
			System.out.println("Dispensing notes of 1:"+divOutput);
			remainingBalance=remainingBalance-(1*divOutput);
			singleDenomination=singleDenomination-divOutput;
		}else{

			System.out.println("Dispensing notes of 1:"+singleDenomination);
			remainingBalance=remainingBalance-(1*singleDenomination);
			fiveDenomination=0;
		}
		System.out.println("Remaining balance "+remainingBalance);
		if(remainingBalance==0){
			System.exit(1);
		}
		
		
		
		
		
		
		
		
		
	}
}
