package com.amo11k.AdapterPattern;

public class TurkeyAdapter implements Duck {
	private Turkey t;
	
	public TurkeyAdapter(Turkey pavo){
		this.t=pavo;
	}
	@Override
	public void quack() {
		t.gobble();
	}

}
