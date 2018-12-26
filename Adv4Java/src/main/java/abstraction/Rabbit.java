package abstraction;


// anytime you make an object all of its methods have to be define
public class Rabbit extends Animal implements Herbivore, Petable {

	
	public void makeSound() {
		System.out.println("a brushel in the grass...");
	}
	
	public void eatPlants() {
		System.out.println("Eating carrots...");
	}
}
