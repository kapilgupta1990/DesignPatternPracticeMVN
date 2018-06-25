package com.cdk.gist.behavioral.template;

public class Tester {

	public static void main(String[] args) {

		FoodDispatcher vegDispatcher=FoodDispatcherType.VEG_FOOD.getFoodDispatcher();
		vegDispatcher.processOrder();
		System.out.println();
		FoodDispatcher nonVegDispatcher=FoodDispatcherType.NON_VEG_FOOD.getFoodDispatcher();
		nonVegDispatcher.processOrder();
		System.out.println(nonVegDispatcher);
		System.out.println();
		FoodDispatcher nonVegDispatcher1=FoodDispatcherType.NON_VEG_FOOD.getFoodDispatcher();
		nonVegDispatcher1.processOrder();
		System.out.println(nonVegDispatcher1);
		
	}
}
