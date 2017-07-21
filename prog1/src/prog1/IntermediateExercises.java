package prog1;

public class IntermediateExercises {

	public static void main(String[] args) {
		System.out.println("******** Task 1 ********");
		System.out.println(blackjack(10,11));
		
		System.out.println("******** Task 2 ********");
		System.out.println(UniqueSum(2,3,4)); // 9
		System.out.println(UniqueSum(2,3,3)); // 5
		System.out.println(UniqueSum(2,2,2)); // 0 
	}
	
	
	public static int blackjack(int a, int b) {
		
		if (a > 21) {
			if (b > 21) 
				return 0;
			return b;
		}
		
		else if (a < b && b <= 21)
			
			return b;
		return a;
	}
	

	public static int UniqueSum(int a, int b, int c) {

		if (a == b) {
			return a + c;
		} 
		
		else if (b == c) {
			return a + b; 
		}
		
		else if ((a == b) && (a == c)) {
		     return 0; 
		}

		else {
			return a + b + c; 
		}
					
	}

}




	



