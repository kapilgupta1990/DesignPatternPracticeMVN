package com.cdk.gist.behavioral.visitor;

public class ShoppingMallVisitorImpl implements ShoppingMallVisitor{

	int totalPrice=0;
	@Override
	public void accept(Product product) {
		
		totalPrice=totalPrice+product.getPrice();
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

}
