package com.cdk.gist.behavioral.visitor;

public class Shirt extends Product {

	String brandName;
	String size;

	public Shirt(String brandName, String size, int price) {
		super();
		this.brandName = brandName;
		this.size = size;
		this.price = price;
	}

	@Override
	public void accept(ShoppingMallVisitor shoppingMallVisitor) {
		shoppingMallVisitor.accept(this);
	}

}
