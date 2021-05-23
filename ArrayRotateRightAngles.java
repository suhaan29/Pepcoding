package pepcoding.arrayQ;

import java.util.Scanner;

public class ArrayRotateRightAngles {
	
	public static void main(String[] args) {
		
	  
		Scanner s = new Scanner(System.in);
		
		int n;
		
		n = s.nextInt();
		
		int[][] arr = new int[n][n];
		
		for(int i = 0; i < n ; i++) {
			for(int j = 0; j < n; j++ ) {
				arr[i][j] = s.nextInt();
			}
		}
		int m = n - 1;
		for(int i = 0; i < n/2; i++) {
			for(int j = i; j < m - i; j++) {
				
				int temp1 = arr[j][m - i];
				arr[j][m - i] = arr[i][j];
				int temp2 = arr[m - i][m - j];
				arr[m - i][m - j] = temp1;
				int temp3 = arr[m - j][i];
				arr[m - j][i] = temp2;
				arr[i][j] = temp3;
				
			}
		}
		
		for(int i = 0; i < n ; i++) {
			for(int j = 0; j < n; j++ ) {
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
		
	}

}
