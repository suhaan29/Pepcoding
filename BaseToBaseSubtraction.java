package pepcoding.arrayQ;

import java.util.Scanner;

public class BaseToBaseSubtraction {

    public static int sub(int b, int n, int m){
        int dif = 0;
        int p = 1;
        int c = 0;
        
        while(m > 0 || n > 0 || c > 0)
        {
            int d1 = n % 10;
            int d2 = m % 10;
            n /= 10; 
            m /= 10;
            
            int d = d1 - d2 - c;
            
            if(d < 0)
            {
                d += b;
                c = 1;
            }
            else {
                c = 0;
            }
            
            dif += d * p;
            p *= 10;
        }
        
        return dif;
    }
    
	public static void main(String[] args) {
		int base;
		int num;
		int num2;
		
		Scanner s = new Scanner(System.in);
		
		base = s.nextInt();
		num =  s.nextInt();
		num2 = s.nextInt();
		
		System.out.println(sub(base, num, num2));
		s.close();
	}
}
