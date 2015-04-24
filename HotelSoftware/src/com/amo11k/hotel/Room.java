package com.amo11k.hotel;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Room {
	private int numRoom;
	private int typeRoom;
	private String kindRoom;
	private boolean smokeRoom;
	
	
	public Room(){
		
	}

	public Room(int num, int type) {
		numRoom = num;
		int random = (int) (Math.random() * 2);

		switch (random) {
		case 0:
			smokeRoom = true;
			break;
		case 1:
			smokeRoom = false;
		}
		switch (type) {
		case 0:
			kindRoom = "Standar";
			break;
		case 1:
			kindRoom = "Lujo";
			break;
		case 2:
			kindRoom = "LujoShh";
			break;
		}

	}

	public int getNumRoom() {
		return numRoom;
	}

	public String getType() {
		return kindRoom;
	}

	public String getSmoke() {
		String s;
		if (smokeRoom) {
			s = "Fumar";
		} else {
			s = "No fumar";
		}
		return s;
	}
	
	public String toString(){
		return "La habitación "+numRoom+" es de tipo "+kindRoom+" y se puede "+getSmoke();
	}
	
	/*
	 * private final int NUM_ROOMS = 40; private Object type;
	 * 
	 * private enum typeRoom { Standar, Lujo, LujoShh };
	 * 
	 * private Integer numRoom; private Map<Integer, Enum> hotel = new
	 * TreeMap<Integer, Enum>();
	 * 
	 * public Room() { int random2 = (int) (Math.random() * 3); numRoom =
	 * random; switch (random2) { case 0: hotel.put(numRoom, typeRoom.Standar);
	 * break; case 1: hotel.put(numRoom, typeRoom.Lujo); break; case 2:
	 * hotel.put(numRoom, typeRoom.LujoShh); break; }
	 * 
	 * }
	 * 
	 * public void genRooms() { ArrayList<Room> hotelist = new ArrayList<>();
	 * for (int i = 0; i < NUM_ROOMS; i++) { hotelist.add(new Room()); } }
	 * 
	 * public void print(){
	 * 
	 * }
	 * 
	 * public String toString(){ String s;
	 * 
	 * 
	 * return null; }
	 * 
	 * 
	 * 
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
		Room hab = new Room(1,2);
		System.out.println(hab.toString());
	}
}