package pepcoding.arrayQ;

import java.util.*;

public class BaseAdditionWithAnotherBase {
	
	
	public static int convertToBase(int base, int num)
	{
		int sum = 0;
		int p = 1;
		
		while(num > 0)
		{
			int r = num % base;
			num /= base;
			
			sum += r * p;
			p *= 10;
		}
		
		return sum;
	}
	
	public static int convertToDecimal(int num, int base) {
		
		int sum = 0;
		int power = 0;
		while(num > 0)
		{
			int r = num % 10;
			num /= 10;
			
			sum += r * Math.pow(base, power);
			power++;
			
		}
		
		return sum;
	}
	
	public static int baseAddition(int b, int n, int m)
	{
		int a = convertToDecimal(n, b);
		int ba = convertToDecimal(m, b);
		
		int c = a + ba;
		
		int d = convertToBase(b, c);
		
		return d;
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
