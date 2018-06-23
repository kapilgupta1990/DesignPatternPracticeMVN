package com.cdk.gist.behavioral.visitor;

public class VisitorDemo {

	public static void main(String[] args) {
		PartsOrder partorders=new PartsOrder();
		partorders.addPart(new Wheel());
		partorders.addPart(new Oil());
		partorders.addPart(new Fender());
		System.out.println("Hello");
	}
}
