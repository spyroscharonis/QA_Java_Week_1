package prog1;

public class BeginnerExercises {
	
	public static void main(String[] args) {
		System.out.println("******** Task 1 ********");
		System.out.println("Hello, World");
		
		helloworld1();
		helloworld2("hello world!");
		addORmultiply(7, 5, true);
		addORmultiply(7, 5, false);
		addORmultiply(1, 0, true);
		iter1();
		arr1();
		iter_arr1();
	}
	

	public static void helloworld1() {
		System.out.println("******** Task 2 ********");
		String helloWorld = "Hello World";
		System.out.println(helloWorld);
	}

	
	public static void helloworld2(String param) {
		System.out.println("******** Task 3 ********");
		System.out.println(param);
	}
	
	public static String helloworld3() {
		System.out.println("******** Task 4 ********");
		String val = "Hello World";
		return val;
	}
	
	// Task 7 
	public static void addORmultiply(int a, int b, boolean calcSum) {
		System.out.println("******** Tasks 5 - 7 ********");
		if (calcSum == true) {
			int sum = a + b;
			System.out.println(sum);
		}
		
		else if (calcSum == false) {
			int prod = a * b;
			System.out.println(prod);
		}
		
		// If one of two inputs is zero, output the non-zero one
		if (a == 0) {
			System.out.println(b);
		}
		else if (b == 0) {
			System.out.println(a);
		}
			
   }
	
	
	// Iteration 
	
	public static void iter1() {
		System.out.println("******** Task 8 ********");
		for (int i = 0; i < 10; i++) {
			addORmultiply(i, 0, true);
		}
	}
	
	
	// Arrays 
	
	public static void arr1() {
		
		int[] arr1 = new int[10];
		System.out.println("******** Task 9 ********");
		for (int i = 1; i < 10; i++) {
			arr1[i] += 1;
			addORmultiply(i, 0, true); 
		}
		
		System.out.println("******** Task 10 ********");
		for(int counter = 1; counter < arr1.length; counter++) {
			System.out.println(arr1[counter]);
		}
	}
	
	public static void iter_arr1() {
		System.out.println("******** Task 11 ********");

		int[] arr1 = new int[10];
		
		for (int i = 1; i < 10; i++) {
			arr1[i] += 1;
			System.out.println(arr1[i]);
		}
		
		for (int j = 1; j < 10; j++) {
			arr1[j] *= 10;
			System.out.println(arr1[j]);
		}
		
	}
	

}