package com.cdk.gist.behavioral.stretegy;

public class StrategyDemo {

	public static void main(String[] args) {
		CreaditCard creditCard=new CreaditCard(new AmexStrategy());
	}
}
