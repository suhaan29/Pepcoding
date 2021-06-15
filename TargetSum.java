package pepcoding.arrayQ;

import java.util.Scanner;

public class TargetSum {

	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		
		int target = scn.nextInt();
		
		int[] arr = {10, 20, 30 , 40, 50 };
		
		printTarget(arr, 0, " ", 0, target);
	}
	
	public static void printTarget(int[] arr, int idx, String set, int sos, int tar)
	{
		if(idx == arr.length - 1)
		{
			if(sos == tar)
			{
				System.out.println(set);
				return;
			}
			return;
		}
		printTarget(arr, idx + 1, set + " " + arr[idx], sos + arr[idx] , tar);
		printTarget(arr, idx + 1, set , sos , tar);
	}
}
