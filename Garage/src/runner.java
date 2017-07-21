
public class runner {
	
	public static void main(String[] args) {
		Car sedan = new Car("Black", "Audi", "Petrol", 250, 4, 50000);
		Motorcycle Suzuki = new Motorcycle("Red", "Suzuki", "Petrol", 280, 2, 80000);
		Bus NationalExpress = new Bus("White", "Volvo", "Diesel", 120, 8, 100000); 
				
		System.out.println(sedan.colour);
		System.out.println(sedan.manufacturer);	
		
		System.out.println(Suzuki.colour);
		System.out.println(Suzuki.manufacturer);
		
		Garage g = new Garage(100, false);
		g.main();
	}

}
