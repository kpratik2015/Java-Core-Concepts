public class ConvertNumericVal {
	
	public static void main( String[] args ){
		int intVal = 30;
		int intVal1 = intVal;  //We got two copies of the value

		System.out.println("intVal1 is: " +intVal1);

		long longVal = intVal1;

		System.out.println("longVal is: " +longVal);

		//short shortVal = intVal1; //ERROR!

		short shortVal = (short) intVal1;  //typecasting -> narrowing the type

		System.out.println("shortVal is: " +shortVal);

		int intVal2 = 700;

		//byte byteVal =  intVal2; //ERROR!

		byte byteVal = (byte) intVal2;  //risk of losing data

		System.out.println("byteVal is: " +byteVal);

		double doubleVal = 1.91111d;

		int intVal3 = (int) doubleVal;  //narrowing. Truncation results in loss of data.

		System.out.println("intVal3 is: " +intVal3);
	}

}