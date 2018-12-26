package abstraction;

public interface Carnivore { // a contract that must be fulfilled 

	
	public void eatMeats();
	
	// default is a way to create concrete method in a interface
	// it can still be overridden
	// if its not overridden it will use the default
	public default void chaseAnimal() {
		System.out.println("chasing ....");
	}
}
