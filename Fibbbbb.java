package pepcoding.arrayQ;

public class Fibbbbb {
	
	public static void main(String[] args)
	{
		int n = 5;
		
		int sum = 0;
		int a = 0;
		int b = 1;
		int nf = 0;
		System.out.println("0  \n1");
		for(int i = 0; i < n; i++)
		{
			nf = a + b;
			sum = sum + b;
			a = b;
			b = nf;
			
		}
		System.out.println(sum);
	}

}
