package com.cdk.gist.behavioral.template;

public abstract class FoodDispatcher {

	public void processOrder() {
		placeOrder();
		acceptOrder();
		prepareOrder();
		deliverOrder();
	}

	private void placeOrder() {
		System.out.println("Order has been placed");
	}

	private void acceptOrder() {
		System.out.println("accepting ordr...");
	}

	public abstract void prepareOrder();

	private void deliverOrder() {
		System.out.println("delivering order...");
	}

}
