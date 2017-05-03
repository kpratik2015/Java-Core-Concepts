import java.text.NumberFormat;

public class PrimitiveToString {
	public static void main( String[] args ){
		int intVal = 24;
		String intToStr = Integer.toString(intVal);
		System.out.println(intToStr);

		boolean boolVal = true;
		String boolToStr = Boolean.toString(boolVal);
		System.out.println(boolToStr);

		long longVal = 12_400;
		NumberFormat formatter = NumberFormat.getNumberInstance();
		String longValFormatted = formatter.format(longVal);
		System.out.println(longValFormatted);
	}
}