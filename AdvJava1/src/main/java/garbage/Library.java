package garbage;

public class Library {

	public static void main(String[] args) {

		// literally the most generic thing a thing can be
		Object o = new Object();
		// b returns the overridden toString method
		Object b = new Book("Farenheit 451", 200);
		Object b2 = new Book("Heart of Darkness", 230);
		Object b3 = new Book("Frankeistien", 125);
		
		//o.toString() // prints out value 
		//System.out.println(b.toString());
		
		System.out.println(b2.toString());
		
	}

}
