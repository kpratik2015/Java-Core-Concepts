package com.example.java;

import com.example.java.model.*;	
import java.util.List;
import java.util.ArrayList;

public class Vehicle {
	public static void main( String[] args ){

		List<Bike> bikes = new ArrayList<>();

		bikes.add(new Honda());
		bikes.add(new Bike(Bike.YAMAHA, "Black", 1));
		bikes.add(new Bike(Bike.YAMAHA, "Black", 1));

		//Instead of:
		//VehicleTypes vt = new VehicleTypes();
		//We make use of interface:
		Details vt = new VehicleTypes();
		vt.setColor("White");
		vt.getDetails(bikes);

	}
}