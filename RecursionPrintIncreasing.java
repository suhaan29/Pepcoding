package pepcoding.arrayQ;

public class RecursionPrintIncreasing {
	
	static void printIncreasing(int n) {
		
		if(n == 0) {
			return;
		}
		printIncreasing(n-1);
		System.out.println(n); //this is an example of tail recursion
	}

	public static void main(String[] args) {
		int n = 5;
		printIncreasing(5);
	}
	
}
