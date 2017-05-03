public class TryAndCatch {
	
	public static void main( String[] args ){
		String str = "Hello";
		char[] charArr = str.toCharArray();

		try {

			if (charArr.length < 10) {
				throw (new Exception("My custom exception")); //this will look for catch block
			}

			char lastChar = charArr[charArr.length - 1];
			System.out.println(lastChar);
			String subStr = str.substring(8);
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			//System.out.println("Index number out of scope");
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("String index out of bound!");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}