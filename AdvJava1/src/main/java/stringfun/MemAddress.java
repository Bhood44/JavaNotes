package stringfun;

import garbage.Book;

public class MemAddress {

	public static void main(String[] args) {
		
		Book b1 = new Book("Frankenstien", 100);	// these books are in separate memory locations
		Book b2 = new Book("Frankenstien", 100);	// the new keyword means its a 'new' object
		// an object that never existed before. It allocates 'new memory' and another location
		
		int x = 10;
		int y = 10;
		
		// '==' with primitives it checks the value of a variable
		System.out.println(x == y);
		
		// '==' with objects it compares the location(memory address) of the object not the value 
		System.out.println(b1 == b2);
	}

}
