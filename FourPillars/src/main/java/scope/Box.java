package scope;

public class Box {

	// 'this' variable is attached to one an only one object
	// instance of the class b/c it belongs to one object aka one instance
	int value = 0;
	// the static value belongs to the class and therefore to every object of this class
	// this is static (class) scope b/c it is shared by every object or in other words is belongs
	// to the class
	static int staticValue = 100;
	
	public void printValue() {
		System.out.println("the value of the box is " + this.value);
	}
	
	public static void printStaticValue() {
		System.out.println("the value of the box is " + Box.staticValue);
	}
}
