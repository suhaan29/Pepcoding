package pepcoding.arrayQ;

public class SaddlePrice {
	
	public static void main(String[] args)
	{
		int[][] arr = 
				
			  { { 11, 12, 13 , 14, 15 , 16 },
				{ 21, 22, 23 , 24, 25 , 26 },
				{ 31, 32, 33 , 34, 35 , 36 },
				{ 41, 42, 43 , 44, 45 , 46 },
				{ 51, 52, 53 , 54, 55 , 56 },
				{ 61, 62, 63 , 64, 65 , 66 },
				
		};
		
		int max = 0;
		
		for(int i = 0; i < arr.length; i++)
		{ 
			int min = arr[i][0];
			int x = 0;
			for(int j = 0; j < arr[0].length; j++)
			{
				
				if(arr[i][j] < min)
				{
					min = arr[i][j];
					x = j;
				}
				
				
			
			}
			
			for(int k = 0; k < arr.length; k++) {
				if(min < arr[k][x]) {
					break;
				}
				
				else {
					System.out.println("this is it");
				}
			}
			
		}
		
		System.out.println(max);
	}

}
