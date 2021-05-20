package pepcoding.arrayQ;

import java.util.Scanner;

public class ConvertToBase {
	
	
	
	public static void main(String[] args)
	{
		int n; //the decimal value
		int b; //base
		
		Scanner s = new Scanner(System.in); //system,in means you are reading from console
		
		n = s.nextInt();
		b = s.nextInt();
		
		int sa = 0;
		int p = 1;
		while(n > 0) {
			int r = n % b;
			n /= b;
			
			sa += r * p;
			p *= 10;
		}
		
		System.out.println(sa);
		s.close();
	}

}
