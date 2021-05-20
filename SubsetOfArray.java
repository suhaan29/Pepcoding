package pepcoding.arrayQ;
import java.util.Scanner;
public class SubsetOfArray {
	
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		
		int limit = (int) Math.pow(2,  n);
		
		for(int i = 0; i < limit; i++)
		{
			int temp = i;
			String set = "";
			
			for(int j = arr.length; j >= 0; j++) {
				int r = temp % 2;
				temp /= 2;
				
				if(r == 0) {
					set = "-\t" + set;
				}
				else {
					set = arr[j] + "\t" + set;
				}
			}
			
			System.out.println(set);
		}
		

	
	}

}
