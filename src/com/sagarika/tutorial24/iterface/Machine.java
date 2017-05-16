package com.sagarika.tutorial24.iterface;

public class Machine implements Info {
	
	private int id = 7;
	
	public void start(){
		System.out.println("Machine start");
	}

	
	public void showInfo() {
		System.out.println("Machine start id " + id);
		
	}

}
