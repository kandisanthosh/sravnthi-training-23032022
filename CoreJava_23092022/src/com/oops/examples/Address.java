package com.oops.examples;

public class Address {
	
	private String houseno;
	private String streetname;
	public Address(String houseno, String streetname) {
		
		this.houseno = houseno;
		this.streetname = streetname;
	}
	@Override
	public String toString() {
		return "Address [houseno=" + houseno + ", streetname=" + streetname + "]";
	}

}
