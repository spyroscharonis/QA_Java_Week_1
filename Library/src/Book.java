
public class Book extends Item {
	
	String author; 
	String isbn; 
	String type; 
	
	// constructor
	public Book(String title, Boolean isAvail, String author, String isbn, String type) {
		super(title, isAvail);
		this.author = author; 
		this.isbn = isbn;
		this.author = author; 
	}
	
	@Override
	public String toString() {
		return super.toString() + "Author: " + this.author
								+ "ISBN: " + this.isbn
								+ "Type: " + this.type; 
	}


}
