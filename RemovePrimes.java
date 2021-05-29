package pepcoding.arrayQ;

import java.util.ArrayList;
import java.util.Scanner;
public class RemovePrimes {
	
	public static boolean isPrime(int x) {
		for(int i = 2; i <= x / 2; i++) {
			if(x % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		Scanner scn = new Scanner(System.in);
		
		int n = scn.nextInt();
		
		for(int i = 0; i < n ;i++) {
			int x = scn.nextInt();
			list.add(x);
		}
		
		System.out.println(list);
		
		for(int j = 0; j < list.size(); j++) {
			if(isPrime(list.get(j))) {
				list.remove(j);
			}
		}
		
		System.out.println(list);
		
		
	}

}
