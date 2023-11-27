package org.enumaeration;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class EnumerationDemo {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();

		m.put(1, "Ravi");
		m.put(2, "Kumar");
		m.put(3, "Santhosh");
		m.put(4, "Praveen");
		m.put(5, "Mani");

		Set<String> s = new LinkedHashSet<String>();

		s.add("Ravi");
		s.add("Kumar");
		s.add("Santhosh");
		s.add("Praveen");
		s.add("Mani");

		Iterator<String> i = s.iterator();
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		Vector<String> v = new Vector<String>();

		v.add("Ravi");
		v.add("Kumar");
		v.add("Santhosh");
		v.add("Praveen");
		v.add("Mani");

		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		List<String> li = new LinkedList<String>();

		li.add("Ravi");
		li.add("Kumar");
		li.add("Santhosh");
		li.add("Praveen");
		li.add("Mani");

		ListIterator<String> lii = li.listIterator();
		System.out.println(lii.hasPrevious());
		while(lii.hasNext()) {
			System.out.println(lii.next());
		}
		

	}
}
