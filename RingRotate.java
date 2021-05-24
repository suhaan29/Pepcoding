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
	System.out.println();
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
	
	System.out.println("\n" + i + "\n");
	
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
	
	swap(0, newA.length - m - 1, newA);
	swap(newA.length - m, newA.length - 1, newA);
	swap(0, newA.length - 1, newA);
	System.out.println();
	for(int a : newA)
	{
		System.out.println(a);
	}
	 minR = 0 + sh - 1;
	 minC = 0 + sh - 1;
	
	 maxR = arr.length  - 1 - (sh - 1) ;
	 maxC = arr[0].length - 1 - (sh - 1);
    int last = 0;
	
	while(last < n) {
		//down
		
		for(int k = minR, j = minC; k <= maxR && last < n; k++) {
			 arr[k][j] = newA[last];
			last++;
		}
		minC++;
		
		
		//right
		for(int k = minC, j = maxR; k <= maxC && last < n; k++) {
			arr[j][k] = newA[last];
			last++;
		}
		maxR--;

		
		
		//up
		
		for(int k = maxR, j = maxC; k >= minR && last < n; k--) {
			 arr[k][j] = newA[last];
			last++;
		}
		maxC--;
		
		//left
		
		for(int k = maxC, j = minR ; k >= minC && last < n; k--) {
		    arr[j][k] = newA[last];
			last++;
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