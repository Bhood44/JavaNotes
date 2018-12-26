package inheritpoly;

public class Lion extends Animal {
	
	// the eat method was inherited w/o having to define it in this class
	public void roar() {
		System.out.println("Roooaaarrr!!!");
	}
	
	// this method the same signature as the parent class
	// therefore this method has been OVERRIDDEN in the subclass
	public void eat() {
		System.out.println("The lion is eating a big zebra");
	}
}
