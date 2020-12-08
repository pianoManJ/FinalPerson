package personPkg;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * 
 * @author nabilm.twymanjr.
 *
 */
public class Person extends Object{
	
	private String name;
	private int age;
	/**
	 * Class constructor
	 * @param n name of the person
	 * @param a age of the person
	 */
	public Person(String n, int a) {
		this.setName(n);
		this.setAge(a);
	}
	
	/**
	 * Reads from a csv file and creates an Array list of Person instances.
	 * @param fileName Path of a file. Should be a csv file.
	 * @return ArrayList of Person instances
	 * @throws FileNotFoundException
	 */
	public static ArrayList<Person> readPersons(String fileName) throws FileNotFoundException{
		String line;
		File f = new File(fileName);
		Scanner s = new Scanner(f);
		s.useDelimiter(", ");
		ArrayList<Person> a = new ArrayList<Person>();
		while (s.hasNext()){
			line = s.nextLine();
			String[] pair = line.split(", ");
			a.add(new Person(pair[0], Integer.parseInt(pair[1])));
		}
		s.close();
		return a;
	}
	
	/**
	 * compares two Person instances
	 * 
	 */
	@Override
	public boolean equals(Object o) {
		if(o instanceof Person) {
			if((((Person) o).getAge() == this.getAge())&&(this.getName().equals(((Person) o).getName()))) {
				return true;
			}
		}
		return false;
	}
	

	@Override
	public String toString() {
		String personString = "";
		personString += this.name;
		personString += ", ";
		personString += this.age;
		return personString;
	}
	
	/**
	 * getter for name variable
	 * @return this.name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * sets the name variable
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * get the age variable
	 * @return this.age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * set the age variable
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
