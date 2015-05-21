package com.amo11k.ejer2;

public class CarFactory {
	// use getShape method to get object of type shape
	public static Car buildCar(CarType carType) {
		if (carType == null) {
			return null;
		}
		if (carType == CarType.SMALL) {
			return new Small(carType);
		} else if (carType == CarType.SEDAN) {
			return new Sedan(carType);
		} else if (carType == CarType.LUXURY) {
			return new Luxury(carType);
		}
		return null;
	}
}
