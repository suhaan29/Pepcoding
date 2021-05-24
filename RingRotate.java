package pepcoding.arrayQ;
import java.util.Scanner;


public class RingRotate {
	
	public static void swap(int a, int b, int[] arr) {
		for(int i = a; i < b/2 ; i++) {
			int temp = arr[i];
			 arr[i] = arr[b-1 -i];
			arr[b - 1 - i] = temp;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);

	int[][] arr = 
			
		  { { 11, 12, 13 , 14, 15 , 16 },
			{ 21, 22, 23 , 24, 25 , 26 },
			{ 31, 32, 33 , 34, 35 , 36 },
			{ 41, 42, 43 , 44, 45 , 46 },
			{ 51, 52, 53 , 54, 55 , 56 },
			{ 61, 62, 63 , 64, 65 , 66 },
			
	};
	
	int sh = s.nextInt();
	int r = s.nextInt();
	
	//now here shell is from 1 meannig ourter 2 meaning inner so
	
	int minR = 0 + sh - 1;
	int minC = 0 + sh - 1;
	
	int maxR = arr.length  - 1 - (sh - 1) ;
	int maxC = arr[0].length - 1 - (sh - 1);
	
	int n = 2*(arr[0].length - 2*(sh - 1 )) + 2*(arr.length - 2*(sh - 1) - 2);
	System.out.println(n);
	int[] newA = new int[n];
	int i = 0;
	while(i < n) {
		//down
		
		for(int k = minR, j = minC; k <= maxR && i < n; k++) {
			newA[i] = arr[k][j];
			i++;
		}
		minC++;
		
		
		//right
		for(int k = minC, j = maxR; k <= maxC && i < n; k++) {
			newA[i] = arr[j][k];
			i++;
		}
		maxR--;

		
		
		//up
		
		for(int k = maxR, j = maxC; k >= minR && i < n; k--) {
			newA[i] = arr[k][j];
			i++;
		}
		maxC--;
		
		//left
		
		for(int k = maxC, j = minR ; k >= minC && i < n; k--) {
			newA[i] = arr[j][k];
			i++;
		}
		minR++;
	}
	
	for(int a : newA)
	{
		System.out.println(a);
	}
	
	//now its time to rotate the matrix
	int m = r % n;
	
	if(r < 0) {
		r += n;
		m= r;
	}
	
	swap(0, newA.length - m, newA);
	swap(newA.length - m, newA.length, newA);
	swap(0, newA.length, newA);
	
	while(i < n) {
		//down
		
		for(int k = minR, j = minC; k <= maxR && i < n; k++) {
			 arr[k][j] = newA[i];
			i++;
		}
		minC++;
		
		
		//right
		for(int k = minC, j = maxR; k <= maxC && i < n; k++) {
			arr[j][k] = newA[i];
			i++;
		}
		maxR--;

		
		
		//up
		
		for(int k = maxR, j = maxC; k >= minR && i < n; k--) {
			 arr[k][j] = newA[i];
			i++;
		}
		maxC--;
		
		//left
		
		for(int k = maxC, j = minR ; k >= minC && i < n; k--) {
		    arr[j][k] = newA[i];
			i++;
		}
		minR++;
	}
	
	for(int ia = 0; ia < arr.length; ia++) {
		for(int j = 0; j < arr[0].length; j++) {
			System.out.print(arr[ia][j] + " ");
		}
		System.out.println();
	}
	
	
s.close();
}
}