package com.cdk.gist.strectural.bridge;

public abstract class Shape {

	 private Color color;

	public Shape(Color color) {
		this.color = color;
	}
	public final Color getColor(){return this.color;};
	public abstract void getShape();
}
