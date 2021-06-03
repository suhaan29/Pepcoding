package pepcoding.arrayQ;

import java.util.Scanner;

public class RecursivePrintArray {
	
	public static void printArr(int n, int[] arr)
	{
		if(n == 0)
		{
			return;
		}
		printArr(n - 1, arr);
		System.out.println(arr[n - 1]);
		
	}

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = scn.nextInt();
		}
		
		printArr(n, arr);
	}
	
}
