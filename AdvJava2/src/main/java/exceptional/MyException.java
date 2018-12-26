package exceptional;

public class MyException extends Exception {

	public MyException () {
		System.err.println("You messed up!");
	}
}
