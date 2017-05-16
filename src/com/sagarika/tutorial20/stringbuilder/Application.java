package com.sagarika.tutorial20.stringbuilder;


public class Application {

	public static void main(String[] args) {
		String info = "";
		info += "My name is saga.";
		info += " ";
		info += "I am a coder";
		
		System.out.println(info);
		
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is saga");
		sb.append(" : ");
		sb.append("I am a looser hehe...");
		
		StringBuilder s = new StringBuilder();
		
		s.append("My name is khan")
		.append(" ")
		.append("i am a runner. ");
		
		System.out.println(s.toString());
		
		////Formating///////
		
		System.out.println("Here is some text. \t that was tab . \n that was new line");
		System.out.println("More text.");

	}

}
