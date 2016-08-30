package com.mode.Artest.iterenum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
@SuppressWarnings("rawtypes")
public class IteratorEnumerationTestDrive {
	public static void main (String args[]) {
		@SuppressWarnings("unchecked")
		ArrayList l = new ArrayList(Arrays.asList(args));
		Enumeration enumeration = new IteratorEnumeration(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
