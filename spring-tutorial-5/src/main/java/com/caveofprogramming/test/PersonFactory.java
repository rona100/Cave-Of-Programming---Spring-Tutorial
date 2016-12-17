package com.caveofprogramming.test;

public class PersonFactory {
	/*
	 * Notice: that when using a factory the method is not static
	 * while when using a getInstance() method in the bean then it must be static
	 * */
	public Person createPerson(int id, String name) {
		System.out.println("Using factory to create person.");
		return new Person(id, name);
	}
}
