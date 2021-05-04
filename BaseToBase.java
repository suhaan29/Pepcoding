package pepcoding.arrayQ;

import java.util.Scanner;

public class BaseToBase {
	
	public static void main(String[] args)
	{
		int number;
		int base;
		int baseTwo;
		
		Scanner s = new Scanner(System.in);
		
		number = s.nextInt();
		base = s.nextInt();
		baseTwo = s.nextInt();
		
		int sum = 0;
		int power = 0;
		
		while(number > 0)
		{
			int r = number % 10;
			number /= 10;
			
			sum += r * Math.pow(base, power);
			power++;
		}
		
		System.out.println(sum); //this is the decimal value of the first base now convert this into second base value
		int sumTwo = 0;
		int pw = 1;
		while(sum > 0)
		{
			int r = sum % baseTwo;
			sum /= baseTwo;
			
			sumTwo += r * pw;
			pw *= 10;
		}
		
		System.out.println(sumTwo);
		
		s.close();
		
	}

}
