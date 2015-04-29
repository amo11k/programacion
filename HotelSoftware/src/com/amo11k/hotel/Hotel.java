package com.amo11k.hotel;

public class Hotel extends Room {
	private final static int NUM_ROOMS = 40;
	private int count = 1;
	private static Room[] listRoom = new Room[NUM_ROOMS];
	
	
	public Hotel() {
		for (int i = 0; i < 40; i++) {
			int random = (int) (Math.random() * 2);
			listRoom[i] = new Room(count, random);
			count++;
		}
	}
	
	public String getRoomAt(int numRoom){
		return listRoom[numRoom].toString();
	}

	public static void main(String[] args) {
		Hotel h = new Hotel();
		for (Room r: listRoom){
			System.out.println(r.toString());
		}
	}

}
