package com.sagarika.tutorial31.anonymousclass;

class Machine {
	public void start() {
		System.out.println("machine start");
	}
}

interface Hello {
	public void grow();

}

public class Application {

	public static void main(String[] args) {
		Machine mn = new Machine() {
			@Override
			public void start() {
				System.out.println("Camera running");
			}

		};
		mn.start();

		Hello rn = new Hello() {

			@Override
			public void grow() {
				System.out.println("heeloll");

			}
		};
		rn.grow();

	}
}
