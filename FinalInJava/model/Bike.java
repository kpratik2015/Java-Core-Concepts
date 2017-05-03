package model;

public class Bike {

	public enum BikeName {
		HONDA, YAMAHA;
	}

	private BikeName name = BikeName.HONDA; //data type changed to enum name.
	//enum becomes a type of its own
	private long color = 0x2E0456;
	private int gearOrNot = 1;

	public Bike() {} //does nothing but must be defined and public

	public Bike(BikeName name, long color, int gearOrNot) {
		this.name = name; 
		this.color = color;
		this.gearOrNot = gearOrNot;
	}

	public BikeName getName() { return name; }

	public long getColor() { return color; }

	public int getGearOrNot() { return gearOrNot; }

}
