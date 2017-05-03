import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main( String[] args ){
		Map<String, String> map = new HashMap<>();

		map.put("India", "First");
		map.put("US", "Second");
		map.put("Canada", "Third");
		System.out.println(map);

		map.put("Russia", "Fourth");
		System.out.println(map);

		String mapString = map.get("US");
		System.out.println("The US stands at: " +mapString);

		System.out.println(mapString);
		map.remove("Russia");
		
	}
}