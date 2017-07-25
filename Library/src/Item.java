
public abstract class Item {
	
	String title; 
	Boolean isAvail;
	int numCopies; 
	
	// constructor
	public Item(String title, Boolean isAvail) {
		this.title = title;
		this.isAvail = isAvail; 
	}
	
	@Override
	public String toString() {
		return "Title: " + this.title + "Loan Status: " + this.isAvail; 
	}

}
