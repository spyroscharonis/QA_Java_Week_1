
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	@Override
	public String toString() {
		return  super.toString() + "name: " + this.name + "\n" +
			    				   "age: " + this.age + "\n" +
			    				   "memberID: " + this.memberID + "\n\n"; 
	}
	
}


