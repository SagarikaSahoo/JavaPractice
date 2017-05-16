package com.sagarika.tutorial24.iterface;

public class Application {

	public static void main(String[] args) {

      Machine mn1 = new Machine();
      mn1.start();
      
      Person p1 = new Person("Saga");
      p1.greet();
      
      Info info1 = p1;
      info1.showInfo();
      
      Info info2 = new Machine();
      info2.showInfo();
    		  
	}

}
