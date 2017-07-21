import java.util.ArrayList;

public class Garage {
	
	int capacity = 100;
	boolean isFull; 
		
	// constructor 
	public Garage(int capacity, boolean isFull) {
		this.capacity = capacity;
		this.isFull = isFull;
	}
	
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(); 

	// add a vehicle to the garage 
	public void addVehicle(Vehicle v) {
		vehicles.add(v); 
	}
	
	// populate the garage with vehicles 
	public void fillGarage() {
	
		for (int i = 0; i < 10; i++) { // 10 cars
			addVehicle(new Car("Silver", "Audi", "petrol", 250, 4, 40000));
		}
		for (int i = 0; i < 20; i++) { // 20 motorcycles
			addVehicle(new Motorcycle("Red", "Suzuki", "petrol", 300, 2, 80000));
		}
		for (int i = 0; i < 3; i++) { // 3 buses 
			addVehicle(new Bus("White", "Volvo", "diesel", 140, 4, 100000));
		}
		
	}
	
	// Calculate bill for each type of vehicle 
	public int chargeVehicle() {
		
		int price = 0; 
		
		for (int i = 0; i < vehicles.size(); i++) {
			
			if(vehicles.get(i) instanceof Car) { // charge 10 GBP per car 
				price += 10;
			}
			else if(vehicles.get(i) instanceof Motorcycle) { // charge 5 GBP per motorcycle 
				price += 5;
			}
			else if(vehicles.get(i) instanceof Bus) { // charge 25 GBP per bus 
				price += 25; 
			}
		}
		
		return price; 
	}
			

	// remove all buses from the garage  
	public void removeVehicle () {
		
		for(int i = 0; i <= vehicles.size(); i++) {
			
			if(vehicles.get(i) instanceof Car) {
				continue;
			}
			else if(vehicles.get(i) instanceof Motorcycle) {
				continue;
			}
			else if(vehicles.get(i) instanceof Bus) {
				vehicles.remove(i); 
			}
			
		}
	}
	
	// calculate the total charge for all vehicles 
	public int calculateBill() {
		return chargeVehicle(); 
	}
	
	
	// empty the garage completely 
	public void vacateGarage() {
		vehicles.clear(); 
	}
	
	public void main() {
		
		addVehicle(new Car("Black", "Audi", "petrol", 250, 4, 50000));
		addVehicle(new Bus("White", "Volvo", "diesel", 140, 4, 100000));
		addVehicle(new Motorcycle("Red", "Suzuki", "petrol", 300, 2, 80000)); 
		
		System.out.println(chargeVehicle()); 
		removeVehicle();
		calculateBill();
		vacateGarage();
	}

} // End of class 

	

	






	
