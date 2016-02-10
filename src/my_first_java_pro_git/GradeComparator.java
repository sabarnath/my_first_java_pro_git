package my_first_java_pro_git;

import java.util.Comparator;

public class GradeComparator implements Comparator {

	@Override
	public int compare(Student o1, Student o2) {

		// descending order (ascending order would be:
		// o1.getGrade()-o2.getGrade())
		//Hello All
		return o2.getGrade() - o1.getGrade();
	}

}
