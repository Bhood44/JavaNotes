package pdmotors;

public class SalesPerson implements Isales {
	
	String name;
	String id;
	double sellQuality;
	int carsSold;
	boolean onRoster = false;

	public SalesPerson(String name, String id, double sellQuality, int carsSold, boolean onRoster) {
		
		this.name = name;
		this.id = id;
		this.sellQuality = sellQuality;
		this.carsSold = carsSold;
		this.onRoster = onRoster;
	}

	public double calcSalesPrice( ) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		return "SalesPerson [name=" + name + ", id=" + id + ", sellQuality=" + sellQuality + ", carsSold=" + carsSold
				+ ", onRoster=" + onRoster + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSellQuality() {
		return sellQuality;
	}

	public void setSellQuality(double sellQuality) {
		this.sellQuality = sellQuality;
	}

	public int getCarsSold() {
		return carsSold;
	}

	public void setCarsSold(int carsSold) {
		this.carsSold = carsSold;
	}

	public boolean isOnRoster() {
		return onRoster;
	}

	public void setOnRoster(boolean onRoster) {
		this.onRoster = onRoster;
	}

	
}
