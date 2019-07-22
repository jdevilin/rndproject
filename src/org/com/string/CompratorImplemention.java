package org.com.string;

import java.util.Comparator;

public class CompratorImplemention implements Comparator<StudentComparator> {

	@Override
	public int compare(StudentComparator o1, StudentComparator o2) {
		int i = o1.getName().compareTo(o2.getName());
		if (i == 0) {
			if (o1.getAge() == o2.getAge()) {
				return 0;
			} else if (o1.getAge() > o2.getAge())
				return 1;
			else
				return -1;
		}
		return i;
	
	}

}
