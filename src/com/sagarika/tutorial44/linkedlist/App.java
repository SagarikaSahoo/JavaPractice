package com.sagarika.tutorial44.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {
	 List<Integer> arraylist = new ArrayList<Integer>();
	 List<Integer> linkedlist = new LinkedList<Integer>();
	 
	 doTimings("Arraylist", arraylist);
	 doTimings("Linkedlist", linkedlist);

	}
   private static void doTimings(String type, List<Integer> list){
	   for(int i = 0; i<1E5; i++){
		   list.add(i);
	   }
	   long start = System.currentTimeMillis();
	   
	   for(int i=0; i<1E5; i++){
		   list.add(i);
	   }
	   
	   //Add items elsewhere in list
	   for(int i =0; i<1E5; i++){
		   list.add(list.size() - 100,i);
	   }
	   long end = System.currentTimeMillis();
	   
	   System.out.println("Time taken : "+ (end-start) + "ms for" +type);
   }
}
