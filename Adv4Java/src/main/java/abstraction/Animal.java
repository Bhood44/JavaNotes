package abstraction;

//the abstract means I cannot build an stance of this class -- cannot instantiate the object
//you can have only concrete methods in a abstract class
public abstract class Animal {
	
	String name;
	int age;
	boolean alive = true;
	
	// this method ensures that in the subclass you require you override that method
	// we make the method abstract so that it must be overridden in the subclass
	public abstract void makeSound();

	public void isAlive() {
		if(alive == true) {
			System.out.println("I'm alive..");
		}
	}

}
