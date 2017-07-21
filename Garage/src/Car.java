// Subclass Car 
class Car extends Vehicle {
	
	int num_of_gears;
	int engineSize;
	boolean isConvertible; 
	
	public Car (String colour, String manufacturer, String fuelType, int maxSpeed, int num_of_wheels, int price) {
		super(colour, manufacturer, fuelType, maxSpeed, num_of_wheels, price); 
		this.isConvertible = isConvertible; 
	}
	   
	public void printCarInfo() {
		System.out.println("Colour: " + colour);
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Fuel type: " + fuelType);
		System.out.println("Max Speed: " + maxSpeed);
		System.out.println("Engine Size: " + engineSize);
		System.out.println("Number of wheels: " + num_of_wheels);
		   
		System.out.println("Number of gears: " + num_of_gears);
		System.out.println("Engine Size: " + engineSize); 
	  }
	       
}