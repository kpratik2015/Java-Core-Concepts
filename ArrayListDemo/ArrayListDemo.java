import java.util.List;
import java.util.ArrayList;

public class ArrayListDemo {
	public static void main( String[] args ){

		List<String> list = new ArrayList<>();

		list.add("India");
		list.add("US");
		list.add("Canada");

		System.out.println(list);

		list.add("Russia");
		System.out.println(list);

		list.remove(1);
		System.out.println(list);

		String nation = list.get(0);
		System.out.println("The first nation is: " +nation);

		int pos = list.indexOf("Canada");
		System.out.println("Canada is at: " +pos);

	}
}