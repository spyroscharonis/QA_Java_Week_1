
public class RunnerClass {
	
	public static void main(String[] args) {
		
		Library lib1 = new Library();
		
		lib1.printOpeningHrs(); 
		
		Book b1 = new Book("Intro to Java", true, "Herbert Schildt", "978-1-118-80857-3", "textbook");
		Book b2 = new Book("Intro to Python", false, "Guido van Rossum", "723-5-107-57732-4", "textbook");
		Book b3 = new Book("Foucault's Pendulum", true, "Umberto Eco", "88-452-1591-1", "mystery/sci fi");
		
		Journal j1 = new Journal("PNAS", false, 3, 20, "Scientific"); 
		Journal j2 = new Journal("Science", true, 5, 16, "Scientific");
		
		Thesis t1 = new Thesis("Computational Studies of Protein Aggregation", true, "Spyros Charonis", "Univeristy of Manchester", "PhD"); 
		Thesis t2 = new Thesis("Something in Neuroscience", false, "James Smith", "Harvard University", "PhD");
		Thesis t3 = new Thesis("Something in Computer Vision", true, "Owen Adams", "MIT", "MSc");
		
		lib1.addItem(b1);
		lib1.addItem(b2);
		lib1.addItem(b3);
		
		lib1.removeItemByTitle(b2.title); 
	}

}
