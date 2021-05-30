package pepcoding.arrayQ;

public class PrintFact {
	
	public static int printF(int n)
	{
		if(n == 1) {
			return 1;
		}
		
		int fn = n * printF(n - 1);
		return fn;
	}
	
	public static void main(String[] args) {
		int n = 5;
		int f = printF(n);
		System.out.println(f);
	}

}
