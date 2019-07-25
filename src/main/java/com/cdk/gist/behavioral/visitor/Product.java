package com.cdk.gist.behavioral.visitor;

public abstract class  Product {

	protected int price;

	public abstract void accept(ShoppingMallVisitor shoppingMallVisitor);
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
