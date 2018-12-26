package garbage;

public class Clean {
	
	public static void main(String [] args) {
		// Garbage Collection
		// once a object is deemed unreachable or not referenced anymore in the code
		// It is marked as eligible for garbage collection aka deletion 
		// objects have finalized a method that is called when an item is garbage collection
		
		Book w = new Book("Wuthering Height", 270);
		// if nothing is pointing to object then it will be thrown out
		// marked for collection if out of scope or if marked null
		
		//Book b = w; //
		// w rather than pointing to a book now points to nothing 
		//w = null;
		destroy(w);
		
		// 'requests' that all objects marked for collection be collected
		System.gc();
	}

	public static void destroy(Book b) {
		// in java you cannot destroy objects 
		// can ignore for garbage collection
		b = null;
	}
}
