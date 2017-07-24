
public class Car extends Vehicle {
	
	boolean isConvertible;
	
	//Constructor
	public Car(String registration, String brand, int age, boolean isConvertible) {
		super(registration, brand, age); 
		this.isConvertible = isConvertible;
	}
	
	public String toString() {
		return super.toString() + "Convertible(T/F): " + this.isConvertible; 
	}


}
