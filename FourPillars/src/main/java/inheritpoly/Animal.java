package inheritpoly;

public class Animal {

	//the eat method is OVERLOADED in this class
	// the same method name but different parms
	public void eat() {
		System.out.println("The animal is eating...");
	}

	// overloading 
	public void eat(String food) {
		System.out.println("The animal is eating " + food);
	}
}
