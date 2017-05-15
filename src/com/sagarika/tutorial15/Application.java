package com.sagarika.tutorial15;

class App1 {
	int age;
	String name;

	void sample() {
		System.out.println("Hello");
	}
	/*int retirementAge(){
		int yearleft = 60 - age;
		
		return yearleft;
	}*/
	int getAge(){
		return age;
	}
	String getName(){
		return name;
	}
}

public class Application {

	public static void main(String[] args) {

		App1 app = new App1();
		app.age = 26;
		app.name = "Sagarika";
		app.sample();
		/*
		int year = app.retirementAge();
		System.out.println("The retirment age left is " + year);
		*/
		int age = app.getAge();
		String name = app.getName();
		System.out.println("The age is " + age);
		System.out.println("My name is " + name);
	}

}
