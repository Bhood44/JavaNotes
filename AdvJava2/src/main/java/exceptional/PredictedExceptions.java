package exceptional;

import java.io.*;

public class PredictedExceptions {

		public static void main(String [] args) {
			
			File stuff = new File("Sea:\\Users\\Benjamin\\Documents\\BHood-Assign1.docx");
			System.out.println(stuff.exists());
			
			// in a checked exception Java forces me to handle situations in which
			// the unhappy path occurs
			try {
				FileReader reader = new FileReader(stuff);
			} catch(FileNotFoundException e) {
//				e.printStackTrace();
				System.err.println("Hello");
			}
			
//			try {
//				throw new MyException();
//			} catch(MyException e) {
//				e.printStackTrace();
//			}
			
			try {
				readFile();
			} catch(FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		// if you use this method be careful. This exception might occur and it is your
		// Responsibility to handle it b/c this method does not have a try catch
		// throws = ducks
		public static void readFile() throws FileNotFoundException {
			
			File stuff = new File("Sea:\\Users\\Benjamin\\Documents\\BHood-Assign1.docx");
			System.out.println(stuff.exists());
			
			// you do not have to handle immediately the exception
			// you can pass along that responsibility to another piece of the code
				FileReader reader = new FileReader(stuff);
			
		}
		
}
