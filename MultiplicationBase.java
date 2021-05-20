package pepcoding.arrayQ;

import java.util.Scanner;

public class MultiplicationBase {
	

	public static int baseAddition(int b, int n, int m)
	
	{
		int sum = 0;
		int p = 1;
		int c = 0;
		
		while(n > 0 || m > 0 || c > 0) {
		
			int D1 = n % 10;
			int D2 = m % 10;
			n /= 10;
			m /= 10;
			
			int s = D1 + D2 + c;
			
			int r = s % b;
			c = s / b;
			sum += r * p;
			p *= 10;
		}
		
		return sum;
	}

	
	public static int multiplyOne(int b, int n, int d)
	{
		int rv = 0;
		int c = 0;
		int p = 1;
		while(n > 0 || c > 0)
		{
			int d1 = n % 10;
			n /= 10;
			
			int v = d * d1 + c;
			
			int r = v % b;
			c = v / b;
			
			rv += r * p;
			p *= 10;
			
			
		}
		
		return rv;
	}
	
	public static void main(String[] args)
	{
		int base;
		int num;
		int num2;
		
		Scanner s = new Scanner(System.in);
		
		base = s.nextInt();
		num = s.nextInt();
		num2 = s.nextInt();
		
		int p = 1;
		int rv = 0;
		
		while(num2 > 0) {
			
			int d = num2 % 10;
			
			num2 /= 10;
			
			
			int value = multiplyOne(base, num, d);	
			 rv = baseAddition(base, rv , value * p );
			 p *= 10;
			
			
		}
		
		System.out.println(rv);
		
		s.close();

	}

}
