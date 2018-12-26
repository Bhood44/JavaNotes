package collectionsfun;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ExInterator {

	public static void main(String[] args) {
		
		//List<Person> people = new ArrayList<Person>();
		
		Person a = new Person("Achilles", 23, 160);
		Person b = new Person("Kratos", 27, 170);
		Person c = new Person("Icarus", 16, 145);
		Person d = new Person("Bob", 22, 155);
		
		// a list can have duplicates of the same object
		// the order is preserved
//		people.add(a); // 0
//		people.add(b); // 1
//		people.add(c); // 2
//		people.add(d); // 3
//		people.add(c);
		
		
		// you can not have duplicates in a set
		// order is not preserved
		Set<Person> peeps = new TreeSet<Person>();
		
		peeps.add(c);
		peeps.add(c);
		peeps.add(d);
		peeps.add(b);
		
//		peeps.addAll(people);
		
		System.out.println(peeps);
		
//		System.out.println(people);
		
		// you don't have the [] like an array
		// you use the get method
		//Person a2 = people.get(2);
		
		//System.out.println(people.indexOf(a));
		
		//Iterator<Person> iter = people.iterator();
		
		// this is like a for loop where you check the length
		// here you check to see if there is another element before
		// executing the code again
//		while(iter.hasNext()) { // while there is something next
//			
//			Person p = iter.next();
//			p.sayHello();
//		}
		
		// enhanced for loop
//		for(Person p : people){ // java for each version
//			p.sayHello();
//		}
		
	}

}
