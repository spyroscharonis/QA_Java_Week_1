
public class Book extends Item {
	
	String author; 
	String isbn; 
	String type; 
	
	// constructor
	public Book(String title, Boolean isAvail, String author, String isbn, String type) {
		super(title, isAvail);
		this.author = author; 
		this.isbn = isbn;
	}
		
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
		
	
	@Override
	public String toString() {
		return super.toString() + "Author: " + this.author
								+ "ISBN: " + this.isbn
								+ "Type: " + this.type; 
	}

	


}
