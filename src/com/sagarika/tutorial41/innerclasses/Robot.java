package com.sagarika.tutorial41.innerclasses;

public class Robot {
	private int id;

	private class Brain {
		public void think() {
			System.out.println("Robot " + id + "is thinkng.");
		}
	}

	static class Battery {
		public void charge() {
			System.out.println("Battery charging ..");
		}
	}

	public Robot(int id) {
		this.id = id;
	}

	public void start() {
		System.out.println("startig robort" + id);

		Brain br = new Brain();
		br.think();

		class Temp {
			public void doSomething() {
				System.out.println("ID is : " + id);

			}

		}
		Temp temp = new Temp();
		temp.doSomething();
	}

}
