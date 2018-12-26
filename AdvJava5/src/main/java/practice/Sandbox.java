package practice;

public class Sandbox {

	// everything you wanted to know about static
	// but were too afraid to ask
	
	// static means unmoving
	// for java this means the memory location
	// unmoving where that variable lives
	
	
	// the static block executes the moment that a class is called or 'loaded'
	static {System.out.println("Hello");}
	
	public static void main(String[] args) {
		// static means it belongs to the class
		
		Glaze.sayHello();
		
		Glaze g = new Glaze();
		
		g.hola();
		
//		System.out.println(Donut.x);
	}

}
