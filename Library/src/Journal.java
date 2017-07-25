
public class Journal extends Item {
	
	int edition;
	int volume;
	String type; // scientific, e.g. PNAS/Nature/Science
	
	// constructor
	public Journal(String title, Boolean isAvail, int edition, int volume, String type) {
		super(title, isAvail);
		this.edition = edition; 
		this.volume = volume; 
	}

	@Override
	public String toString() {
		return super.toString() + "Edition: " + this.edition
								+ "Volume: " + this.volume
								+ "Type: " + this.type; 
	}

}







