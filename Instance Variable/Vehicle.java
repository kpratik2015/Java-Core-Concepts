import model.Bike;
import java.util.List;
import java.util.ArrayList;

public class Vehicle {
	public static void main( String[] args ){

		List<Bike> bikes = new ArrayList<>();
		Bike bike1 = new Bike();
		bikes.add(bike1);
		Bike bike2 = new Bike();
		bikes.add(bike2);
		Bike bike3 = new Bike();
		bikes.add(bike3);

		VehicleTypes vt = new VehicleTypes();

		int noOfWheels = vt.getWheels(bikes);
		System.out.println("Number of wheels: " +noOfWheels);
	}
}