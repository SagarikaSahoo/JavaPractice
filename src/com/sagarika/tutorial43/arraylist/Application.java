package com.sagarika.tutorial43.arraylist;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();

		number.add(40);
		number.add(70);
		number.add(100);

		System.out.println(number.get(0));

		System.out.println("Interation :: 1");

		for (int i = 0; i < number.size(); i++) {
			System.out.println(number.get(i));
		}

		// removing numbers
		number.remove(2);

		System.out.println("Iteration :: 2");

		for (Integer value : number) {
			System.out.println(value);
		}
	}
}
