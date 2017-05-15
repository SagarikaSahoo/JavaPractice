package com.sagarika.tutorial18.constructors;

class Machine{
	
	String name;
	int code;
	
	public Machine(){
		this.name=name;
		System.out.println("1st constructor running");
	}
	public Machine(int code){
		this.code = code;
		System.out.println("2nd constructor running");
	}
}
public class Application {

	public static void main(String[] args) {
		Machine mn = new Machine();
		Machine mn1 = new Machine(12);
		

	}

}
