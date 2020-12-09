package personPkg;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class SortTest {

	@Test
	public void test() {
		ArrayList <Person> sort1 = new ArrayList<Person>();
		sort1.add(new Person("a", 2));
		sort1.add(new Person("b", 1));
		sort1.add(new Person("c", 3));
		sort1.sort(null);
		
		ArrayList <Person> sort2 = new ArrayList<Person>();
		sort2.add(new Person("b", 1));
		sort2.add(new Person("a", 2));
		sort2.add(new Person("c", 3));
		
		assertEquals(sort1, sort2);
	}

}
