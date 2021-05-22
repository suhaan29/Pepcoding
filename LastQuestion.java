package pepcoding.arrayQ;

public class LastQuestion {
	
	public static void main(String[] args) {
		
		int arr[] = { 2, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 , 6 , 6};
		int n = 5;
		
		int fIndex = 0;
		int LIndex = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == n) {
				if(fIndex == 0) {fIndex = i;}
				
				LIndex = i;
				
			}
		}
		
		System.out.println(fIndex + " " + LIndex);
	}

}
