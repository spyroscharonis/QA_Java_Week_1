/**
 * A simple library system 
 * @author Spyros Charonis
 *
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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
		
		System.out.println("\nAvailable items: \n");
		for (Item item: LibCatalogue) {
				System.out.println(item.title + " " + item.isAvail);
			}
	}
	
	
	public void checkOutItem(Item i) {
				
		for (Item item: LibCatalogue) {
			
			if (item.isAvail == true) {
				LibCatalogue.remove(item);
			}
			else if (item.isAvail == false) {
				System.out.println("The item you selected is unavailable");
			}
			
		}
	}
	
	
	public void returnItem(Item i) {
		
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
	
	
	public void writeLibToFile(String filename) {
		
		try(BufferedWriter out = new BufferedWriter(new FileWriter(filename + ".txt"))) {
			//System.out.println("Entering" + " try statement");
			String delim = ",";
			
			for (Item item : LibCatalogue) {
				
				if (item instanceof Book) {
					Book b = (Book) item;
					out.write("Book" + delim + b.getIsAvail() + delim + b.getTitle() + delim + b.getAuthor() + delim + b.getIsbn() + delim  + b.getType());
					out.newLine();
				}
				
				else if (item instanceof Journal) { 
					Journal j = (Journal) item; 
					out.write("Journal" + delim + j.getIsAvail() + delim + j.getTitle() + delim + j.getEdition() + delim + j.getVolume() + delim + j.getType());					out.newLine();
				}
				
				else if (item instanceof Thesis) {
					Thesis t = (Thesis) item;
					out.write("Thesis" + delim + t.getIsAvail() + delim + t.getTitle() + delim + t.getAuthor() + delim + t.getUniversity() + delim + t.getDegreeType());
					out.newLine(); 
				}
				
			}
			
		}
		
		catch (IOException io) {
			System.err.println("Caught IOException: " +  io.getMessage());
		}
		
				
	}
	
	/*
	public ArrayList <Item> deserialize(String Filename) {
	
		ArrayList <Item> LibContents = new ArrayList <Item>();

        try (BufferedReader in = new BufferedReader(new FileReader(Filename))) {
			//System.out.println("Entering" + " try statement");
            String line; 
            String[] lineArr = line.split(","); 
            
            while ((line = in.readLine()) != null) {
            	String[] lines = line.split(",");
            	
            	if (lineArr[0].equals("Book")) {
					LibContents.add(new Book(lineArr[0], Boolean.parseBoolean(lineArr[1]), lineArr[2], lineArr[3], lineArr[4]));
				}
				
				else if (lineArr[0].equals("Journal")) {
					LibContents.add(new Journal(lineArr[0], Boolean.parseBoolean(lineArr[1]), Integer.parseInt(lineArr[2]), Integer.parseInt(lineArr[3]), lineArr[4]));
				}
				
				else if (lineArr[0].equals("Thesis")) {
					LibContents.add(new Thesis(lineArr[0], Boolean.parseBoolean(lineArr[1]), lineArr[2], lineArr[3], lineArr[4]));
				}
            	
            }
            	
        catch (IOException io) {
			System.err.println("Caught IOException: " +  io.getMessage());
        } 
        
        System.out.println(LibCatalogue); 
    }
    */ 
	

	public ArrayList <Item> readLibFromFile(String Filename) {	
		
		ArrayList <Item> LibContents = new ArrayList <Item>();
	
		try (Scanner s = new Scanner(new File(Filename))) {

			while (s.hasNextLine()) {
				String line = s.nextLine();
				String[] lineArr = line.split(",");
				
				if (lineArr[0].equals("Book")) {
					LibContents.add(new Book(lineArr[0], Boolean.parseBoolean(lineArr[1]), lineArr[2], lineArr[3], lineArr[4]));
				}
				
				else if (lineArr[0].equals("Journal")) {
					LibContents.add(new Journal(lineArr[0], Boolean.parseBoolean(lineArr[1]), Integer.parseInt(lineArr[3]), Integer.parseInt(lineArr[4]), lineArr[5]));
				}
				
				else if (lineArr[0].equals("Thesis")) {
					LibContents.add(new Thesis(lineArr[0], Boolean.parseBoolean(lineArr[1]), lineArr[2], lineArr[3], lineArr[4]));
				}
				
			}
			
		}
		
		catch (IOException io) {
			System.err.println("Caught IOException: " +  io.getMessage());
		}
		
		//s.close();	
		
		return LibContents; 
		
	}	
		
}
		