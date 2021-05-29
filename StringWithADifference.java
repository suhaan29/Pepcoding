package pepcoding.arrayQ;

import java.util.Scanner;

public class StringWithADifference {
	
	
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		
		StringBuilder s = new StringBuilder(scn.next());
		StringBuilder d = new StringBuilder();
		
		int n = s.length();
		
		for(int i = 0; i < n-1; i++)
		{
			int a = (int)s.charAt(i+1) - (int)s.charAt(i);
			d.append(s.charAt(i));
			d.append(a);
			
		}
		d.append(s.charAt(n-1));
		System.out.println(d);
		
	}
}
