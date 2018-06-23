package com.cdk.gist.strectural.decorator;

public class PizzaWithCappicumDecorator {

	private Pizza pizza;

	public PizzaWithCappicumDecorator(Pizza pizza) {
		this.pizza = pizza;
	}

	public void addExtraCheej() {
		pizza.mypizza();
		System.out.println("Extra cheze added");
	}

	public int cost() {
		return pizza.getCost() + 20;
	}
}
