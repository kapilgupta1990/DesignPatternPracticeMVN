package com.cdk.gist.strectural.flyweight;

public class Circle implements Shape{

	private String color;
	
	
	final int x=5;
	final int y=5;
	private final int radius=20;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("Circle draw with radius "+radius+ "Color "+color);
		
	}
	
	
}
