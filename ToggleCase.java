package pepcoding.arrayQ;

import java.util.Scanner;

public class ToggleCase {
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		StringBuilder s = new StringBuilder(scn.next()); //StringBuilder offers better performance and makes mutable
		
		//SUHaan - suhAAN
		
		for(int i = 0; i < s.length(); i++) {
			int x = (int) s.charAt(i);
			if(x > 95) {
				x = x - 32;
				s.setCharAt(i, (char)x);
			}
			else if(x < 95) {
				x = x + 32;
				s.setCharAt(i, (char)x);
			}
		}
		
		System.out.println(s);
	}

}
