package pepcoding.arrayQ;

public class PrintBoth {
	
	static void printb(int n)
	{
		if(n == 0)
		{
			return;
		}
		
		System.out.println(n);
		printb(n-1);
		System.out.println(n);
	}
	
	
	public static void main(String[] args)
	{
		int n = 3;
		printb(3);
	}

}
