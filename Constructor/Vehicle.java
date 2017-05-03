import model.Bike;
import java.util.List;
import java.util.ArrayList;

public class Vehicle {
	public static void main( String[] args ){

		List<Bike> bikes = new ArrayList<>();
		// Bike bike1 = new Bike("Honda", 0x2E0456, 1);
		// bikes.add(bike1);
		// Bike bike2 = new Bike("Yamaha", 0x2E0854, 1);
		// bikes.add(bike2);
		// Bike bike3 = new Bike("Suzuki", 0x000000, 1);
		// bikes.add(bike3);

		//Below is fine tuned code but same as above:
		bikes.add(new Bike("Honda", 0x2E0456, 1));
		bikes.add(new Bike("Yamaha", 0x2E0854, 1));
		bikes.add(new Bike("Suzuki", 0x2E0555, 1));

		//BELOW CODE GIVES ERROR AS DATA IS PRIVATE
		// for(Bike b: bikes) {
		// 	System.out.println(b.name +" " + b.color + " " + b.gearOrNot);
		// }

		for(Bike b: bikes) {
		 	System.out.println(b.getName() +" " + b.getColor() + " " + b.getGearOrNot());
		}

	}
}