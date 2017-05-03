package com.example.java;

import com.example.java.model.*;	//This imports all the files in model folder
import java.util.List;
import java.util.ArrayList;

public class Vehicle {
	public static void main( String[] args ){

		List<Bike> bikes = new ArrayList<>();

		//Instead of:
		//bikes.add(new Bike(Bike.HONDA, 0x2E0456, 1));
		//We do this as Honda knows all the values:
		bikes.add(new Honda());
		bikes.add(new Bike(Bike.YAMAHA, 0x2E0854, 1));
		bikes.add(new Bike(Bike.YAMAHA, 0x2E0555, 1));

		for(Bike b: bikes) {
		 	System.out.println(b.getName() +" " + b.getColor() + " " + b.getGearOrNot());
		}

	}
}