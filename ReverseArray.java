package pepcoding.arrayQ;

import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[] args)
	{
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			array[i] = s.nextInt();
		}
		
		
		for(int i = 0; i < array.length/2; i++)
		{
			int temp = 0;
			
			temp = array[i];
			
			array[i] = array[n-1-i];
			
			array[n-1-i] = temp;
			
		}
		
		for(int a : array) {
			System.out.print(a + " ");
		}
		s.close();
	}

}
