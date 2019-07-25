package com.cdk.gist.strectural.flyweight;

import java.util.HashMap;

public class ShapeFactory {

	private static final HashMap<String, Shape> shapeMap = new HashMap<String, Shape>();

	public static Shape getShape(String shapeType) {
		Shape shape = null;

		if (shapeType == "circle") {
			shape = shapeMap.get("circle");
			if (shape == null) {
				shape = new Circle();
				shapeMap.put("circle", shape);
				System.out.println("Creating color withour any color in shafe factor");
			}

		}
		return shape;
	}
}
