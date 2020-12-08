package personPkg;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.junit.Test;

public class ReadPersonsTest {

	@Test
	public void test() {
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Fred Smith", 28));
		personList.add(new Person("Jim Brown", 33));
		personList.add(new Person("Ann Simpson", 31));
		try {
			ArrayList<Person> testList = Person.readPersons("src/personPkg/PersonFile.csv");
			assertEquals(testList, personList);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
