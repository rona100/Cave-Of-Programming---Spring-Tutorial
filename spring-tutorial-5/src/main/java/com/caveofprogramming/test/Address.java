package com.caveofprogramming.test;

public class Address {
	private String street;
	private String postcode;
	public Address(String street, String postcode) {
		super();
		this.street = street;
		this.postcode = postcode;
	}
	
	/*
	 * its registered by the default-init-method global property 
	 * */
	public void init() {
		System.out.println("Address bean created: " + this);
	}
	
	@Override
	public String toString() {
		return "Adress [street=" + street + ", postcode=" + postcode + "]";
	}
	
	
}
