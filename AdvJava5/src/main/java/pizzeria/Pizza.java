package pizzeria;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
	
	int size;
	List<Topping> toppings = new ArrayList();
	
	double cost;

	public Pizza(int size, List<Topping> toppings) {
		
		this.size = size;
		this.toppings = toppings;
		
		this.cost =  toppingsCost() + sizeCost();
		
	}
	
	public double toppingsCost() {
		double sum = 0;
		
		for(Topping t: toppings) {
			sum = sum + t.price;
		}
		return sum;
	}
	
	public double sizeCost() {
		
		if(size == 1) {
			return 12;
		} else if (size == 2) {
			return 16;
		} else {
			return 20;
		}
	}

	@Override
	public String toString() {
		return "Pizza [size=" + size + ", toppings=" + toppings + ", cost=" + cost + "]";
	}
	
	
}
