package singleton;

// there should only be one car
// The Singleton design pattern is to ensure there is ever only one object of the class

// think in terms of a board game you only want one or none
// or the case of a database one connection to a db otherwise more will slow you down

// car class is a blueprint to make a car object
//
public class Car {
	
	String name;
	int tank;
	
	// creating a instance of a car in its class
	
	// car object of nothing attached to class
	// the class has a car object that is null
	// STATIC means it belongs to the class not the instance of a object
	// just attaching a object to a class
	public static Car car = null;

	// private constructor is needed for the singleton design pattern
	// a private constructor for the object
	private Car(String name, int tank) {
		this.name = name;
		this.tank = tank;
	}

	// encapsulation
	// using a method that uses the constructor the get a car
	
	// ?? STATIC vs INTANCE ??
	
	
	// Guarantees that the car will only be return
	// either an existing car or a new one 
	// fancy getter
	public static Car getCar(String name, int tank) {
		
		if(car == null) {
			car = new Car(name, tank);
		}
		
		return car;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", tank=" + tank + "]";
	}

}
