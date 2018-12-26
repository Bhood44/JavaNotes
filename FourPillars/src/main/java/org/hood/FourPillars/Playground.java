package org.hood.FourPillars;

public class Playground {
	
	public static void main(String [] main) {
		Car steves = new Car("Steve's Car", 30, 150);
		Car jims = new Car("Jim's Car", 20, 110);
		Car empty = new Car();
		
		jims.setTank(100);
		
		
		for(int i = 0; i < 100; i++) {
			jims.drive();
		}
		
//		jims.tank = 100;
//		System.out.println(jims.tank);
		
		steves.drive();
		System.out.println("Is the car moving? " + steves.isMoving);
	}
	
}