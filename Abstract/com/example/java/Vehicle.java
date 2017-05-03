package com.example.java;

import com.example.java.model.*;	
import java.util.List;
import java.util.ArrayList;

public class Vehicle {
	public static void main( String[] args ){

		List<Bike> bikes = new ArrayList<>();

		bikes.add(new Honda());

		//Below line will produce error that bike is abstract and cannot be instantiated
		//bikes.add(new Bike(Bike.YAMAHA, "Black", 1)); 

		Details vt = new VehicleTypes();
		vt.setColor("White");
		vt.getDetails(bikes);
		System.out.println( (new Honda()).getLogo() );

	}
}