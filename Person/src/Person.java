
public class Person {
	
	String name;
	String profession; 
	int age;
	
	// constructor 
	public Person(String name, String profession, int age) {
		this.name = name; 
		this.profession = profession; 
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name: " + this.name + "\n" +
			   "profession: " + this.profession + "\n" + 
			   "age: " + this.age + "\n\n"; 
	}
	
}
