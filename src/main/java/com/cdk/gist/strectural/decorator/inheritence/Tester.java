package com.cdk.gist.strectural.decorator.inheritence;

public class Tester {

	public static void main(String[] args) {
		PizzaWithCappicumDecorator pizzaDecorator=new PizzaWithCappicumDecorator(new Pizza());
		pizzaDecorator.addExtraCheej();
	}
}
