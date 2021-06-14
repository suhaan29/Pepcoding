package pepcoding.arrayQ;
import java.util.*;
public class MobileCode {
	
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		String a = scn.next();
		
		System.out.println(getF(a));
	}

	static String[] codes = {".;" ,"abc" , "def" , "ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz" };
	
	public static ArrayList<String> getF(String a)
	{
		if(a.length() == 0)
		{
			ArrayList<String> bes = new ArrayList<>();
			bes.add(" ");
			return bes;
		}
		char ch = a.charAt(0);
		ArrayList<String> res = getF(a.substring(1));
		
		ArrayList<String> mres  = new ArrayList<>();
		
		int ba = Character.getNumericValue(ch);
		
		int x = codes[ba].length();
		
		for(int i = 0; i < codes[ba].length(); i++)
		{
			char codeword = codes[ba].charAt(i);
			
			for(String r : res)
			{
				mres.add(codeword + r);
			}
		}
		
		return mres;
	}
}
