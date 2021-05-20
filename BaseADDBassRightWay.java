package pepcoding.arrayQ;

import java.util.Scanner;

public class BaseADDBassRightWay {
	
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

	public static void main(String[] args)
	{
		int base;
		int numberOne;
		int numberTwo;
		
		Scanner s = new Scanner(System.in);
		base = s.nextInt();
		numberOne = s.nextInt();
		numberTwo = s.nextInt();
		
		System.out.println(baseAddition(base, numberOne, numberTwo));
		
		s.close();
	}

}
