public class CharacterInJava {

	public static void main( String[] args ){

		char charVal1 = '1';
		char charVal2 = '2';
		char charVal3 = '3';

		System.out.println("charVal1: " +charVal1);
		System.out.println("charVal2: " +charVal2);
		System.out.println("charVal3: " +charVal3);

		char unicodeDollar = '\u0024';

		System.out.println("unicodeDollar: " +unicodeDollar);

		char c1 = 'a';
		char c2 = 'b';

		System.out.print(Character.toUpperCase(c1));  //Note print is used not println
		System.out.println(Character.toUpperCase(c2));


	}
}