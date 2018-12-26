package constructors;

public class House extends Dwelling {
	int walls;
	
	public House() {
		super(); 
		System.out.println("Building a house with no instructions");
		this.walls = 4;
	}
	
	public House( int area, String name, int walls) {
		super(area, name);
		this.walls = walls;
		System.out.println("Built a house with instructions");
	}
}
