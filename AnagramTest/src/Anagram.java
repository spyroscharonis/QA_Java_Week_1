import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*; 

public class Anagram {
	
	ArrayList<String> arr = new ArrayList<String>();
	
	// Reads words from a file 
	public ArrayList ReadWords(String Filename) {

        //ArrayList<String> arr = new ArrayList<String>();
        try (BufferedReader br = new BufferedReader(new FileReader(Filename)))
        {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                arr.add(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } 
        
        System.out.println(arr); 
        return arr; 
    }
	
	// Returns sorted version of a string  
	public String sortStr(String str) {
		
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		String sortedString = new String(charArr);
		System.out.println(charArr);
		return sortedString;
			
	}
	
	
	public Map<String, String> getHashMap() {
		
		HashMap<String, String> hmap = new HashMap<String, String>(); 
		
		for (String i: arr) {
			hmap.put(i, i.sortStr(i));
		}
		
		System.out.println(hmap); 
		return hmap; 
	}
	
	
	public String AnagramOutput(ArrayList<String> arr) {
		
		// Create hashmap
		HashMap<String, String> hmap = new HashMap<String, String>(); 
		
		for (String i: arr) {
			hmap.put(sortStr(i), );
		}
		
		
		
	}
	
}
