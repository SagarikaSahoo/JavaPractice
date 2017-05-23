package com.sagarika.tutorial46.sortedmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import com.sagarika.tutorial26.polymorphism.Tree;

public class Application {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedmap= new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		
		testMap(hashmap);
	}
		public static void testMap(Map<Integer, String> map){
			map.put(9, "Nine");
			map.put(5, "Five");
			map.put(4, "four");
			map.put(8, "eight");
			map.put(10, "ten");
			map.put(6, "six");
			
			for(Integer key: map.keySet()){
				String value = map.get(key);
				System.out.println(key + " "+ value);
			}
		}
	

}
