package exceptional;

public class ExceptionPractice {

	public static void main(String[] args) {
		
		
		// Runtime exception Java cannot warn me that this is a problem
		try {
			// this line throws an ArithmeticExeption
			//System.out.println(6/0);
			
			// this line also throws an Arithmetic Exception
			//throw new ArithmeticException();
		
			empty();
			badMath();
			
		} catch(ArithmeticException ae) {
			System.out.println("Tried to divide by zero!!!!!");
		} catch(NullPointerException ne) {
			System.out.println("The object is null");
		} catch(Exception e){
			System.out.println("Something went wrong!");
		// regardless of anything that happens in the try 
		// the finally block will always happen
		} finally {
			System.out.println("This finally block will always execute");
		}
		
//		System.out.println("Hello");
	
	}
	public static void badMath() {
		try {
			//this threw exception
			int x = 5/0;
		} catch(ArithmeticException ae) {
			// exception caught in this block
			System.out.println("You cannot divide by 0");
		}
	}
	
	public static void empty() {
		String s = null;
		//trying to perform an instance method on an object that doesn't exist
		//null pointer exception
		System.out.println(s.length());
	}
}
