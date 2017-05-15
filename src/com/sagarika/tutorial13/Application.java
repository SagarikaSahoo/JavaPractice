package com.sagarika.tutorial13;

class Person{
	String name;
	int age;
}
public class Application {

	public static void main(String[] args) {
		
		Person per = new Person();
		per.name = "Sagarika";
		per.age = 23;
		
		Person per1 = new Person();
		per1.name = "sahoo";
		per1.age = 23;
		
		System.out.println(per.name);
		System.out.println(per1.name);
		System.out.println(per1.age);
		System.out.println(per1.age);

	}

}
