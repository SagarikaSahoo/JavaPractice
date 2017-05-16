package com.sagarika.tutorial19.staticandfinal;
class Thing{
	public final static int luckynumber = 7;
	public String name;
	public static String description;
	
	public void showName() {
		System.out.println(description + ":" + name);
	}
	public static void showInfo(){
		System.out.println(description);
	}
}
public class Application {

	public static void main(String[] args) {
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		Thing.description = "hey";
		
		thing1.name = "hello";
		thing2.name = "There";
		
		thing1.showName();
		thing2.showName();
		
		System.out.println(Thing.luckynumber);

	}

}
