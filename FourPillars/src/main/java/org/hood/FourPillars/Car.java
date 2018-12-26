package org.hood.FourPillars;

public class Car{
	//fields
	String name;
	int mpg;
	int hp;
	double miles; // Odometer 
	double gasUsed;
	private double tank; // user won't be able to access unless using method inside class
	boolean isMoving;
	// constructor build an inheritance of the class aka an object
	
	public Car(String nameParm, int mpgParm, int hpParm) {
		this.name = nameParm;
		this.mpg = mpgParm;
		this.hp = hpParm;
		
	}
	
	//Default constructor
	public Car() {
		
	}
	
	public void drive() {
		
		setTank(getTank() - 5);
		
		if(getTank() > 0) {
			this.isMoving = true;
			System.out.println(this.name + " is moving. Gas: " + getTank());
		} else {
			this.isMoving = false;
			System.out.println("Out of gas!");
		}		
	}
	
	public void drive(double distance) {
		this.miles = this.miles + distance; 
		double gasUsed = this.miles/this.mpg;
		this.tank = this.tank - gasUsed;
		setTank(this.tank);	
	}
	
	public void setTank(double tankParm){
        if(tankParm <= 0) {
            this.tank = 0;
        } else {
        	this.tank = tankParm;
        }
    }

    public double getTank(){
        return this.tank;
    }
}
