package pepcoding.arrayQ;

public class findFirstIndex {
	
	public static int findFirstindex(int n, int[] arr, int x)
	{
		if(n == arr.length - 1)
		{
			if(arr[n] == x)
			{
				return n;
			}else
				return -1;
		}
		if(arr[n] == x)
		{
			return n;
		}
		else
		 return findFirstindex(n + 1, arr, x);
		
	}
	
	public static void main(String[] args)
	{
		int n = 5;
		
		int[] arr = { 2, 4, 2 , 1 , 1};
		
		int x = 1;
		
		n--;
		
		System.out.println(findFirstindex( 0, arr, x));
	}

}
