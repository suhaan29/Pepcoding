package pepcoding.arrayQ;

import java.util.Scanner;

public class SumOfTwoArrays {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int a, b;
		a = s.nextInt();
		b = s.nextInt();
		int[] a1 = new int[a];
		for(int i = 0; i < a ;i++)
		{
			a1[i] = s.nextInt();
		}
		
		int[] b1 = new int[b];
		for(int i = 0; i < b ;i++)
		{
			b1[i] = s.nextInt();
		}
		
		int[] c1 = new int[a >= b ? a : b];
		
		int c = 0;
		
		int i = a1.length - 1;
		int j = b1.length - 1;
		int k = c1.length - 1;
		
		while(j >= 0 || i >= 0)
		{
		   int d = c;
		   
		   if(i >= 0) {
			   d += a1[i];
		   }
		   
		   if(j >= 0) {
			   d += b1[j];
		   }
		   
		   d = d % 10;
		   c = d / 10;
		   c1[k] = d;
		   i--;
		   j--;
		   k--;
		}
		
		if(c > 0) {
			System.out.println(c);
		}
		
		for(int var : c1) {
			System.out.println(var);
		}
		
	s.close();
	}
	

}
