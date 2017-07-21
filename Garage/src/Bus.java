//Subclass Bicycle 
class Bus extends Vehicle {
	
	int num_of_seats;
	
	public Bus (String colour, String manufacturer, String fuelType, int maxSpeed, int num_of_wheels, int price) {
		super(colour, manufacturer, fuelType, maxSpeed, num_of_wheels, price); 
		this.num_of_seats = num_of_seats; 
	}
	
	public void printBicyleInfo() {
		System.out.println("Colour: " + colour);
		System.out.println("Manufacturer: " + manufacturer);
		System.out.println("Fuel type: " + fuelType);
		System.out.println("Max Speed: " + maxSpeed);
		System.out.println("Number of wheels: " + num_of_wheels);
		   
		System.out.println("Number of Seats: " + num_of_seats); 
	 }
	       
}