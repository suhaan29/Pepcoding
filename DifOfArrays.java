package pepcoding.arrayQ;
import java.util.Scanner;
public class DifOfArrays {
	
	public static void main(String[] args) {
		int n1;
		int n2;
		Scanner s = new Scanner(System.in);
		n1 = s.nextInt();
		int[] a1 = new int[n1];
		
		
	
		for(int i = 0; i < n1 ;i++)
		{
			a1[i] = s.nextInt();
		}
		
		
		n2 = s.nextInt();
		int[] b1 = new int[n2];
		
		for(int i = 0; i < n2 ;i++)
		{
			b1[i] = s.nextInt();
		}
		
		int[] c1 = new int[n1 > n2 ? n1 : n2];
		int c = 0;
		
	    int i = a1.length - 1;
	    int j = b1.length - 1;
	    int k = c1.length - 1;
	    
	    while(i >= 0 || j >= 0)
	    {
	    	int d = 0;
	    	if(i >= 0) {
	    		d += a1[i];
	    	}
	    	if(j >= 0) {
	    		d -= b1[j];
	    	}
	    	
	    	d -= c;
	    	if(d < 0) {
	    		d += 10;
	    		c = 1;
	    	}
	    	else c = 0;
	    	
	    	c1[k] = d;
	    	i--;
	    	j--;
	    	k--;
	    }
	    if(c == 1)
	    {
	    	c1[0] = a1[0] - b1[0];
	    }
		for(int var : c1)
		{
			System.out.println(var);
		}
	}

}
