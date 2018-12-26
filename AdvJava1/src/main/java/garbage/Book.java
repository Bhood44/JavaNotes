package garbage;

public class Book {
	
	private String name;
	private int pages;
	
	public Book(String name, int pages) {
		super();
		this.name = name;
		this.pages = pages;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}
	
	// Annotation are instructions
	//
	//
	
	@Override 
	public String toString() {
		return "Hello I'm a book. Title: " + this.name + " Pages: " + this.pages;
	}
	
	// you should never use the finalize method
	@Override // This is bad practice and its been bad practice for decades
	public void finalize() {
		System.out.println("The book " + this.name + " has been collected");
	}
	
}
