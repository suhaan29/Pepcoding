package pepcoding.arrayQ;

import java.util.Scanner;

public class PrintAllPermutations {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		StringBuilder a = new StringBuilder(s.next());
		
		int n = (int)Math.pow(2, a.length()) - 2;
		
		int v = 1;
		
		System.out.println(a);
		
		for(int i = 1; i < n; i++) {
			
			if(v == a.length()) {
				v = 1;
			}
			
			char temp = a.charAt(0);
			a.setCharAt(0, a.charAt(v));
			a.setCharAt(v, temp);
			System.out.println(a);
			v++;
			
		}
		
		
		
	}

}
