import java.util.*; 

public class Library {
	
	private static final String address = "One Central Square, Some City, Somewhere, YYYY"; 
	private static final String openingTime = "9 am";
	private static final String closingTime = "5 pm"; 
	
	private ArrayList<Item> LibCatalogue; 
	private HashMap<Integer, String> members = new HashMap<Integer, String>();  
			
	public Library() {
		LibCatalogue = new ArrayList<Item>();		
	}
	
	public void printAddress() {
		System.out.println(address); 
	}
	
	public void printOpeningHrs() {
		System.out.println("The library is open daily from " + openingTime + " to " + closingTime);
	}
	
	public void addItem(Item i) {
		LibCatalogue.add(i);
	}
	
	
	public void printAvailItems() {
		
		for (Item item: LibCatalogue) {
				System.out.println(item.title);
			}
	}
	
	
	public void CheckOutItem(Item i) {
				
		for (Item item: LibCatalogue) {
			
			if (item.isAvail == true) {
				LibCatalogue.remove(item);
			}
			else if (item.isAvail == false) {
				System.out.println("The item you selected is unavailable");
			}
			
		}
	}
	
	
	public void ReturnItem(Item i) {
		
		if (i.isAvail == false) {
			LibCatalogue.add(i);
		}
		
	}
	
	
	public void removeItemByTitle(String title) {
		
		for (int i = 0; i < LibCatalogue.size(); i++) {
			if (LibCatalogue.get(i).title == title) {
				LibCatalogue.remove(i); 
			}
		}
	}
	
	
	public void registerMember(String name, int ID) {
		members.put(ID , name);  
	}
	
	
	public void removeMember(String name, int ID) {
		members.remove(ID, name); 
	}
	
	
	public void updateMember(Member member, int ID) {
		members.put(ID, member.toString());

	}

}