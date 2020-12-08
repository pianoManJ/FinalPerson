package personPkg;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("src/personPkg/PersonFile.csv");
		Scanner s;
		try {
			s = new Scanner(f);
			s.useDelimiter(", ");
			while(s.hasNext()) {
				System.out.println(s.next()+" "+s.next());
			}
			s.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
