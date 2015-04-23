package com.amo11k.hotel;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Room<K, V> {
	private final int NUM_ROOMS = 40;
	private Object type;

	private enum typeRoom {
		Standar, Lujo, LujoShh
	};

	private Integer numRoom;
	private Map<Integer, Enum> hotel = new TreeMap<Integer, Enum>();

	public Room() {
		int random = (int) (Math.random() * NUM_ROOMS);
		int random2 = (int) (Math.random() * 3);
		numRoom = random;
		switch (random2) {
		case 0:
			hotel.put(numRoom, typeRoom.Standar);
			break;
		case 1:
			hotel.put(numRoom, typeRoom.Lujo);
			break;
		case 2:
			hotel.put(numRoom, typeRoom.LujoShh);
			break;
		}

	}

	public void genRooms() {
		ArrayList<Room> hotelist = new ArrayList<>();
		for (int i = 0; i < NUM_ROOMS; i++) {
			hotelist.add(new Room());
		}
	}
	
	public void print(){
		
	}
	
	public String toString(){
		String s;
		
		
		return null;		
	}
	

	/*
	 * protected void rentRoom(int c) { list.remove(c); }
	 * 
	 * protected void printRooms() { for (int c : list) { switch (c) { case 0:
	 * System.out.println("Standar");
	 * 
	 * break; case 1: System.out.println("Lujo"); roomLux++; break; case 2:
	 * System.out.println("LujoShh"); roomLuxShh++; break; } }
	 * System.out.println(roomStandar + " " + roomLux + " " + roomLuxShh); }
	 */

	public static void main(String[] args) {
		Room hab = new Room();
		System.out.println(hab.toString());
	}
}