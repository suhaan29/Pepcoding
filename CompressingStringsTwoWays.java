package pepcoding.arrayQ;

import java.util.Scanner;

public class CompressingStringsTwoWays {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		String s1 = scn.next();
		
		
		String s2 = "";
		s2 = s2 + s1.charAt(0);
		
		
		
		int[] arr = new int[s1.length()];
		int a = 0;
		for(int i = 0; i < s1.length() - 1; i++)
		{
			if(s1.charAt(i) == s1.charAt(i+1)) {
				arr[a] += 1;
			}
			else {
				a++;
				s2 = s2 + s1.charAt(i+1);
			}
		}
		
		System.out.println(s2);
		String s3 = "";
		int n = 0;
		for(int i = 0; i < arr.length && n < s2.length(); i++) {
			if(arr[i] > 0) {
				arr[i]++;
				s3 = s3 + s2.charAt(n) + arr[i];
				n++;
			}
			else {
				s3 = s3 + s2.charAt(n);
				n++;
			}
		}
		System.out.println(s3);
	}

}
