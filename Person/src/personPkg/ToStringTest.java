package personPkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToStringTest {

	@Test
	public void test() {
		Person p = new Person("John Doe", 26);
		assertEquals(p.toString(), "John Doe, 26");
	}

}
