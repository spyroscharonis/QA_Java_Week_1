//Subclass Motorcycle 
class Motorcycle extends Vehicle {
	
	String motorcycle_type;
	
	public Motorcycle (String colour, String manufacturer, String fuelType, int maxSpeed, int num_of_wheels, int price) {
		super(colour, manufacturer, fuelType, maxSpeed, num_of_wheels, price); 
		this.motorcycle_type = motorcycle_type; 
	}
	
	public void printMotorcyleInfo() {
		System.out.println("Colour: " + colour);
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Fuel type: " + fuelType);
		System.out.println("Max Speed: " + maxSpeed);
		System.out.println("Number of wheels: " + num_of_wheels);
		   
		System.out.println("Motorcyle Type: " + motorcycle_type); 
	 }
	       
}