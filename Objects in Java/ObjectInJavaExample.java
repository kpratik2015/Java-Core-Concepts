public class ObjectInJavaExample {

	public String color;

	public static void main( String[] args ){
		ObjectInJavaExample candy = new ObjectInJavaExample();
		candy.color = "Red";
		candy.displayCandy();
	}

	private void displayCandy() {
		System.out.println("Color of candy is: " +this.color);
	}

}