
public class RunnerClass {
	
	public static void main(String[] args) {
		
		Garage g  = new Garage(); 
		Car c1 = new Car("123EFC", "Audi", 2, false);
		Car c2 = new Car("124EFC", "BMW", 2, false);
		Car c3 = new Car("125EFC", "Mercedes-Benz", 2, false);
		Boat b1 = new Boat("125EFC", "White", 2, 3);
		Tank t1 = new Tank("123", "Soviet", 0, 970.5); 

		g.addVehicle(c1);
		g.addVehicle(c2);
		g.addVehicle(c3);
		g.addVehicle(b1);
		g.addVehicle(t1);
		g.billVehicles(); 
		g.emptyGarage();
		g.inGarage();
	}
	  

}
