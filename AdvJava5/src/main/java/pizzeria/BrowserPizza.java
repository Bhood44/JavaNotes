package pizzeria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BrowserPizza {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		Order o = new Order();
		
		o.makePizza();
		o.makePizza();
		
		System.out.print(o.pizzas);

		
	}

}
