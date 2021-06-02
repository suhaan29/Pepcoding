package pepcoding.arrayQ;

public class ToweOFHanoi {
	
	public static void printHanoi(int n, int t1, int t2, int t3)
	{
		if(n==0) {
			return;
		}
		printHanoi(n - 1, t1, t3, t2);
		System.out.println(n + "[" + t1 + "->" + t2 + "]");
		printHanoi(n-1, t3, t2, t1);
	}

	public static void main(String[] args)
	{
		int n = 3;
		int t1 = 10, t2 = 11, t3 = 12;
		
		printHanoi(3, t1, t2, t3);
	}
}
