package pepcoding.arrayQ;

import java.util.Scanner;

//the following code will also work for negative values of k

public class RotateArrayOptimized {
	
	static void reverse(int[] a, int li, int h1) {
		while(li < h1) {
			int temp = a[li];
			a[li] = a[h1];
			a[h1] = temp;
		}
	}
	
	static void kar(int[] a, int k) {
		k = k % a.length;
		if(k < 0) {
			k += a.length;
		}
		
		reverse(a, 0 , a.length - 1 - k);
	    reverse(a, a.length - k, a.length - 1);
	    reverse(a, 0, a.length - 1);
	}
	
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
	kar(ar, k);
	}
	
	


}
