import java.util.Scanner;

public class MethodOverloading {
	public static void main( String[] args ){

		String s1 = getInput("Enter value 1: ");
		String s2 = getInput("Enter value 2: ");
		String s3 = getInput("Enter value 3: ");

		double result = addValues(s1, s2);
		System.out.println("The answer is: " +result);

		double result1 = addValues(s1, s2, s3);
		System.out.println("The answer for 3 values is: " +result1);

		double result2 = addValues(s1, s2, s3, s1, s2, s3);
		System.out.println("The answer for n values is: " +result2);

	}

	//Marked static so that the method can be directly called from static main method
	static String getInput(String ip) {		//String => this method returns String
		System.out.println(ip);
		Scanner sc = new Scanner(System.in);

		return sc.nextLine();
	}

	static double addValues(String s1, String s2) {  //double => this method returns double
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double result = d1 + d2;
		return result;
	}

	//Method overloading -> adding another argument
	static double addValues(String s1, String s2, String s3) { 
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		double d3 = Double.parseDouble(s3);
		double result = d1 + d2 + d3;
		return result;
	}

	//Method for non-deterministic number of arguments
	static double addValues(String ... values) { //user can pass as many values as he wants
		double result = 0;
		for( String value: values ) {  //for each loop
			double d = Double.parseDouble(value);
			result += d;
		}
		return result;
	}

}