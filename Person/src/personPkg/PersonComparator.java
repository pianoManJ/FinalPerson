package personPkg;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		Integer.compare(o1.getAge(), o2.getAge());
		return 0;
	}

}
