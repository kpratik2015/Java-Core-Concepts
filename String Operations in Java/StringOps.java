public class StringOps {
	public static void main( String[] args ){

		String str1 = "Hello this is AI talking.";
		System.out.println("Length of string: " +str1.length());

		System.out.println("Position (Index) of substring: " +str1.indexOf("AI"));

		String substr = str1.substring(14); //for verification
		System.out.println(substr);

		String str2 = "Aloha          "; //string with spaces
		System.out.println("Length of string with spaces: " +str2.length());

		String str3 = str2.trim();  //removes whitespace

		System.out.println(str3.length());

	}
}