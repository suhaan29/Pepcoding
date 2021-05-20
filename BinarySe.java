package pepcoding.arrayQ;

public class BinarySe {
	
	public static void main(String[] args)
	{
		
		//binary search only works for a sorted array
	
		int arr[] = {12, 14, 18, 24, 34, 90, 100 , 190};
		
		int high = arr.length - 1;
		int low = 0;
	
		
		int e = 18;
		
		while(low <= high) {
			
			int mid = (high + low) / 2;
			if(e == arr[mid]) {
				System.out.println("the element is at index : " + mid);
				break;
			}
			else if(e > arr[mid]) {
				low = mid + 1;
			}
			else high = mid - 1;
			
		}
		
		
	

}
}