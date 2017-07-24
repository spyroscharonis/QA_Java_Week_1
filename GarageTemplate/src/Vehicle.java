
public abstract class Vehicle {
	
	String registration; 
	String brand;
	int age;
	
	// constructor
	public Vehicle(String registration, String brand, int age) {
		this.registration = registration;
		this.brand = brand;
		this.age = age;
	}
	
	// make output a string
	public String toString() {
		return "Registration: " + this.registration + "Brand" + this.brand
				+ "Age: " + this.age;
	}
	
}
