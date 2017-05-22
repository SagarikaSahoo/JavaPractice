package com.sagarika.tutorial36.AbstractClass;

public abstract class Machine {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public abstract void start();
	public abstract void doStuffs();
	
	
		public void run() {
			start();
			doStuffs();
		}
	}


