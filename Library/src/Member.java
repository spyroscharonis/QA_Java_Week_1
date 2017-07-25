
public class Member {
	
	String name;
	int age;
	int memberID; 
	
	// constructor 
	public Member(String name, int age, int memberID) {
		this.name = name; 
		this.age = age;
		this.memberID = memberID; 
	}
	
	@Override
	public String toString() {
		return "name: " + this.name + "\n" +
			    "age: " + this.age + "\n" +
				"memberID: " + this.memberID + "\n\n"; 
	}
	
}


