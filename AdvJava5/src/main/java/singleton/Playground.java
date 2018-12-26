package singleton;

public class Playground {

	public static void main(String[] args) {

		// Making the constructor private means i can't make another car
//		Car c = new Car("Ben's", 20);
//		Car d = new Car("Bean's", 20);
//		Car e = new Car("Bent's", 20);
		
		// I am not directly calling the constructor
		// I am calling a method that calls the constructor
		Car aaron = Car.getCar("Aaron's car", 100);
		
		// can delete the object
		//Car.car = null;
		
		// this does not make a car b/c the method does not allow it
		// cannot create new car object 
		Car jim = Car.getCar("Jim's car", 50);
		
		System.out.println(aaron);
		System.out.println(jim);
	}

}
