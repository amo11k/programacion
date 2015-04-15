package com.amo11k.hotel;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Habitacion {
	public final int NUM_ROOMS = 40;
	public final int roomstandar = 0;
	public final int roomlux = 1;
	public final int roomluxe = 2;
	public static Set<Integer> list = new HashSet<Integer>();

	public Habitacion() {
		for (int i = 0; i < NUM_ROOMS; i++) {
			list.add((int) (Math.random() * 3));
		}
	}
	
	protected void rentRoom(int c){
		list.remove(c);
	}

	protected void printRooms() {
		for (int c: list){
			System.out.println(c);			
		}
	}
}