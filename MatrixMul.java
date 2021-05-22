package pepcoding.arrayQ;

public class MatrixMul {
	
	public static void main(String[] args) {
	
	int[][] a = { {1, 2} , {3, 4} , {5, 6}};
	int[][] b = { {1, 1} , {1 , 1} };
	
	int[][] res = new int[a.length][b[0].length]; //this will be resultant matrix;
	
	int firstColumns = a[0].length;
	int secondRow = b.length;
	
	                  if(firstColumns == secondRow) {
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b[0].length; j++)
			{
				for(int c = 0; c < a[0].length; c++)
				{
					res[i][j] += a[i][c] * b[c][j];
				}
			}
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b[0].length; j++) {
				System.out.println(res[i][j]);
			}
		}
		
		
		
	}
	else {
		System.out.println("Sorry, the matrices are not compatible so they cannot be multiplied");
	}
}

}
