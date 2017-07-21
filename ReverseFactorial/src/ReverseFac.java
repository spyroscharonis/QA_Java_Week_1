
public class ReverseFac {
	
	int n; 
	
	// constructor 
	public ReverseFac(int n) {
		
		this.n = n; 		
	}
		

	public void inverseFactorial() {
		
		if (n % 2 != 0) {
			System.out.println("NONE");
		}
		
		else {
			int divisor = 1;
			while (n > divisor) {
				if (n % divisor != 0) {
					System.out.println("NONE"); // indivisible 
				}
				n /= divisor; 
				divisor++; 
		    }
			
			if (divisor == n) {
				System.out.println("n" + "=" + n + "!");
			}
		}
			
	}

}
