package com.sagarika.tutorial21.tostringmethod;

class Frog{
	
	private String name;
	private int id;
	
	public Frog(String name ,int id){
		this.name = name;
		this.id = id;
	}
	public String toString(){
		
		return String.format("%4d: %s", id,name);
		/*StringBuilder sb = new StringBuilder();
		sb.append(name).append(":").append(id);
		return sb.toString();*/
	}
}
public class Application {

	public static void main(String[] args) {
		
        Frog fg = new Frog("saga", 7);
        Frog fg1 = new Frog("Sahoo", 5);
        
        System.out.println(fg);
        System.out.println(fg1);
	}

}
