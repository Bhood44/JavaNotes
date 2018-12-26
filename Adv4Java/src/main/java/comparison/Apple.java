package comparison;

public class Apple implements Fruit {

	int mass;
	String company;

	// hashing is usually a pretty good way to determine if a oject's value is unique
	// we are not comparing memory addresses
	// objects with the same hash number but are no the same values => hash collision
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + mass;
		return result;
	}

	@Override
	
	// compare two object to see if they are equal
	// definition of equals depends on the "you"
	public boolean equals(Object obj) {
		
		Orange o = (Orange) obj;
		if(o.mass == this.mass) {
			return true;
		}
		
		return false;
	}
	
}
