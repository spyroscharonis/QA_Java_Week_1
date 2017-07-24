import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle v) {
		vehicleList.add(v);
	}
	
	public void removeVehicleById(String registration) {
		for(int i = 0; i < vehicleList.size(); i++) {
			if(vehicleList.get(i).registration == registration) {
					vehicleList.remove(i); 
			}
		}
	}
	
	
	public void removeVehicleByType(String type) {
		for (Vehicle v: vehicleList) {
			
			if (type.equals("Car") && v instanceof Car) {
				vehicleList.remove(v);
			}
			else if (type.equals("Boat") && v instanceof Boat) {
				vehicleList.remove(v);
			}
			else if (type.equals("Tank") && v instanceof Tank) {
				vehicleList.remove(v);
			}
			
		}
	}
	
	
	public void inGarage() {
		for (Vehicle v : vehicleList) {
			System.out.println(v);
		}
	}
		
	
	public void billVehicles() {
		for (int i = 0; i < vehicleList.size(); i++) {
			
			if (vehicleList.get(i) instanceof Car) {
				System.out.println("£50");	
			}
			else if (vehicleList.get(i) instanceof Boat) {
				System.out.println("£500");
			}
			else if (vehicleList.get(i) instanceof Tank) {
				System.out.println("£10000");
			}
		}
	}	
		

	public void billVehicles1() {
		
		for (Vehicle v : vehicleList) {
			if (v instanceof Car) {
				System.out.println("£50");	
			}
			else if (v instanceof Boat) {
				System.out.println("£500");
			}
			else if (v instanceof Tank) {
				System.out.println("£10000");
			}
		}
	}

	
	public void emptyGarage() {
		vehicleList.clear();
	}
	

	
} 
