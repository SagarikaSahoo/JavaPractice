package com.sagarika.tutorial45.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Application {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		
		map.put(5, "five");
		map.put(4, "four");
		map.put(2, "two");
		map.put(3, "three");
		
		
      String text = map.get(4);
      System.out.println(text);
      
      for(Map.Entry<Integer, String> entry: map.entrySet()){
    	  int key = entry.getKey();
    	  String value = entry.getValue();
    	  
    	  System.out.println(key + ": "+ value);
      }
    	  
	}

}
