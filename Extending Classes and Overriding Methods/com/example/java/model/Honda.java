package com.example.java.model;

public class Honda extends Bike { //will give error. Need to define default constructor
	
	//public Honda() {} //will give error that still no default constructor exists

	public Honda() {
		super(Bike.HONDA, 0x2E0456, 1);
	}


}