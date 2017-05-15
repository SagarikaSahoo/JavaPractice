package com.sagarika.tutorial06;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		//Create Scanner object
	 Scanner input = new Scanner(System.in);
	 //Output of the prompt
	 System.out.println("Enter the text");
	 
	 //Waiting for the input
	 String value = input.nextLine();
	 //Result what user has entered
	 System.out.println("Your string entered: " +value );

	}

}
