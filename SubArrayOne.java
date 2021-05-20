package pepcoding.arrayQ;

//this question is o(n^3) complexity
import java.util.Scanner;

public class SubArrayOne {

	public static void main(String[] args)
	{
		int n;
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n ; j++) {
				for(int k = i; k <= j; k++) {
					System.out.print(arr[k] + "\t");
				}
				System.out.print("\n");
			}System.out.print("\n");
		}
		
	}
}
