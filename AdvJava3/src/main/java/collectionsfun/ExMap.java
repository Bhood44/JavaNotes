package collectionsfun;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExMap {

	public static void main(String[] args) {
		
		Person a = new Person("Achilles", 23, 160);
		Person b = new Person("Kratos", 27, 170);
		Person c = new Person("Icarus", 16, 145);
		Person d = new Person("Bob", 22, 155);
		
		// map is an object is that holds other objects
		Map<String, Integer> phoneBook = new TreeMap<String, Integer>();
		
		String tarek = "Tarek";
		String mcdonald = "McDonalds";
		
		Integer t_num = 555666;
		Integer m_num = 320111;
		
		// maps store objects as key value pairs
		// cannot iterate over a map
		
		phoneBook.put(tarek, t_num);
		phoneBook.put(mcdonald, m_num);
		
		//phoneBook.keySet();
		
		Map<Person, String> description = new HashMap<Person, String>();
		
		description.put(a, "John is a cool guy");
		description.put(c, "John is a cooler guy");
		description.put(b, "John is the coolest guy");
		
		System.out.println(description);
		
//		System.out.println(phoneBook);
//		System.out.println(phoneBook.get("Tarek"));
		
		// these below are not related to map
		
		// Queue which does not allow you to remove middle elements
		// You must add elements in a FIFO fashion
		// this is really just a time
		
		// Stack removes the last element added
		// LIFO Last in first out
		
		
	}

}
