package pdmotors;

public abstract class Vehicle {

	protected String make;
	protected String model;
	protected double basePrice;
	protected boolean soldFlag;
	
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", basePrice=" + basePrice + ", soldFlag=" + soldFlag
				+ "]";
	}

	public Vehicle(String make, String model, double basePrice, boolean soldFlag) {
		
		this.make = make;
		this.model = model;
		this.basePrice = basePrice;
		this.soldFlag = soldFlag;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public boolean isSoldFlag() {
		return soldFlag;
	}
	public void setSoldFlag(boolean soldFlag) {
		this.soldFlag = soldFlag;
	}

	
}
