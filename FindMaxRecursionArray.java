package pepcoding.arrayQ;

public class FindMaxRecursionArray {
	
	public static int findMax(int n, int[] arr)
	{
		if(n == 0)
		{
			return arr[0];
		}
		int max = findMax( n - 1, arr);
		if(arr[n] > max)
		{
			return arr[n];
		}
		else
			return max;
	}

	public static void main(String[] args)
	{
		
		int n  = 5;
		int[] arr = { 23 ,55,1, 66, 3};
		n -= 1;
		System.out.println(findMax(n , arr));
		
		
	}
}
