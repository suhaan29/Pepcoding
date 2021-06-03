package pepcoding.arrayQ;

public class PrintArrayRecursionReverse {
	
	public static void printArr(int n , int[] arr)
	{
		if(n == 0)
		{
			return;
		}
		System.out.println(arr[n-1]);
		printArr(n - 1, arr);
	}

	public static void main(String[] args)
	{
		int n = 5;
		
		int arr[] = { 1, 2, 3, 4, 5 };
		
		printArr(n , arr);
	}
}
