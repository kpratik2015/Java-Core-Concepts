package com.example.java;

//FOr demonstrating instance method
import java.util.List;
import com.example.java.model.Bike;

public class VehicleTypes implements Details {

	private String colorChoice;

	public void getDetails(List<Bike> bikes) { 
		String colorChoiceOfCustomer = colorChoice;

		for(Bike b: bikes) {
		 	System.out.println(b.getName() +" " + b.getColor() + " " + b.getGearOrNot());
		}

		System.out.println("Color choice is: " +colorChoiceOfCustomer);

	}

	public void setColor(String color) {
		colorChoice = color;
	}

}