package com.sagarika.tutorial29.generics;

import java.util.ArrayList;
import java.util.HashMap;

public class Application {

	public static void main(String[] args) {
		
		////// before java 5//////
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("orange");
		list.add("grapes");
		
		String fruit = (String)list.get(1);
		
		System.out.println(fruit);
		
		///////Modern java/////
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("cat");
		list1.add("dog");
		list1.add("hen");
		
		String animal = list1.get(1);
		
		System.out.println(animal);
		
		///////there can be more than one type //////
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
	}

}
