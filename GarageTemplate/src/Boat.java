
public class Boat extends Vehicle {
	
	int numOfPropellers;
	
	// constructor
	public Boat(String registration, String brand, int age, int numOfPropellers) {
		super(registration, brand, age);
		this.numOfPropellers = numOfPropellers;
	}
	
	public String toString() {
		return super.toString() + "Number of Propellers: " + this.numOfPropellers; 
	}

}
