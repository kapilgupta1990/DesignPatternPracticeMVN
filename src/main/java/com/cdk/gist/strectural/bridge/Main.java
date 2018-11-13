package com.cdk.gist.strectural.bridge;

public class Main {

	public static void main(String[] args) {

		Color color=new BlueColor();
		Shape circle=new CircleShape(color);
		circle.getShape();
	}
}
