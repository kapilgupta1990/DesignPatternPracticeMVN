package com.cdk.gist.strectural.bridge;

public class Shape1BridgeDemo {
	public static void main(String[] args) {
		Circle circle = new BlueCircle();
		Square square=new RedSquare();
		
		circle.applyColor();
		square.applyColor();
	}
}
