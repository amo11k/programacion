package com.amo11k.ejer2;

public class Small extends Car{

	public Small(CarType model) {
		super(model);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("Building small car");
		
	}

}
