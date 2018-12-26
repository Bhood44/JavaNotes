package abstraction;

import java.util.ArrayList;
import java.util.List;

public class Playground {

	public static void main(String[] args) {
		
		//Animal animal = new Animal();
		// cannot instantiate an abstract class
		
		Animal lion = new Lion();
		Animal dog = new Dog();
		Rabbit rabbit = new Rabbit();
		StuffAnimal ted = new StuffAnimal();
		
		
		// this marker interface is another viable label
		Petable poodle = new Dog();
		
		List<Petable> pets = new ArrayList<Petable>();
		pets.add(poodle);
		pets.add(rabbit);
		pets.add(ted);
		
		
		// cannot add dog to petable b/c its listed as animal that not petable
		
		// the carnivore methods cannot be seen and neither the animal
		Herbivore herb = new Dog();
		
		herb.eatPlants();
		
		lion.makeSound();
		dog.makeSound();
		
	}

}
