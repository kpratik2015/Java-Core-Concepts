package com.example.java.model;

public class Bike {

	public static final String HONDA = "Honda";
	public static final String YAMAHA = "Yamaha";

	private String name = HONDA; //data type changed to enum name.
	//enum becomes a type of its own
	private long color = 0x2E0456;
	private int gearOrNot = 1;

	//Let's forget to create the default constructor
	//public Bike() {} //does nothing but must be defined and public

	public Bike(String name, long color, int gearOrNot) {
		this.name = name; 
		this.color = color;
		this.gearOrNot = gearOrNot;
	}

	public String getName() { return name; }

	public long getColor() { return color; }

	public int getGearOrNot() { return gearOrNot; }

}
