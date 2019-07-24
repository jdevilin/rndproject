package org.com.collection;

import java.util.Comparator;

public class EmployeeCollection implements Comparator<EmployeeHashTable> {

	@Override
	public int compare(EmployeeHashTable o1, EmployeeHashTable o2) {
		return o1.getName().compareTo(o2.getName());
	}


}
