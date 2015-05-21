package com.amo11k.ejer2;

public class Sedan extends Car{

	public Sedan(CarType model) {
		super(model);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building sedan car");
		
	}

}
