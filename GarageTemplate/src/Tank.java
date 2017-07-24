
public class Tank extends Vehicle {
	
	double firePower;
	
	// constructor 
	public Tank(String registration, String brand, int age, double firePower) {
		super(registration, brand, age); 
		this.firePower = firePower;
	}
	
	public String toString() {
		return super.toString() + "Fire Power: " + this.firePower; 
	}

	
}
