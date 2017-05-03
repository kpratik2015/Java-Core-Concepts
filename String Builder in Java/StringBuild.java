import java.util.Scanner;
public class StringBuild {
	public static void main( String[] args ){
		String str1 = "Hi";
		String str2 = "There";
		String str3 = str1 + ", " +str2 + "!";

		StringBuilder sb = new StringBuilder("Hi")
		.append(", ")
		.append("There")
		.append("!");

		System.out.println(sb);

		Scanner sn = new Scanner(System.in);
		System.out.println("Enter a String");
		String ip = sn.nextLine();  //nextLine waits for user to type in something and press enter

		System.out.println(ip);

		//First deleting contents of sb.
		sb.delete(0, sb.length()); //delete(starting position, ending position)

		for(int i = 0; i < 3; i++) {
			ip = sn.nextLine();
			sb.append(ip + "\n");
		}

		System.out.println(sb);

	}
}