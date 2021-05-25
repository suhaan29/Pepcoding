package pepcoding.arrayQ;

public class SearchIn2s {
	
	public static void main(String[] args) {
		
		int[][] arr = 
				
			  { { 11, 12, 13 , 14, 15 , 16 },
				{ 21, 22, 23 , 24, 25 , 26 },
				{ 31, 32, 33 , 34, 35 , 36 },
				{ 41, 42, 43 , 44, 45 , 46 },
				{ 51, 52, 53 , 54, 55 , 56 },
				{ 61, 62, 63 , 64, 65 , 66 },
				
		};
		
		
		int i = 0;
		int j = arr[0].length - 1;
		
		int x = 37;
		
		while(i < arr.length && j >= 0){
	         if(x == arr[i][j]){
	            System.out.println(i);
	            System.out.println(j);
	            return;
	         } else if(x > arr[i][j]){
	            i++;
	         } else {
	            j--;
	         }
	      }

	      System.out.println("Not Found");
	   }
		
	}


