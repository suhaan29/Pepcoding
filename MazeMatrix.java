package pepcoding.arrayQ;

public class MazeMatrix {
	
	public static void main(String[] args) {
		
		int[][] arr = {
				
				
				{ 0 , 0 , 1,  0 },
				
				{ 1 , 0 , 0 , 0 },
				
				{ 0 , 0 , 0 , 0 },
				
				{ 1 , 0 , 1 , 0 }
				
			};
		
		int minR = 0;
		int minC = 0;
		
		int maxR = arr.length;
		int maxC = arr[0].length;
		
	
		
		x : while(true) {
			
			//right
			
			for(int i = minC,j = minR; i < maxC; i++) {
				if(arr[j][i] == 1) {
					minR++;
					minC = i;
					break;
				}
				if(i == maxC - 1) {
					System.out.println(j + " " + i);
					break x;
				}
			}
			
			
			
			//down
			
			for(int i = minR,j = minC; i < maxR; i++) {
				if(arr[i][j] == 1) {
					minC--;
					minR = i;
					break;
				}
				if(i == maxR - 1) {
					System.out.println(i + " " + j);
					break x;
				}
			}
			
			
			
			//left
			
			for(int i = minC,j = minR; i >= 0; i--) {
				if(arr[j][i] == 1) {
					minR--;
					minC = i;
					break;
				}
				if(i == 0) {
					System.out.println(j + " " + i);
					break x;
				}
			}
			
			
			
			//up
			
			for(int i = minR,j = minC; i >= 0; i--) {
				if(arr[i][j] == 1) {
					minC++;
					minR = i;
					break;
				}
				if(i == 0) {
					System.out.println(i + " " + j);
					break x;
				}
			}
			
		}
		
	}

}
