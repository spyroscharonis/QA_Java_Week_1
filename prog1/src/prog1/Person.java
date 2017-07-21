package prog1;

public class Person {
			
	double height; 
	int age;
	String firstName;
	String lastName;
	String profession; 
	String fullName;
	
	// constructor 
	public Person(String firstName, String lastName, String profession, int age, double height) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.profession = profession; 
		this.age = age;
		this.height = height; 
		this.fullName = firstName + " " + lastName;
	}
	
	public String convertString() {
		return "Name: " + this.fullName + "\n"
			   + "Age: " + this.age + "\n"
			   + "Height: " + this.height + "\n"
			   + "Profession: " + this.profession + "\n";
	}
	
	public void printDetails() {
		System.out.println("First Name:" + " " + firstName);
		System.out.println("Surname:" + " " + lastName);
		System.out.println("Profession:" + " " + profession);
		System.out.println("Age:" + " " + age);
		System.out.println("Height:" + " " + height);
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		Person Bob = new Person("Bob", "Smith", "developer", 28, 1.81); 
		Person Alice = new Person("Alice", "Jones", "sales manager", 32, 1.68);
		Person Mary = new Person("Mary", "Keeling", "waitress", 23, 1.65); 
		
		Bob.printDetails();
		Alice.printDetails(); 
		Mary.printDetails(); 
		
		//ArrayList 
		Person[] personArray = new Person[3];
		personArray[0] = new Person("Bob", "Smith", "developer", 28, 1.81);
		personArray[1] = new Person("Alice", "Jones", "sales manager", 32, 1.68);
		personArray[2] = new Person("Mary", "Keeling", "waitress", 23, 1.65);
		
		for (int i = 0; i < personArray.length; i++) {
			System.out.println(personArray[i].convertString() + "\n"); 
		}
		
 	}

}
		

