package com.cdk.gist.behavioral.visitor;

public class DVD extends Product {
	String name;

	public DVD(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public void accept(ShoppingMallVisitor shoppingMallVisitor) {
		shoppingMallVisitor.accept(this);

	}

}
