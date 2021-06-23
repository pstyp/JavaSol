package com.qa.qacommunity;

public class Arrays {

	public static void main(String[] args) {

		// Arrays
		int[] ageArray = { 18, 26, 0, 100, 12, 6 };
		String[] nameArray = { "John", "Emma", "Alex", "Rachel", "Sean" };

		// For loop
//		for (int i = 0; i < ageArray.length; i++) {
//			System.out.println((ageArray[i]));
//		}

		// For-each loop (enhanced for loop}

		for (String name : nameArray) {
			System.out.println(name);
	}
	}

}
