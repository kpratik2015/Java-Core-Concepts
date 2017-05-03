import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;

public class FileIO {
	public static void main( String[] args ){
		String src = "example.txt"; //if this file was in a directory. Use forward slash '/'

		String dst = "exampleCopy.txt";

		//Syntax style: try with resources
		//This will allow Java to call the close() method automatically
		try( 
			FileReader fr = new FileReader(src);
			BufferedReader br = new BufferedReader(fr);
			FileWriter wrtier = new FileWriter(dst);
		 	) {

			while (true) {
				String line = br.readLine();
				if(line == null) {
					break;
				} else {
					wrtier.write(line + "\n");
				}
			}

		} catch( Exception e ) {
			e.printStackTrace();
		}

	}
}