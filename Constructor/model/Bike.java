package model;

public class Bike {

	private String name = "Honda";
	private long color = 0x2E0456;
	private int gearOrNot = 1;

	public Bike() {} //does nothing but must be defined and public

	public Bike(String name, long color, int gearOrNot) {
		this.name = name; 
		this.color = color;
		this.gearOrNot = gearOrNot;
	}

	public String getName() { return name; }

	public long getColor() { return color; }

	public int getGearOrNot() { return gearOrNot; }

}