package com.amo11k.hotel;

import java.util.ArrayList;
import java.util.Set;

public class Habitacion {
	public final int NUM_ROOMS = 40;
	public int roomStandar = 0;
	public int roomLux = 0;
	public int roomLuxShh = 0;
	public static ArrayList<Integer> list = new ArrayList<Integer>();

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
			switch (c){
			case 0: System.out.println("Standar");
				roomStandar++;
				break;
			case 1: System.out.println("Lujo");
				roomLux++;
				break;
			case 2: System.out.println("LujoShh");
				roomLuxShh++;
				break;
			}
		}
		System.out.println(roomStandar+" "+roomLux+" "+roomLuxShh);
	}
	
	public static void main(String[] args) {
		Habitacion hab = new Habitacion();
		hab.printRooms();
	}
}