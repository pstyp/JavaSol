package com.qa.qacommunity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {

	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("Zayn");
		names.add("James");
		names.add("George");
		names.add("John");
		names.add("Angelica");
		names.add("Pawel");

//	System.out.println(names);
//	System.out.println(names.get(4));

		names.set(1, "Aswene");
//		names.remove(4);

//		System.out.println(names);
//		Collections.sort(names);
//		System.out.println(names);
//		System.out.println(names.size());
//	
		for (String i : names) {
			System.out.println(i);
		}

	}
}