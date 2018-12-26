package comparison;

public class Judge {
	
	public static void main(String [] args) {
		
		Orange orange = new Orange();
//		
//		//Java wont know the difference of object with casting
//		//Object orange = new Object();
//		
//		// lets you if something is something else
//		System.out.println(orange instanceof Fruit);
//		
//		// Incompatible parameter
//		//System.out.println(orange instanceof Apple);
//		
//		System.out.println(orange instanceof Object);
//		
//		
//		// we can cast an object to be another object
//		// but we run the risk of making a mistake
//		Orange orange2 = (Orange) orange;
//		
//		orange2.makeJuice();
		
		Apple a = new Apple();	
		a.mass = 100;
		
		Orange o = new Orange();
		o.mass = 100;
		
		System.out.println(a.hashCode());
		
		// returns true b/c we overrode the equals method
		System.out.println(a.equals(o));
	}

}
