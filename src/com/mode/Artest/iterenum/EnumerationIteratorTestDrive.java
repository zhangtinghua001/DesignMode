package com.mode.Artest.iterenum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
@SuppressWarnings("rawtypes")
public class EnumerationIteratorTestDrive {
	
	@SuppressWarnings("unchecked")
	public static void main (String args[]) {
		Vector v = new Vector(Arrays.asList(args));
	
		Iterator iterator = new EnumerationIterator(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
