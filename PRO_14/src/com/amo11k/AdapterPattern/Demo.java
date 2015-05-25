package com.amo11k.AdapterPattern;

public class Demo {

	public static void main(String[] args) {
		Duck pato = new BlackDuck();
		Turkey pavo = new Turkey();
		TurkeyAdapter pavoAdaptado = new TurkeyAdapter(pavo);
		pavoAdaptado.quack();
		pato.quack();
		pavo.gobble();
		DuckCatcher hunter = new DuckCatcher();
		hunter.pick(pato);

	}

}
