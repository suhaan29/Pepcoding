package pepcoding.arrayQ;

import java.util.Scanner;

public class FindElementInArray {
	
	public static void main(String[] args)
	{
		int n;
		Scanner num = new Scanner(System.in);
		n = num.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = num.nextInt();
		}
		
		int d;
		d = num.nextInt();
		int count = 0;
		
		for(int a : arr)
		{
			if(a == d)
			{
				System.out.println(count);
	
			}
			count++;
		}
		
		num.close();
	}

}
