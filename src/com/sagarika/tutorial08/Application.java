package com.sagarika.tutorial08;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner text = new Scanner(System.in);
		System.out.println("Enter the command");

		String input = text.nextLine();
		switch (input) {
		case "start":
			System.out.println("Machine Start");
			break;
		case "stop":
			System.out.println("Machine Stopped");
			break;
		default:
			System.out.println("Command not found");
		}
	}
}
