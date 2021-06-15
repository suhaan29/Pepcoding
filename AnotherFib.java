package pepcoding.arrayQ;

public class AnotherFib {
	
	public static void main(String[] args)
	{
		int n = 14;
		
		System.out.println("0\n1");
		
		int a =0;
		int b = 1;
		int nf = 0;
		
		for(int i = 1 ; i < n ; i++)
		{
			nf = a + b;
			System.out.println(nf);
			a = b;
			b = nf;
		}
		
		int r = nf % 10;
		System.out.println(r);
	}

}
