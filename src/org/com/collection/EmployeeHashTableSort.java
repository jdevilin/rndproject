package org.com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeHashTableSort {

	public static void main(String[] args) {
		Hashtable<Integer, EmployeeHashTable> empHash = new Hashtable<Integer, EmployeeHashTable>();

		EmployeeHashTable emp1 = new EmployeeHashTable(1, "Sameer", "7/2 2A Laksmi Nagar Ghaizabad", 23);
		empHash.put(1, emp1);
		EmployeeHashTable emp2 = new EmployeeHashTable(1, "Abhishek", "Aragyam Check Post", 24);
		empHash.put(2, emp2);
		EmployeeHashTable emp3 = new EmployeeHashTable(1, "Zemeer", "4567 noida post", 19);
		empHash.put(3, emp3);

		Set set = empHash.entrySet();
		Iterator itr = set.iterator();

		System.out.println("Before Sorting Value In ");

		while (itr.hasNext()) {
			Map.Entry<Integer, EmployeeHashTable> mapE = (Entry<Integer, EmployeeHashTable>) itr.next();
			System.out.println("Map Key " + mapE.getKey() + "Map Value" + mapE.getValue());
		}

		List<Entry<Integer, EmployeeHashTable>> entryList = new ArrayList<Map.Entry<Integer, EmployeeHashTable>>(
				empHash.entrySet());
		Collections.sort(entryList, new Comparator<Entry<Integer, EmployeeHashTable>>() {
			@Override
			public int compare(Entry<Integer, EmployeeHashTable> o1, Entry<Integer, EmployeeHashTable> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().getName().compareTo(o2.getValue().getName());
			}
		});
		
		System.out.println("After Sorting Value In ");

       System.out.println(entryList.toString());
	}

}
