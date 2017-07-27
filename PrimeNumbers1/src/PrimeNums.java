import java.util.ArrayList;

public class PrimeNums {
	
	 public void getPrimes1(int low, int high) {		
		 
		 if ((low != (int)low) || (high != (int)high)) {
			 System.out.println("Both numbers must be integers!");
		 }
		 
		 int primes = 0;
		 int divisors = 0;
		 
		 for (int i = low; (i <= high+1); i++) {
			 for (int j = 1; (j <= i+1); j++) {
				 if (i % j == 0) {
					 divisors += 1;
				 }
			 }
			 
			 if (divisors == 2) {
				 // prime number found 
				 primes += 1; 				 
			}
				 
			divisors = 0; 		 

			 }
				 
		System.out.println("There are " + primes +  " prime numbers between " + low + " and " + high);

	 }
	 
	
	 
	 ArrayList<Integer> primes = new ArrayList<Integer>();
	 
	 public void getPrimes2(int low, int high) {
		 
	     for (int i = low; i <= high; i++) {
	         if (isPrime(i)) {
	             primes.add(i);
	         }
	     }
	     
	     System.out.println("There are " + primes.size() + " prime numbers betwee " + low + " and " + high);
	     //return primes.size(); 
	 }

	 public boolean isPrime(int n) {
		 
		 if (n % 2 == 0) {
	     	return false;
	     } 
	    
	     for (int i = 3; i * i <= n; i += 2) {
	    	 if (n % i == 0) {
	    		 return false; 
	    	 }
	     }
	     
	     return true; 
	 }
	 
}
	 
	