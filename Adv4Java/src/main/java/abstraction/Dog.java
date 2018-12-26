package abstraction;

public class Dog extends Animal implements Herbivore, Carnivore, Petable {

	@Override
	public void makeSound() {
	
		System.out.println("bark bark bark !");
	}
	
	public void eatMeats() {	
		System.out.println("the dog tears at it with canines");
	}
	
	public void eatPlants() {
		System.out.println("the dog eats broccoli");
	}
	
}
