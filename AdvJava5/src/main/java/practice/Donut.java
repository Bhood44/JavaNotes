package practice;

public class Donut {

	// every object can point to this address
	// belongs to the 'ideal form'
	static int x = 100; // in the cloud
	
	// belongs to each individual stance/object
	int y = 0;	// every donut object can get that y

	static int glaze_Num = Glaze.g;
	// when ever a class is first called it will be loaded into the load time
	// and all static blocks will be executed
	// this only happens once per class
	static {System.out.println("Hello i am a static block in donut");}
	
}
