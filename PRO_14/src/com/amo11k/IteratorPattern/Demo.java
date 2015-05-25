package com.amo11k.IteratorPattern;

public class Demo {

	public static void main(String[] args) {
		NameRepository namesRepo = new NameRepository();

		Iterator<String> iter = namesRepo.getIterator();
		while (iter.hasNext()) {
			String name = iter.next();
			System.out.println("Name: " + name);
		}

	}

}
