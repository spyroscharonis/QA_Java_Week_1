
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
	
	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return super.toString() + "Edition: " + this.edition
								+ "Volume: " + this.volume
								+ "Type: " + this.type; 
	}

}







