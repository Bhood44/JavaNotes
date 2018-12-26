package scan;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ScannerPractice {

	public static void main(String[] args) {
		
//		System.out.print("Hello what is your name? ");
//		Scanner scan = new Scanner(System.in);
//		String name = scan.next();
//		System.out.println("Hello, " + name + " What math operation would you like the do?");
		boolean quit = false;
		
		do {
			try {
				System.out.println("1. Add"); // add
				System.out.println("2. Subtract"); // subtract
				System.out.println("3. Multiply"); // multiply
				System.out.println("4. Divide"); // divide
				
				System.out.print("Enter Option(1-4): ");
				Scanner scan1 = new Scanner(System.in);
				int option = scan1.nextInt();
				
				
				if(option == 1) {
					System.out.println("Addition : ");
					System.out.print("Enter first number: ");
					float num1 = scan1.nextFloat();
					System.out.print("Enter second number: ");
					float num2 = scan1.nextFloat();
					
					try {
						add(num1, num2);
					} catch(ArithmeticException ae) {
						System.out.println("IT DOESNT WORK");
					}
				/********************************************/	
				} else if(option == 2) {
					System.out.println("Subtraction : ");
					System.out.print("Enter first number: ");
					float num1 = scan1.nextFloat();
					System.out.print("Enter second number: ");
					float num2 = scan1.nextFloat();

					try {
						subtract(num1, num2);
					} catch(ArithmeticException ae) {
						System.out.println("IT DOESNT WORK");
					}
				/********************************************/
				} else if(option == 3) {
					System.out.println("Multiplication : ");
					System.out.print("Enter first number: ");
					float num1 = scan1.nextFloat();
					System.out.print("Enter second number: ");
					float num2 = scan1.nextFloat();

					try {
						multiply(num1, num2);
					} catch(ArithmeticException ae) {
						System.out.println("IT DOESNT WORK");
					}
				/********************************************/		
				} else if(option == 4) {
					System.out.println("Division : ");
					System.out.print("Enter first number: ");
					float num1 = scan1.nextFloat();
					System.out.print("Enter second number: ");
					float num2 = scan1.nextFloat();

					try {
						divide(num1, num2);
					} catch(ArithmeticException ae) {
						System.out.println("IT DOESNT WORK");
					}
					
				} else {
					System.out.println("Not a valid option... Please retry!");
				}
			} catch(InputMismatchException e) {
				System.out.println("Exiting calculator...");
				break;
			}
			
		} while (!quit);

	}
	
	public static float add(float num1, float num2) {
		float sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
		return sum;
	}

	public static float subtract(float num1, float num2) {
		float sum = num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " + sum);
		return sum;
	}
	
	public static float multiply(float num1, float num2) {
		float sum = num1 * num2;
		System.out.println(num1 + " * " + num2 + " = " + sum);
		return sum;
	}
	
	public static float divide(float num1, float num2) {
		float sum = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + sum);
		return sum;
	}
}
