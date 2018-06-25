package com.cdk.gist.behavioral.template;

public enum FoodDispatcherType {

	
	VEG_FOOD(new VegFoodDispatcher()),
	NON_VEG_FOOD(new NonVegFoodDispatcher());
	
	private FoodDispatcher foodDispatcher;

	private FoodDispatcherType(FoodDispatcher foodDispatcher){
		this.foodDispatcher=foodDispatcher;
	}
	
	
	public FoodDispatcher getFoodDispatcher() {
		return foodDispatcher;
	}
	
}
