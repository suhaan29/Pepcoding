package pepcoding.arrayQ;

public class RecursionPower {

	public static int printPow(int x, int n)
	{
		if( n == 1)
		{
			return (int) Math.pow(x,  n);
		}
		
		int fn = x * printPow(x, n - 1);
		return fn;
	}
	
	public static void main(String[] args)
	{
		int x  = 2;
		int n = 5;
		
		int a = printPow(x, n);
		System.out.println(a);
	}
}
