package com.sagarika.tutorial17.setterandthis;


class Frog {
	private String name;
	private int age;

	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age = age;
				
	}
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}

public class Application {

	public static void main(String[] args) {
      Frog fg = new Frog();
      //fg.name = "Aj";
      //fg.age = 8;
      
      fg.setName("Simmu");
      fg.setAge(26);
     
      System.out.println(fg.getName());
      System.out.println(fg.getAge());
	}

}
