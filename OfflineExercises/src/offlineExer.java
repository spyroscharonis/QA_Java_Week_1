
public class offlineExer {
	
	 public String doubleChar(String s) {
	        
		 String s_new = "";

	      for (int i = 0; i < s.length(); i++) {
	    	  s_new =  s_new + s.charAt(i) + s.charAt(i);
	       }
	      
	    return  s_new;
	    
	   }

	
	/*
	public String getSandwich (String s) {	
		
		if ()
		
	}
	
	public String stringClean(String s) {
		// base case
		if (s.length() == 1) {
			return s;
		}
		// recursive case 
		else {
			
		}
	}
	
	*/
	 
	public boolean endswithLy(String s) {
		
		return s.endsWith("ly");
	
		}
	
	 
	/* Very inefficient implementation
	 *  as it creates very many
	 *  stack traces but didn't have 
	 *  time for a better one
	 */ 
	public int fibonacci (int n) {
		
		// base case
		if ((n == 0) || (n == 1)) {
			return 1;
		}
		// recursive case
		else {
			return fibonacci(n-1) + fibonacci(n-2); 
		}
	}
	
	public int bunnyEars(int n) {
		
		// base case
		if (n == 0) {
			return 0;
		}
		// recursive case 
		else {
			return bunnyEars(n*2);
		}
	}

}
