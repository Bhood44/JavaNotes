package constructors;

public class Dwelling {

	// instance variables = fields	
	int area;
	String name;
	
	// this is the no args constructor
	public Dwelling() {
		this(100, "Something place");
		System.out.println("I made my own default values and passed them");
		
//		System.out.println("Buidling a dwelling which you gave me no instructions for..");
//		this.area = 100;
//		this.name = "Something place";
	}

	// you can overload to your heart's content
	public Dwelling(int area, String name) {
		System.out.println("Buidling a dwelling with instructions..");
		this.area = area;
		this.name = name;
	}
	
	public Dwelling(boolean b) {
		
		if(b == true) {
			this.area = 200;
			this.name = "Another place";
		} else {
			System.out.println("Buidling a dwelling with no instructions..");
		}
	}
	
	 
}
