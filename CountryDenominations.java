package pepcoding.arrayQ;

import java.util.Scanner;

public class CountryDenominations {

	public static void main(String[] args)
	{
		//this is a normal implementation of the binary search alog
		//i will take hardcoded values to make the process faster
		
		int arr[] = { 1,
				5,
				10,
				15,
				22,
				33,
				40,
				42,
				55,
				66 };
		
		Scanner s = new Scanner(System.in);
		int x;
		x = s.nextInt();
		
		System.out.println(x);
		
		int low = 0;
		int high = arr.length;
		int mid = (low + high) / 2;
		int flag = 0;
		
		while(low <= high) {
			 mid = (low + high) / 2;
			if(x == arr[mid]) {
				flag = 1;
				
				System.out.println("this is the number and the index is " + mid);
				
				break;
			}
			else if(x > arr[mid]) {
				low = mid + 1;
			}
			else
				high = mid - 1;
			
		}
		
		if(flag == 0) {
		System.out.println(arr[high] + " " + arr[low]);}
		s.close();
	}
	
	
}
