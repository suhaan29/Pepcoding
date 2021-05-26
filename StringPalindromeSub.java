package pepcoding.arrayQ;

import java.util.Scanner;

public class StringPalindromeSub {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String p = s.next();
		
		int n = p.length();
		
		for(int i = 0; i <= n - 1; i++)
		{
			for(int j = i + 1; j <=n ; j++) {
				
			
				String s2 = p.substring(i, j);
				int flag = 0;
				int m = s2.length() - 1;
				for(int k = 0; k <= s2.length()/2 ; k++) {
					if(s2.charAt(k) != s2.charAt(m)) {
						flag = 1;
						break;
					}
					m--;
				}
				
				if(flag == 0)
				{
					System.out.println(s2);
				}
			
				
				
				
			}
		}
	}

}
