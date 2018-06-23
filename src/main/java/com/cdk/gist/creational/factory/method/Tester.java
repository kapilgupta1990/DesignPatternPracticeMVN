package com.cdk.gist.creational.factory.method;

public class Tester {

	public static void main(String[] args) {

		Vehicle car=VehicleFactory.getVehicle(VehicleType.CAR);
		System.out.println(car.getName());
		Vehicle motorCycle=VehicleFactory.getVehicle(VehicleType.MOTORCYCLE);
		System.out.println(motorCycle.getName());
		System.out.println(VehicleFactory.getVehicle(null));
	}
}
