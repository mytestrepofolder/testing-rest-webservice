package com.webservices.test.model;

public class Address {

    private String street;
    private String state;
    
    
	@Override
	public String toString() {
		return "Address [street=" + street + ", state=" + state + "]";
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}


}