package pepcoding.arrayQ;
import java.util.*;

public class FloodFill {
	
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		
		int n;
		int m;
		n = scn.nextInt();
		m = scn.nextInt();
		
		int[][] arr = new int[n][m];
		boolean[][] filled = new boolean[n][m];
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				arr[i][j] = scn.nextInt();
			}
		}
		
		flood(arr, 0, 0, " ", filled);
	}
	
	public static void flood(int[][] arr, int row, int col, String dir, boolean[][] isFilled) //tlbr
	{
		if(row < 0 || col < 0 || row >= arr.length || col >= arr[0].length || arr[row][col] == 1 || isFilled[row][col] == true)
		{
			return;
		}
		
		if(row == arr.length - 1 && col == arr[0].length - 1)
		{
			System.out.println(dir);
			return;
		}
		isFilled[row][col] = true;
		flood(arr, row - 1, col, dir + "t", isFilled); ///top
		flood(arr, row, col - 1, dir + "l", isFilled);  //left
		flood(arr, row + 1, col, dir + "b", isFilled);  //bottom
		flood(arr, row, col + 1, dir + "r", isFilled);//right
		isFilled[row][col] = false;
	}

}
