package stringfun;

public class StringFun {

	public static void main(String[] args) {
		
		// To make a string you did not have to use the 'new' keyword
		String s1 = "Hello";
		String s2 = "Hello";
		// these two strings are exactly the same
		
		// This always compares the memory address for objects
		// These strings have the same address
		System.out.println(s1 == s2);
		// This property of two string of a value having the same address
		// is called the String pool
		
		// Java can recognize when you make strings of exactly the same value
		// that they can share the same memory address
		// It saves memory
		
		String s3 = new String("World");
		String s4 = new String("World");
		
		// we can force java to make new memory for out strings with 'new' keyword
		System.out.println(s3 == s4);
		
		// the .equals method will check the value not the memory address
		System.out.println(s3.equals(s4));
		
		// Strings are immutable objects.
		// Cannot be changes once created
//		System.out.println(s1);
//		System.out.println(s1.concat("Everyone"));
//		System.out.println(s1);
		
		// StringBUilder is a mutable version of String
		StringBuilder sb = new StringBuilder("Timothy");
		//System.out.println(s1);
		System.out.println(sb.reverse());
		System.out.println(sb.append(" James"));
		System.out.println(sb);
		
		// We use stringbuilder when we anticipate changing the string often
		// We use string to save memory in the application
		
		s1 = s1 + " Florida"; // reassigning the value 
	}

}
