import java.util.*; 


public class Library {
	
	String address; 
	ArrayList<item> items = new ArrayList<item>(); 
	
	private static final String openingTime = "9am";
	private static final String closingTime = "5pm"; 
	
	
	// constructor 
	public Library(String libAddress) {
		libAddress = address;
	}
	
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(item item) {
		items.remove(item);
	}
	
	
}
