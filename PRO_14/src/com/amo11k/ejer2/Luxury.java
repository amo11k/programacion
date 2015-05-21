package com.amo11k.ejer2;

public class Luxury extends Car{

	public Luxury(CarType model) {
		super(model);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building luxury car");
		
	}

}
