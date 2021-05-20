package pepcoding.arrayQ;
import java.util.Scanner;

public class SpanOfArray {
	
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
		int min = arr[0];
		
	for(int a = 0; a < N; a++ )
	{
		if(arr[a] < min)
		{
			min = arr[a];
		}
		
		if(arr[a] > max)
		{
			max = arr[a];
		}
	}
	
	int x = max - min;
	System.out.println(x);
	n.close();
		
	}

}
