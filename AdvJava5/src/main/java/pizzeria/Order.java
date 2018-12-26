package pizzeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {

	List<Pizza> pizzas = new ArrayList<Pizza>();

	
	// if its not static it needs an object to attach to!

	public Pizza makePizza() {
		
		//Scanner scan = new Scanner(System.in);
		List<Topping> toppings = new ArrayList<Topping>();
		
		System.out.println("You've chosen to make a new pizza!");
		
		System.out.println("What would you like on your pizza?!");
		System.out.println("1 for pepperoni, 2 for meatballs, 3 anchovies");
		int choice = BrowserPizza.scan.nextInt();
		BrowserPizza.scan.nextLine();
		
		while(true) {
			
			System.out.println("1 for pepperoni, 2 for meatballs, 3 anchovies");
			
			switch(choice) {
			
				case 1: toppings.add(new Topping("Pepperoni", 2.00)); break;
				case 2: toppings.add(new Topping("Meatball", 1.00)); break;
				case 3: toppings.add(new Topping("Anchovies", 2.50)); break;
			}
			
			System.out.println("Press 0 to complete your order.");
			choice = BrowserPizza.scan.nextInt();
			BrowserPizza.scan.nextLine();
			
//			try {
//				
//			} catch(Exception e) {
//				System.out.println("SHAME ON YOU!!!");
//			}
			
			if(choice == 0) {
	
				int size = sizeChoice(); 
				Pizza p = new Pizza(size, toppings);
				pizzas.add(p);
				return p;
			}	
		}
	}

	public int sizeChoice() {
		
		System.out.println("What size pizza do you want?");
		System.out.println("1 for small, 2 for medium, 3 for large");
		
		int choice = BrowserPizza.scan.nextInt();
		BrowserPizza.scan.nextLine();
		
	return choice;
	}
	
}

