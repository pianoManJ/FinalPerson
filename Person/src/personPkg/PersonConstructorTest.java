package personPkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonConstructorTest {
	/**
	 * Tests for the creation of Person Instance and equals() override
	 */
	@Test
	public void test() {
		Person person = new Person("Nabil", 20);
		Person person2 = new Person("Nabil", 20);
		Boolean isEqual = person.equals(person2);
		assertEquals(true, isEqual);
	}

}
