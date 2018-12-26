package inheritpoly;

public class Jungle {

	public static void main(String[] args) {
		
		// the eat method was inherited w/o me having to define it 
		

		// made an animal and called it an animal
		Animal a = new Animal();	// Creates the Animal object
		a.eat();
		
		// made a lion and called it a lion
		Lion l = new Lion();	// Creates the Lion object
		l.eat();
//		l.roar();
		
		
		// made a Lion and called it an animal
		Animal l2 = new Lion();	// Creates the Lion object
		l2.eat();				// assumes the class of animal and only has access to Animal methods
//		l2.roar();				us
		
		// Does not work
//		Lion a2 = new Animal();
		
		Mouse m = new Mouse();
		m.eat("Cheese");
		
		// the objects method is what is always used regardless of what it is labeled
	}
}
