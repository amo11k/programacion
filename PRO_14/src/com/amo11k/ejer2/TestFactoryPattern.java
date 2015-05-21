package com.amo11k.ejer2;

public class TestFactoryPattern {
	public static void main(String[] args) {
		Car a, b, c;
		a = CarFactory.buildCar(CarType.SMALL);
		System.out.println(a);
		b = CarFactory.buildCar(CarType.SEDAN);
		System.out.println(b);
		c = CarFactory.buildCar(CarType.LUXURY);
		System.out.println(c);
	}
}
