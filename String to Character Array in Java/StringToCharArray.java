public class StringToCharArray {

	public static void main( String[] args ){
		String str = "Hello World!";
		char[] charResult = str.toCharArray();
		for(char c : charResult){
			System.out.print(c);
		}
	}
}