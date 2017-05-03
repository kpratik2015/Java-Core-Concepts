package com.example.java.model;

public abstract class Bike {

	public static final String HONDA = "Honda";
	public static final String YAMAHA = "Yamaha";

	private String name = HONDA;
	private String color = "Red";
	private int gearOrNot = 1;

	public Bike(String name, String color, int gearOrNot) {
		this.name = name; 
		this.color = color;
		this.gearOrNot = gearOrNot;
	}

	public String getName() { return name; }

	public String getColor() { return color; }

	public int getGearOrNot() { return gearOrNot; }

	public abstract String getLogo();

}
