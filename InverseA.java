package pepcoding.arrayQ;
import java.util.Scanner;

public class InverseA {
	
	public static void main(String[] args) {
		int n;
		Scanner a = new Scanner(System.in);
		
		n = a.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
		{
			arr[i] = a.nextInt();
		}
		
		for(int i = 0; i < n ; i++)
		{
			int x = arr[i];
			arr[x] = i;
		}
		
		for(int ad : arr)
		{
			System.out.println(ad);
		}
		
	}

}
