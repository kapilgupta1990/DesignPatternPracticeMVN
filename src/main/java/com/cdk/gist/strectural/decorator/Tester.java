package com.cdk.gist.strectural.decorator;

public class Tester {

	public static void main(String[] args) {
		PizzaWithCappicumDecorator pizzaDecorator=new PizzaWithCappicumDecorator(new Pizza());
		pizzaDecorator.addExtraCheej();
	}
}
