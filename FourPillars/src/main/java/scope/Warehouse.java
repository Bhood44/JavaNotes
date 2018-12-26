package scope;

public class Warehouse {

		public static void main(String[] args) {
			
			// Static is know as the class scope!!!
			// not having the static makes the variable instance 
			
			Box a = new Box();
			a.value = 1000;
			
			Box b = new Box();
			b.value = 2000;
			
			a.printValue();
			b.printValue();
			
			// always shared b/c it is the static value
//			a.staticValue = 20;
			Box.staticValue = 40000;
			
			// These two lines are the same as
//			a.printStaticValue();
//			b.printStaticValue();
			
			// this
			Box.printStaticValue();
		}
		
		public static void hello() {
			
			// it is initialized in a method therefore it is method scope
			// it cannot leave this method
			String name = "Michelle";
			
			// Java also has block scope 
			// There is no special keyword like js and let
			if(true) {
				int blocko = 10;
			}
		//	blocko = 20;	variable cannot be used
		}
}
