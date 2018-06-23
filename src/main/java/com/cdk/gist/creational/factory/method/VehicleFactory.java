package com.cdk.gist.creational.factory.method;

public class VehicleFactory {

	public static Vehicle getVehicle(VehicleType vehicleType) {

		switch (vehicleType) {

		case CAR:
			return new Car();
		case MOTORCYCLE:
			return new MotorCycle();

		default:
			throw new IllegalArgumentException(vehicleType.toString());
		}
	}
}
