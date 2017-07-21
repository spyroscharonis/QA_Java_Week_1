
public class Paint {
	
	String name;
	double volume;
	double cost;
	double coverage;
	double consumption; 
	double pricePerSqMeter; 

	
	// constructor 
	public Paint (String name, double volume, double cost, double coverage, double consumption, double pricePerSqMeter) {
		
		this.name = name;
		this.volume = volume;
		this.cost = cost; 
		this.coverage = coverage;
		this.consumption = consumption;
		this.pricePerSqMeter = pricePerSqMeter; 
	}
	
	public String convertStr(String name, double volume, double cost, double coverage, double consumption) {
		
		return "Name: " + name + "\n" +
			   "Volume: " + volume + " Litres" + "\n" +
			   "Price: " + cost +  " £" + "\n" +
			   "Coverage: " + coverage + " sq meters" + "\n" +
			   "Consumption: " + consumption + " litres per sq meter" + "\n" +
			   "Price per sq meter: " + pricePerSqMeter + " £" + "\n";
		}
	
	// CheapoMax 
	public void CheapoMax() {
		String name = "Cheapo Max";
		double volume = 20.0;
		double cost = 19.99;
		double coverage = volume * 10;
		double consumption = volume / coverage;
		double pricePerSqMeter = cost / coverage; 

		
		String toString; 
		
		toString = "Name: " + name + "\n" +
				   "Volume: " + volume + " Litres" + "\n" +
				   "Price: " + cost +  " £" + "\n" +
				   "Coverage: " + coverage + " sq meters" + "\n" +
				   "Consumption: " + consumption + " litres per sq meter" + "\n" +
				   "Price per sq meter: " + pricePerSqMeter + " £" + "\n";
		
		System.out.println(toString);

	}
	
	// AverageJoes
	public void AverageJoes() {
		String name = "Average Joes";
		double volume = 15.0;
		double cost = 17.99;
		double coverage = volume * 11;
		double consumption = volume / coverage; // litres per sq meter
		double pricePerSqMeter = cost / coverage; 

		String toString; 
		
		toString = "Name: " + name + "\n" +
				   "Volume: " + volume + " Litres" + "\n" +
				   "Price: " + cost +  " £" + "\n" +
				   "Coverage: " + coverage + " sq meters" + "\n" +
				   "Consumption: " + consumption + " litres per sq meter" + "\n" +
				   "Price per sq meter: " + pricePerSqMeter + " £" + "\n"; 

		System.out.println(toString);
	}
	
	// DuluxourousPaint 
	public void DuluxourousPaint()
	{
		String name = "Duluxourous Paints";
		double volume = 10.0;
		double cost = 25.0;
		double coverage = volume * 20;
		double consumption = volume / coverage;
		double pricePerSqMeter = cost / coverage; 

		String toString;
		
		toString = "Name: " + name + "\n" +
				   "Volume: " + volume + " Litres" + "\n" +
				   "Price: " + cost +  " £" + "\n" +
				   "Coverage: " + coverage + " sq meters" + "\n" +
				   "Consumption: " + consumption + " litres per sq meter" + "\n" +
				   "Price per sq meter: " + pricePerSqMeter + " £" + "\n"; 
		
		System.out.println(toString);
	}
	
	public void Results() {
		System.out.println("Duluxurous Paints has the  the best consumption per sq metre");
		System.out.println("Cheapo Max is the cheapest");
		
	}

}
	



