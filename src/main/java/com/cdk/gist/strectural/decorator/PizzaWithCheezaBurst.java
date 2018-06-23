package com.cdk.gist.strectural.decorator;

public class PizzaWithCheezaBurst {
	private Pizza pizza;

	public PizzaWithCheezaBurst(Pizza pizza) {
		this.pizza = pizza;
	}

	public void addExtraCheej() {
		pizza.mypizza();
		System.out.println("Extra cheze added");
	}

	public int cost() {
		return pizza.getCost() + 50;
	}
}
