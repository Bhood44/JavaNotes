package inheritpoly;

public class Mouse extends Animal {

	// When you override you keep the method exactly the same except the implementation
	// the method signature stay the same
	public void eat(String food) {
		System.out.println("The mouse is eating " + food);
	}
}
