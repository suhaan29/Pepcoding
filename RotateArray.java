package pepcoding.arrayQ;

import java.util.Scanner;

public class RotateArray {
	
	public static void main(String[] args)
	{
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int[] ar = new int[n];
		
		for(int i = 0; i < n; i++) {
			ar[i] = s.nextInt();
		}
		
	
		
	int k = s.nextInt();
	

	
	for(int a = 0; a < k; a++)
	{
		
		
		for(int i = 0; i < n - 1; i++)
		{
			int temp = ar[i];
			ar[i] = ar[n-1];
			ar[n-1] = temp;
			
		}
	}
	
	for(int a : ar)
	{
		System.out.println(a);
	}
		
	s.close();
		
	}

}
