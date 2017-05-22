package com.sagarika.tutorial42.passingbyvalues;

public class Application {

	public static void main(String[] args) {
		Application app = new Application();

		int value = 7;
		System.out.println("1.Value is: " + value);

		app.show(value);
		System.out.println("1.Value is: " + value);
	}

	public void show(int value) {
		System.out.println("2.Value is: " + value);

	}

}
