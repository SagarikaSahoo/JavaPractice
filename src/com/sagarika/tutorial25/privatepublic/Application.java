package com.sagarika.tutorial25.privatepublic;

/*
  * private -- only within the same class
  * protected -- sub class and same package
  * public-- anywhere
  * no modifier -- same package only
 */
import world.Plant;

public class Application {

	public static void main(String[] args) {
		
		Plant pt = new Plant();
		System.out.println(pt.name);
		System.out.println(pt.id);
		
		// wont work....
        //System.out.println(pt.type);
		
		//size is protected. and field is not there in the same package.
		//System.out.println(pt.size);
		//it wont work.
		//System.out.println(pt.height);
		
	}

}
