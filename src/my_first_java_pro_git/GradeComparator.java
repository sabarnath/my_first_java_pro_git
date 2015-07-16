package com.javacodegeeks.java.util.comparator;

import java.util.Comparator;

public class GradeComparator implements Comparator {

	@Override
	public int compare(Student o1, Student o2) {

		// descending order (ascending order would be:
		// o1.getGrade()-o2.getGrade())
		return o2.getGrade() - o1.getGrade();
	}

}
