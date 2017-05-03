//FOr demonstrating instance method
import java.util.List;
import model.Bike;

public class VehicleTypes {
	public int getWheels(List<Bike> bikes) {

		for(Bike v : bikes) {
			System.out.println(v.name);
		}

		return 2;
	}
}