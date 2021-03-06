package com.example.java;

//FOr demonstrating instance method
import java.util.List;
import com.example.java.model.Bike;

public class VehicleTypes implements Details {

	private String colorChoice;

	public void getDetails(List<Bike> bikes) {  //we must define the method of interface

		String colorChoiceOfCustomer = colorChoice;

		for(Bike b: bikes) {
		 	System.out.println(b.getName() +" " + b.getColor() + " " + b.getGearOrNot());
		}

		System.out.println("Color choice is: " +colorChoiceOfCustomer);

	}

	//now we need to either set setColor method as abstract or define it.
	//abstract just means you are putting the signature of method but not defining it.

	public void setColor(String color) {
		colorChoice = color;
	}

}