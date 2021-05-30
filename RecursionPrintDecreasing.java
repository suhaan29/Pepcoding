package pepcoding.arrayQ;

import java.util.Scanner;

public class RecursionPrintDecreasing {
	
	
	public static int printNum(int n)
	{
		if(n == 1)
		{
			System.out.println(n);
			return 0;
		}
		
		System.out.println(n);
		return printNum(n - 1);
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		printNum(n);
	}

}
