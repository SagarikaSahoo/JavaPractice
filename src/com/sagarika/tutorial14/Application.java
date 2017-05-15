package com.sagarika.tutorial14;

class App {
	String name;
	int age;

	void speak() {
		for (int i =0;i<3;i++){
		System.out.println("My name is: "+ name + " and i am " + age + " yrs old");
	}}
}

public class Application {

	public static void main(String[] args) {
		App per = new App();
		per.name = "Sagarika";
		per.age = 26;
		per.speak();
		System.out.println(per.name);
		System.out.println(per.age);
	}

}
