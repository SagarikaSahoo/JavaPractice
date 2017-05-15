package com.sagarika.tutorial16.methodparameters;

 class Robot{
	public void speak(String text){
		System.out.println(text);
	}
	public void height(int distance){
		System.out.println("The distance " + distance);
	}
	public void move(String direction,double dist){
		System.out.println("the direction is " + direction + " and distance is " + dist);
	}
}
public class App {
	public static void main(String[] args) {
		Robot rb = new Robot();
		rb.speak("Hello Raj");
		rb.height(6);
		rb.move("south", 5.2);
		
		String greeting = "R u there";
		rb.speak(greeting);
		
	}
	
}
