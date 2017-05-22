package com.sagarika.tutorial41.innerclasses;

public class Application {

	public static void main(String[] args) {
		Robot robo = new Robot(7);
		robo.start();

		/*
		 * Robot.Brain br = robo.new Brain(); br.think();
		 */

		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}

}
