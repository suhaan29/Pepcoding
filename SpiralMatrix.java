package pepcoding.arrayQ;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] arr= {
				{ 1, 2, 3} ,
				{ 11, 12 , 13},
				{21 , 22, 23 }
		};
		
		int minR = 0;
		int minC = 0;
		int maxR = arr.length - 1;
		int maxC = arr[0].length - 1;
		
		int total = arr.length * arr[0].length;
		int count = 0;
		
		while(count < total) {
			
			//left
			for(int i = minR, j = minC; i <= maxR && count < total; i++) {
				System.out.println(arr[i][j]);
				count++;
			}
			minC++;
			
			
			
			//bottom
			for(int i = minC, j = maxR; i <= maxC && count < total; i++) {
				System.out.println(arr[j][i]);
				count++;
			}
			
			maxR--;
			
			
			//right
			for(int i = maxR, j = maxC; i >= minR && count < total; i--) {
				System.out.println(arr[i][j]);
				count++;
			}
			maxC--;
			
			
			
			//top
			for(int i = maxC, j = minR; i >= maxC && count < total; i--) {
				System.out.println(arr[j][i]);
				count++;
			}
			minR++;
			
		}
	}
	
}
