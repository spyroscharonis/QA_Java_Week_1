
public class Thesis extends Item {
	
	String author; 
	String university; 
	String degreeType; // MSc, MRes, PhD, etc. 
	
	// constructor
	public Thesis(String title, Boolean isAvail, String author, String university, String degreeType) {
		super(title, isAvail);
			this.author = author; 
			this.university = university;
			this.degreeType = degreeType; 
		}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getDegreeType() {
		return degreeType;
	}

	public void setDegreeType(String degreeType) {
		this.degreeType = degreeType;
	}

	@Override
	public String toString() {
		return super.toString() + "Author: " + this.author
								+ "University: " + this.university
								+ "Degree Awarded: " + this.degreeType; 
	}

}
