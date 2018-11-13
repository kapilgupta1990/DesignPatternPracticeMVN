package com.cdk.gist.strectural.bridge;

public class CircleShape extends Shape{

	public CircleShape(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getShape() {
		System.out.println("This is the circle shape with=="+getColor());
		
	}

}
