package pepcoding.arrayQ;

public class PowerRecursionLogrithmic {
	
	public static int printPow(int n, int x)
	{
		if(x == 0) {
			return 1;
		}
		
		int fn = printPow(n, x/2) * printPow(n, x/2);
		
		if(x % 2 != 0)
		{
			fn = fn * n;
		}
		return fn;
	}
	
	public static void main(String[] args)
	{
		int n = 2;
		int x = 7;
		
		System.out.println(printPow(n, x));
	}

}
