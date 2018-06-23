package com.cdk.gist.creational.builder;

public class Tester {
	public static void main(String[] args) {

		Cake cake=Cake.cakeBuilder().addButter(2.0).addEggs(3.0).addSugar(4.0).build();
		System.out.println("CAKE : "+cake);
	}
}
