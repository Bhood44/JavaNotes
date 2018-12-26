package comparison;

public class Orange implements Fruit {
	
	int mass;
	
public void makeJuice() {
		
//		Object orange = new Orange();
//		
//		System.out.println(orange instanceof Fruit);
//		System.out.println(orange instanceof Object);
	}

	@Override	// hash code is just a int; hopefully it makes your objects unique
	public int hashCode() {
		int result = 1;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orange other = (Orange) obj;
		if (mass != other.mass)
			return false;
		return true;
	}


}
