package com.cdk.gist.strectural.flyweight;

public class FlyWeightPatternDemo {

	private static final String colors[]= {"red","blue","green"};
	public static void main(String[] args) {
		
		System.out.println("=======Red color circle=========");
		
		for(int i=0;i<10;i++) {
			Circle shape=(Circle) ShapeFactory.getShape("circle");
			shape.setColor(colors[0]);
			shape.draw();
		}

	}

}
