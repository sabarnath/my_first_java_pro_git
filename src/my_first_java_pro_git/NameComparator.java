package my_first_java_pro_git;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Student o1, Student o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();

		// ascending order (descending order would be: name2.compareTo(name1))
		return name1.compareTo(name2);
	}

}
