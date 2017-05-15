package com.sagarika.tutorial07;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int value = 0;
		do {
			System.out.println("Enter the text ");
			value = scanner.nextInt();
		} while (value != 5);
		{
			System.out.println("Got 5!");
		}

	}

}
