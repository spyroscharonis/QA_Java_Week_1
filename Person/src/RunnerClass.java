import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class RunnerClass {
	
	public static void main(String[] args) throws IOException {
		
		RunnerClass x = new RunnerClass();
		
		// Create an array list and instantiate five people 
		ArrayList<Person> people = new ArrayList<Person>() {{ 
			add( new Person("Bob", "software engineer", 28));
			add( new Person("Alice", "sales manager", 29));
			add( new Person("Sam", "product manager", 34));
			add( new Person("Karen", "sales assistant", 22));
			add( new Person("Kim", "associate lawyer", 26)); 
		}};
		
		x.serialize("C:\\Users\\Administrator\\Desktop\\List_of_People.txt", people);
		x.deserialize("C:\\Users\\Administrator\\Desktop\\List_of_People.txt"); 

	}
	
	
	public void serialize(String filename, ArrayList<Person> people) throws IOException {
		
		BufferedWriter outputWriter = null;
		outputWriter = new BufferedWriter(new FileWriter(filename));
		
		for (int i = 0; i < people.size(); i++) {
			outputWriter.write(people.get(i).name + ",");
			outputWriter.write(people.get(i).age + ",");
			outputWriter.write(people.get(i).profession + "\n");
			
			outputWriter.newLine();
		}
		
		outputWriter.flush();
		outputWriter.close();
	}
	
	
	
	public ArrayList<String> deserialize(String Filename) throws IOException {
		
		Scanner s = new Scanner(new File("List_of_People.txt"));
		ArrayList<Person> listPeople = new ArrayList<Person>();
		while (s.hasNextLine()) {
			String newLine = s.nextLine();
			String[] pArr = newLine.split(",");
			listPeople.add(new Person(pArr[0], pArr[2], Integer.parseInt(pArr[1])));
		}
		s.close(); 
		
		return listPeople;  
	}

}
