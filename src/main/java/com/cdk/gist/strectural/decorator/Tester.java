package com.cdk.gist.strectural.decorator;

public class Tester {

	public static void main(String[] args) {
		// Yor are decorating a particular object here
		// First you created the pizze
		Pizza pizza=new Pizza();
		PizzaWithCappicumDecorator pizzaDecorator=new PizzaWithCappicumDecorator(pizza);
		pizzaDecorator.addExtraCheej();
	}
}
