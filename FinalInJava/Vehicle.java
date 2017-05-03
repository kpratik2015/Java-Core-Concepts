import model.Bike;
import java.util.List;
import java.util.ArrayList;

public class Vehicle {
	public static void main( String[] args ){

		List<Bike> bikes = new ArrayList<>();

		bikes.add(new Bike(BikeName.HONDA, 0x2E0456, 1));
		bikes.add(new Bike(BikeName.YAMAHA, 0x2E0854, 1));
		bikes.add(new Bike(BikeName.YAMAHA, 0x2E0555, 1));

		for(Bike b: bikes) {
		 	System.out.println(b.getName() +" " + b.getColor() + " " + b.getGearOrNot());
		}

	}
}