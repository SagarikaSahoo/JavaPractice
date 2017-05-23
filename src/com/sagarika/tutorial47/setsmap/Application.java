package com.sagarika.tutorial47.setsmap;

import java.util.Set;
import java.util.TreeSet;

public class Application {

	public static void main(String[] args) {

		//Set<String> set1 = new HashSet<String>();
		
		Set<String> set1 = new TreeSet<String>();
		set1.add("dog");
		set1.add("cat");
		set1.add("hen");
		set1.add("bear");
		set1.add("frog");
		
		//Adding duplicates
		
		set1.add("hen");

		System.out.println(set1);
	}

}
