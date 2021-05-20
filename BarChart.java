package pepcoding.arrayQ;
import java.util.Scanner;

public class BarChart {
	
	public static void main(String[] args)
	{
		int N; //number of elements
		Scanner n = new Scanner(System.in);
		N = n.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N ; i++)
		{
			arr[i] = n.nextInt();
		}
		
		int max = arr[0];

		for(int i = 0; i < N ; i++)
		{
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		for(int i = max; i > 0 ; i--)
		{
			for(int j = 0; j < N; j++)
			{
				if(arr[j] >= i)
				{
					System.out.print("* ");
					
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		
		
	}

}
