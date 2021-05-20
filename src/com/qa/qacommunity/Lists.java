package com.qa.qacommunity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists {
	
	public static void main(String[] args){
		
	 List<String> names = new ArrayList<>();
	
	names.add("Zayn");
	names.add("James");
	names.add("George");
	names.add("John");
	names.add("Angelica");
	names.add("Pawel");
	
	System.out.println(names);
	System.out.println(names.get(0));
	
	names.set(1, "Aswene");
	names.remove(2);
	
	System.out.println(names);
	Collections.sort(names);
	System.out.println(names);
	
	for (String name : names){
	    System.out.println(name);
	}
	
	
	
	
}
}