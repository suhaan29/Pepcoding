package pepcoding.arrayQ;

import java.util.Scanner;

public class ConvertToClass { //meant to be convert to decimal 
	
	public static void main(String[] args)
	{
		int number;
		int base;
		
		Scanner s = new Scanner(System.in);
		
		number = s.nextInt();
		base = s.nextInt();
		
		int sum = 0;
		int power = 0;
		
		while(number > 0)
		{
			int r = number % 10;
			number /= 10;
			
			sum += r * Math.pow(base, power);
			power++;
		}
		
		System.out.println(sum);
		
		s.close();
		
	}
	

}
