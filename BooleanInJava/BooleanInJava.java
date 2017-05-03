public class BooleanInJava {
	
	static boolean staticBool;  //Remember primitives are assigned defaults

	public static void main( String[] args ){
		
		boolean boolVal1 = true;
		boolean boolVal2 = false;

		System.out.println("boolVal1: " +boolVal1);
		System.out.println("boolVal2: " +boolVal2);
		System.out.println("staticBool: " +staticBool);

		boolean boolVal3 = !boolVal1;  //negation of boolVal1 is assigned to boolVal3

		System.out.println("boolVal3: " +boolVal3);

		int someInt = 1;
		boolean boolVal4 = (someInt != 1);
		System.out.println("boolVal4: " +boolVal4);

		String strBool = "false";  //this should be either true or false only

		boolean convertedBool = Boolean.parseBoolean(strBool);
		System.out.println("Parsing of boolean: " +convertedBool);

	}
}